import minipython.analysis.*;
import minipython.node.*;

import java.util.*;

/* Visitor used for a first pass of the example file.
Stores the function definitions encountered, as well as the variables declared for later
analysis on the second pass */
public class myvisitor extends DepthFirstAdapter {

    private Hashtable<String, List<FunctionArgs>> functions; //table used for function definitions
    private Hashtable<String, Type> vars;

    myvisitor(Hashtable functions, Hashtable vars) {
        this.functions = functions;
        this.vars = vars;
    }

    FunctionArgs temp;

    @Override
    public void inAFunction(AFunction node) {
        System.out.println("In a function");
        String fName = extractId(node.getIdentifier()).toString();
        temp = new FunctionArgs(fName);
        int line = extractId(node.getIdentifier()).getLine();
        if (functions.containsKey(fName)) {
            List<FunctionArgs> fnames = functions.get(fName);
            for (FunctionArgs args : fnames) {
                if (args.getArgs().size() == temp.getArgs().size()) {
                    System.out.println("Line " + line + ": " + " Function " + fName + " is already defined");
                    return;
                }
            }
            functions.get(fName).add(temp);
        } else {
            List<FunctionArgs> newArgs = new ArrayList<>();
            newArgs.add(temp);
            functions.put(fName, newArgs);
        }
    }


    @Override
    public void inASingleArgument(ASingleArgument node)
    {
        TId id = extractId(node.getIdentifier());
        temp.args.put(id.toString(), Type.NONE);
        vars.put(id.toString(), Type.NONE);
    }

    public void inASingleAssignArgument(ASingleAssignArgument node)
    {
        TId id = extractId(node.getIdentifier());
        Type type = findVariableType(node.getValue());
        temp.args.put(id.toString(), type);
        vars.put(id.toString(), type);
    }

    private TId extractId(PIdentifier identifier){
        return ((AIdentifier) identifier).getId();
    }

    private Type findVariableType(PValue value){
        if(value instanceof AFuncCallValue)
            return Type.FUNCTION;
        else if(value instanceof ANegNumValue)
            return Type.NUMBER;
        else if(value instanceof  APosNumValue)
            return Type.NUMBER;
        else if(value instanceof AStringValue)
            return Type.STRING;
        else
            return Type.NONE;
    }



}
