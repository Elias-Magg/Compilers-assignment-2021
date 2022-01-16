import minipython.analysis.DepthFirstAdapter;
import minipython.node.AArraycellStatement;
import minipython.node.AAssignStatement;
import minipython.node.AFunctionCall;
import minipython.node.PValue;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/* This visitor is used in the second passing.
Given the function and variable definitions found in the first passing,
we will check if a variable has been declared before its use, as well as
if the arguments passed in a function match its definition.
 */
public class SecondVisitor extends DepthFirstAdapter {
    //first two tables are partially filled from the first passing
    private Hashtable<String, List<FunctionArgs>> functions; //table used for function definitions
    private Hashtable<String, Type> vars;
    //table used when we encounter a function call
    private Hashtable<String, FunCall> fcalls;

    private FunCall currentFunc; //keep the most recently found function definition

    public SecondVisitor(Hashtable<String, List<FunctionArgs>> functions, Hashtable<String, Type> vars, Hashtable<String, FunCall> fcalls) {
        this.functions = functions;
        this.vars = vars;
        this.fcalls = fcalls;
    }

    //Assignment statements
    @Override
    public void inAAssignStatement(AAssignStatement node)
    {
        String varName = Utils.extractId(node.getIdentifier()).toString();
        Type type = Utils.extractType(node.getExpression(), functions, vars, currentFunc);
        vars.put(varName, type);
    }

    @Override
    public void inAArraycellStatement(AArraycellStatement node)
    {
        String varName = Utils.extractId(node.getIdentifier()).toString();
        Type type = Utils.extractType(node.getVal(), functions, vars, currentFunc);
        vars.put(varName, type);
    }

    @Override
    public void inAFunctionCall(AFunctionCall node)
    {
        currentFunc = new FunCall(Utils.extractId(node.getIdentifier()).toString());
    }

    class FunCall
    {
        ArrayList<Type> args;
        String name;

        FunCall(String name)
        {
            this.name = name;
            this.args = new ArrayList<>();
        }
    }
}
