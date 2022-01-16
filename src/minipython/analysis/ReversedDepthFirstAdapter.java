/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.analysis;

import minipython.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(Node node)
    {
    }

    public void defaultOut(Node node)
    {
    }

    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPGoal().apply(this);
        outStart(node);
    }

    public void inAGoal(AGoal node)
    {
        defaultIn(node);
    }

    public void outAGoal(AGoal node)
    {
        defaultOut(node);
    }

    public void caseAGoal(AGoal node)
    {
        inAGoal(node);
        {
            Object temp[] = node.getCommand().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PCommand) temp[i]).apply(this);
            }
        }
        outAGoal(node);
    }

    public void inAFunctionCommand(AFunctionCommand node)
    {
        defaultIn(node);
    }

    public void outAFunctionCommand(AFunctionCommand node)
    {
        defaultOut(node);
    }

    public void caseAFunctionCommand(AFunctionCommand node)
    {
        inAFunctionCommand(node);
        if(node.getFunction() != null)
        {
            node.getFunction().apply(this);
        }
        outAFunctionCommand(node);
    }

    public void inAStatementCommand(AStatementCommand node)
    {
        defaultIn(node);
    }

    public void outAStatementCommand(AStatementCommand node)
    {
        defaultOut(node);
    }

    public void caseAStatementCommand(AStatementCommand node)
    {
        inAStatementCommand(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outAStatementCommand(node);
    }

    public void inAFunction(AFunction node)
    {
        defaultIn(node);
    }

    public void outAFunction(AFunction node)
    {
        defaultOut(node);
    }

    public void caseAFunction(AFunction node)
    {
        inAFunction(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        if(node.getArgument() != null)
        {
            node.getArgument().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAFunction(node);
    }

    public void inASingleAssignArgument(ASingleAssignArgument node)
    {
        defaultIn(node);
    }

    public void outASingleAssignArgument(ASingleAssignArgument node)
    {
        defaultOut(node);
    }

    public void caseASingleAssignArgument(ASingleAssignArgument node)
    {
        inASingleAssignArgument(node);
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outASingleAssignArgument(node);
    }

    public void inASingleArgument(ASingleArgument node)
    {
        defaultIn(node);
    }

    public void outASingleArgument(ASingleArgument node)
    {
        defaultOut(node);
    }

    public void caseASingleArgument(ASingleArgument node)
    {
        inASingleArgument(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outASingleArgument(node);
    }

    public void inAManyArgument(AManyArgument node)
    {
        defaultIn(node);
    }

    public void outAManyArgument(AManyArgument node)
    {
        defaultOut(node);
    }

    public void caseAManyArgument(AManyArgument node)
    {
        inAManyArgument(node);
        if(node.getA2() != null)
        {
            node.getA2().apply(this);
        }
        if(node.getA1() != null)
        {
            node.getA1().apply(this);
        }
        outAManyArgument(node);
    }

    public void inAIdAssign(AIdAssign node)
    {
        defaultIn(node);
    }

    public void outAIdAssign(AIdAssign node)
    {
        defaultOut(node);
    }

    public void caseAIdAssign(AIdAssign node)
    {
        inAIdAssign(node);
        {
            Object temp[] = node.getValue().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PValue) temp[i]).apply(this);
            }
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdAssign(node);
    }

    public void inAIfStatement(AIfStatement node)
    {
        defaultIn(node);
    }

    public void outAIfStatement(AIfStatement node)
    {
        defaultOut(node);
    }

    public void caseAIfStatement(AIfStatement node)
    {
        inAIfStatement(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        if(node.getComparison() != null)
        {
            node.getComparison().apply(this);
        }
        outAIfStatement(node);
    }

    public void inAWhileStatement(AWhileStatement node)
    {
        defaultIn(node);
    }

    public void outAWhileStatement(AWhileStatement node)
    {
        defaultOut(node);
    }

    public void caseAWhileStatement(AWhileStatement node)
    {
        inAWhileStatement(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        if(node.getComparison() != null)
        {
            node.getComparison().apply(this);
        }
        outAWhileStatement(node);
    }

    public void inAForStatement(AForStatement node)
    {
        defaultIn(node);
    }

    public void outAForStatement(AForStatement node)
    {
        defaultOut(node);
    }

    public void caseAForStatement(AForStatement node)
    {
        inAForStatement(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outAForStatement(node);
    }

    public void inAReturnStatement(AReturnStatement node)
    {
        defaultIn(node);
    }

    public void outAReturnStatement(AReturnStatement node)
    {
        defaultOut(node);
    }

    public void caseAReturnStatement(AReturnStatement node)
    {
        inAReturnStatement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAReturnStatement(node);
    }

    public void inAPrintStatement(APrintStatement node)
    {
        defaultIn(node);
    }

    public void outAPrintStatement(APrintStatement node)
    {
        defaultOut(node);
    }

    public void caseAPrintStatement(APrintStatement node)
    {
        inAPrintStatement(node);
        if(node.getArglist() != null)
        {
            node.getArglist().apply(this);
        }
        outAPrintStatement(node);
    }

    public void inAAssignStatement(AAssignStatement node)
    {
        defaultIn(node);
    }

    public void outAAssignStatement(AAssignStatement node)
    {
        defaultOut(node);
    }

    public void caseAAssignStatement(AAssignStatement node)
    {
        inAAssignStatement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAAssignStatement(node);
    }

    public void inAMineqStatement(AMineqStatement node)
    {
        defaultIn(node);
    }

    public void outAMineqStatement(AMineqStatement node)
    {
        defaultOut(node);
    }

    public void caseAMineqStatement(AMineqStatement node)
    {
        inAMineqStatement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAMineqStatement(node);
    }

    public void inADiveqStatement(ADiveqStatement node)
    {
        defaultIn(node);
    }

    public void outADiveqStatement(ADiveqStatement node)
    {
        defaultOut(node);
    }

    public void caseADiveqStatement(ADiveqStatement node)
    {
        inADiveqStatement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outADiveqStatement(node);
    }

    public void inAArraycellStatement(AArraycellStatement node)
    {
        defaultIn(node);
    }

    public void outAArraycellStatement(AArraycellStatement node)
    {
        defaultOut(node);
    }

    public void caseAArraycellStatement(AArraycellStatement node)
    {
        inAArraycellStatement(node);
        if(node.getVal() != null)
        {
            node.getVal().apply(this);
        }
        if(node.getIndex() != null)
        {
            node.getIndex().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAArraycellStatement(node);
    }

    public void inAAssertStatement(AAssertStatement node)
    {
        defaultIn(node);
    }

    public void outAAssertStatement(AAssertStatement node)
    {
        defaultOut(node);
    }

    public void caseAAssertStatement(AAssertStatement node)
    {
        inAAssertStatement(node);
        {
            Object temp[] = node.getRpar().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PExpression) temp[i]).apply(this);
            }
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outAAssertStatement(node);
    }

    public void inAFunctioncallStatement(AFunctioncallStatement node)
    {
        defaultIn(node);
    }

    public void outAFunctioncallStatement(AFunctioncallStatement node)
    {
        defaultOut(node);
    }

    public void caseAFunctioncallStatement(AFunctioncallStatement node)
    {
        inAFunctioncallStatement(node);
        if(node.getFunctionCall() != null)
        {
            node.getFunctionCall().apply(this);
        }
        outAFunctioncallStatement(node);
    }

    public void inAImportStatement(AImportStatement node)
    {
        defaultIn(node);
    }

    public void outAImportStatement(AImportStatement node)
    {
        defaultOut(node);
    }

    public void caseAImportStatement(AImportStatement node)
    {
        inAImportStatement(node);
        if(node.getImportPackage() != null)
        {
            node.getImportPackage().apply(this);
        }
        outAImportStatement(node);
    }

    public void inAOneArglist(AOneArglist node)
    {
        defaultIn(node);
    }

    public void outAOneArglist(AOneArglist node)
    {
        defaultOut(node);
    }

    public void caseAOneArglist(AOneArglist node)
    {
        inAOneArglist(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAOneArglist(node);
    }

    public void inAManyArglist(AManyArglist node)
    {
        defaultIn(node);
    }

    public void outAManyArglist(AManyArglist node)
    {
        defaultOut(node);
    }

    public void caseAManyArglist(AManyArglist node)
    {
        inAManyArglist(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getArglist() != null)
        {
            node.getArglist().apply(this);
        }
        outAManyArglist(node);
    }

    public void inAAndcComparison(AAndcComparison node)
    {
        defaultIn(node);
    }

    public void outAAndcComparison(AAndcComparison node)
    {
        defaultOut(node);
    }

    public void caseAAndcComparison(AAndcComparison node)
    {
        inAAndcComparison(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outAAndcComparison(node);
    }

    public void inAOrcComparison(AOrcComparison node)
    {
        defaultIn(node);
    }

    public void outAOrcComparison(AOrcComparison node)
    {
        defaultOut(node);
    }

    public void caseAOrcComparison(AOrcComparison node)
    {
        inAOrcComparison(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outAOrcComparison(node);
    }

    public void inANotcComparison(ANotcComparison node)
    {
        defaultIn(node);
    }

    public void outANotcComparison(ANotcComparison node)
    {
        defaultOut(node);
    }

    public void caseANotcComparison(ANotcComparison node)
    {
        inANotcComparison(node);
        if(node.getComparison() != null)
        {
            node.getComparison().apply(this);
        }
        outANotcComparison(node);
    }

    public void inALesscComparison(ALesscComparison node)
    {
        defaultIn(node);
    }

    public void outALesscComparison(ALesscComparison node)
    {
        defaultOut(node);
    }

    public void caseALesscComparison(ALesscComparison node)
    {
        inALesscComparison(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outALesscComparison(node);
    }

    public void inAGreatcComparison(AGreatcComparison node)
    {
        defaultIn(node);
    }

    public void outAGreatcComparison(AGreatcComparison node)
    {
        defaultOut(node);
    }

    public void caseAGreatcComparison(AGreatcComparison node)
    {
        inAGreatcComparison(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outAGreatcComparison(node);
    }

    public void inALeqcComparison(ALeqcComparison node)
    {
        defaultIn(node);
    }

    public void outALeqcComparison(ALeqcComparison node)
    {
        defaultOut(node);
    }

    public void caseALeqcComparison(ALeqcComparison node)
    {
        inALeqcComparison(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outALeqcComparison(node);
    }

    public void inAGeqcComparison(AGeqcComparison node)
    {
        defaultIn(node);
    }

    public void outAGeqcComparison(AGeqcComparison node)
    {
        defaultOut(node);
    }

    public void caseAGeqcComparison(AGeqcComparison node)
    {
        inAGeqcComparison(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outAGeqcComparison(node);
    }

    public void inANeqcComparison(ANeqcComparison node)
    {
        defaultIn(node);
    }

    public void outANeqcComparison(ANeqcComparison node)
    {
        defaultOut(node);
    }

    public void caseANeqcComparison(ANeqcComparison node)
    {
        inANeqcComparison(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outANeqcComparison(node);
    }

    public void inAEqcComparison(AEqcComparison node)
    {
        defaultIn(node);
    }

    public void outAEqcComparison(AEqcComparison node)
    {
        defaultOut(node);
    }

    public void caseAEqcComparison(AEqcComparison node)
    {
        inAEqcComparison(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outAEqcComparison(node);
    }

    public void inATrueComparison(ATrueComparison node)
    {
        defaultIn(node);
    }

    public void outATrueComparison(ATrueComparison node)
    {
        defaultOut(node);
    }

    public void caseATrueComparison(ATrueComparison node)
    {
        inATrueComparison(node);
        outATrueComparison(node);
    }

    public void inAFalseComparison(AFalseComparison node)
    {
        defaultIn(node);
    }

    public void outAFalseComparison(AFalseComparison node)
    {
        defaultOut(node);
    }

    public void caseAFalseComparison(AFalseComparison node)
    {
        inAFalseComparison(node);
        outAFalseComparison(node);
    }

    public void inAAdditionExpression(AAdditionExpression node)
    {
        defaultIn(node);
    }

    public void outAAdditionExpression(AAdditionExpression node)
    {
        defaultOut(node);
    }

    public void caseAAdditionExpression(AAdditionExpression node)
    {
        inAAdditionExpression(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outAAdditionExpression(node);
    }

    public void inASubtractionExpression(ASubtractionExpression node)
    {
        defaultIn(node);
    }

    public void outASubtractionExpression(ASubtractionExpression node)
    {
        defaultOut(node);
    }

    public void caseASubtractionExpression(ASubtractionExpression node)
    {
        inASubtractionExpression(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outASubtractionExpression(node);
    }

    public void inAMultiplicationExpression(AMultiplicationExpression node)
    {
        defaultIn(node);
    }

    public void outAMultiplicationExpression(AMultiplicationExpression node)
    {
        defaultOut(node);
    }

    public void caseAMultiplicationExpression(AMultiplicationExpression node)
    {
        inAMultiplicationExpression(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outAMultiplicationExpression(node);
    }

    public void inADivisionExpression(ADivisionExpression node)
    {
        defaultIn(node);
    }

    public void outADivisionExpression(ADivisionExpression node)
    {
        defaultOut(node);
    }

    public void caseADivisionExpression(ADivisionExpression node)
    {
        inADivisionExpression(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outADivisionExpression(node);
    }

    public void inAModuloExpression(AModuloExpression node)
    {
        defaultIn(node);
    }

    public void outAModuloExpression(AModuloExpression node)
    {
        defaultOut(node);
    }

    public void caseAModuloExpression(AModuloExpression node)
    {
        inAModuloExpression(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outAModuloExpression(node);
    }

    public void inAExponentiationExpression(AExponentiationExpression node)
    {
        defaultIn(node);
    }

    public void outAExponentiationExpression(AExponentiationExpression node)
    {
        defaultOut(node);
    }

    public void caseAExponentiationExpression(AExponentiationExpression node)
    {
        inAExponentiationExpression(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outAExponentiationExpression(node);
    }

    public void inAListExpressionExpression(AListExpressionExpression node)
    {
        defaultIn(node);
    }

    public void outAListExpressionExpression(AListExpressionExpression node)
    {
        defaultOut(node);
    }

    public void caseAListExpressionExpression(AListExpressionExpression node)
    {
        inAListExpressionExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAListExpressionExpression(node);
    }

    public void inAFunctioncallExpression(AFunctioncallExpression node)
    {
        defaultIn(node);
    }

    public void outAFunctioncallExpression(AFunctioncallExpression node)
    {
        defaultOut(node);
    }

    public void caseAFunctioncallExpression(AFunctioncallExpression node)
    {
        inAFunctioncallExpression(node);
        if(node.getFunctionCall() != null)
        {
            node.getFunctionCall().apply(this);
        }
        outAFunctioncallExpression(node);
    }

    public void inAValueExpression(AValueExpression node)
    {
        defaultIn(node);
    }

    public void outAValueExpression(AValueExpression node)
    {
        defaultOut(node);
    }

    public void caseAValueExpression(AValueExpression node)
    {
        inAValueExpression(node);
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outAValueExpression(node);
    }

    public void inAIdentifierExpression(AIdentifierExpression node)
    {
        defaultIn(node);
    }

    public void outAIdentifierExpression(AIdentifierExpression node)
    {
        defaultOut(node);
    }

    public void caseAIdentifierExpression(AIdentifierExpression node)
    {
        inAIdentifierExpression(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdentifierExpression(node);
    }

    public void inALenExpression(ALenExpression node)
    {
        defaultIn(node);
    }

    public void outALenExpression(ALenExpression node)
    {
        defaultOut(node);
    }

    public void caseALenExpression(ALenExpression node)
    {
        inALenExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outALenExpression(node);
    }

    public void inAMaxExpression(AMaxExpression node)
    {
        defaultIn(node);
    }

    public void outAMaxExpression(AMaxExpression node)
    {
        defaultOut(node);
    }

    public void caseAMaxExpression(AMaxExpression node)
    {
        inAMaxExpression(node);
        {
            Object temp[] = node.getValue().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PValue) temp[i]).apply(this);
            }
        }
        if(node.getV1() != null)
        {
            node.getV1().apply(this);
        }
        outAMaxExpression(node);
    }

    public void inAMinExpression(AMinExpression node)
    {
        defaultIn(node);
    }

    public void outAMinExpression(AMinExpression node)
    {
        defaultOut(node);
    }

    public void caseAMinExpression(AMinExpression node)
    {
        inAMinExpression(node);
        {
            Object temp[] = node.getValue().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PValue) temp[i]).apply(this);
            }
        }
        if(node.getV1() != null)
        {
            node.getV1().apply(this);
        }
        outAMinExpression(node);
    }

    public void inAArrayExpression(AArrayExpression node)
    {
        defaultIn(node);
    }

    public void outAArrayExpression(AArrayExpression node)
    {
        defaultOut(node);
    }

    public void caseAArrayExpression(AArrayExpression node)
    {
        inAArrayExpression(node);
        if(node.getArrayExpression() != null)
        {
            node.getArrayExpression().apply(this);
        }
        outAArrayExpression(node);
    }

    public void inAParenthensesExpression(AParenthensesExpression node)
    {
        defaultIn(node);
    }

    public void outAParenthensesExpression(AParenthensesExpression node)
    {
        defaultOut(node);
    }

    public void caseAParenthensesExpression(AParenthensesExpression node)
    {
        inAParenthensesExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAParenthensesExpression(node);
    }

    public void inASingleArrayExpression(ASingleArrayExpression node)
    {
        defaultIn(node);
    }

    public void outASingleArrayExpression(ASingleArrayExpression node)
    {
        defaultOut(node);
    }

    public void caseASingleArrayExpression(ASingleArrayExpression node)
    {
        inASingleArrayExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outASingleArrayExpression(node);
    }

    public void inAManyArrayExpression(AManyArrayExpression node)
    {
        defaultIn(node);
    }

    public void outAManyArrayExpression(AManyArrayExpression node)
    {
        defaultOut(node);
    }

    public void caseAManyArrayExpression(AManyArrayExpression node)
    {
        inAManyArrayExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getArrayExpression() != null)
        {
            node.getArrayExpression().apply(this);
        }
        outAManyArrayExpression(node);
    }

    public void inASimpleImportImportPackage(ASimpleImportImportPackage node)
    {
        defaultIn(node);
    }

    public void outASimpleImportImportPackage(ASimpleImportImportPackage node)
    {
        defaultOut(node);
    }

    public void caseASimpleImportImportPackage(ASimpleImportImportPackage node)
    {
        inASimpleImportImportPackage(node);
        {
            Object temp[] = node.getCommaModule().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PCommaModule) temp[i]).apply(this);
            }
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getModule() != null)
        {
            node.getModule().apply(this);
        }
        outASimpleImportImportPackage(node);
    }

    public void inASpecificImportImportPackage(ASpecificImportImportPackage node)
    {
        defaultIn(node);
    }

    public void outASpecificImportImportPackage(ASpecificImportImportPackage node)
    {
        defaultOut(node);
    }

    public void caseASpecificImportImportPackage(ASpecificImportImportPackage node)
    {
        inASpecificImportImportPackage(node);
        {
            Object temp[] = node.getCommaIdAsId().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PCommaIdAsId) temp[i]).apply(this);
            }
        }
        {
            Object temp[] = node.getPackAlias().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PIdentifier) temp[i]).apply(this);
            }
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        {
            Object temp[] = node.getModAlias().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PIdentifier) temp[i]).apply(this);
            }
        }
        if(node.getModule() != null)
        {
            node.getModule().apply(this);
        }
        outASpecificImportImportPackage(node);
    }

    public void inACommaIdAsId(ACommaIdAsId node)
    {
        defaultIn(node);
    }

    public void outACommaIdAsId(ACommaIdAsId node)
    {
        defaultOut(node);
    }

    public void caseACommaIdAsId(ACommaIdAsId node)
    {
        inACommaIdAsId(node);
        {
            Object temp[] = node.getIdentifier().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PIdentifier) temp[i]).apply(this);
            }
        }
        if(node.getFirst() != null)
        {
            node.getFirst().apply(this);
        }
        outACommaIdAsId(node);
    }

    public void inAMultiModule(AMultiModule node)
    {
        defaultIn(node);
    }

    public void outAMultiModule(AMultiModule node)
    {
        defaultOut(node);
    }

    public void caseAMultiModule(AMultiModule node)
    {
        inAMultiModule(node);
        if(node.getModule() != null)
        {
            node.getModule().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAMultiModule(node);
    }

    public void inASingleModule(ASingleModule node)
    {
        defaultIn(node);
    }

    public void outASingleModule(ASingleModule node)
    {
        defaultOut(node);
    }

    public void caseASingleModule(ASingleModule node)
    {
        inASingleModule(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outASingleModule(node);
    }

    public void inACommaModule(ACommaModule node)
    {
        defaultIn(node);
    }

    public void outACommaModule(ACommaModule node)
    {
        defaultOut(node);
    }

    public void caseACommaModule(ACommaModule node)
    {
        inACommaModule(node);
        {
            Object temp[] = node.getIdentifier().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PIdentifier) temp[i]).apply(this);
            }
        }
        if(node.getModule() != null)
        {
            node.getModule().apply(this);
        }
        outACommaModule(node);
    }

    public void inAFunctionCall(AFunctionCall node)
    {
        defaultIn(node);
    }

    public void outAFunctionCall(AFunctionCall node)
    {
        defaultOut(node);
    }

    public void caseAFunctionCall(AFunctionCall node)
    {
        inAFunctionCall(node);
        {
            Object temp[] = node.getArglist().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PArglist) temp[i]).apply(this);
            }
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAFunctionCall(node);
    }

    public void inAFuncCallValue(AFuncCallValue node)
    {
        defaultIn(node);
    }

    public void outAFuncCallValue(AFuncCallValue node)
    {
        defaultOut(node);
    }

    public void caseAFuncCallValue(AFuncCallValue node)
    {
        inAFuncCallValue(node);
        if(node.getFunctionCall() != null)
        {
            node.getFunctionCall().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAFuncCallValue(node);
    }

    public void inAPosNumValue(APosNumValue node)
    {
        defaultIn(node);
    }

    public void outAPosNumValue(APosNumValue node)
    {
        defaultOut(node);
    }

    public void caseAPosNumValue(APosNumValue node)
    {
        inAPosNumValue(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outAPosNumValue(node);
    }

    public void inANegNumValue(ANegNumValue node)
    {
        defaultIn(node);
    }

    public void outANegNumValue(ANegNumValue node)
    {
        defaultOut(node);
    }

    public void caseANegNumValue(ANegNumValue node)
    {
        inANegNumValue(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANegNumValue(node);
    }

    public void inAStringValue(AStringValue node)
    {
        defaultIn(node);
    }

    public void outAStringValue(AStringValue node)
    {
        defaultOut(node);
    }

    public void caseAStringValue(AStringValue node)
    {
        inAStringValue(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringValue(node);
    }

    public void inANoneValue(ANoneValue node)
    {
        defaultIn(node);
    }

    public void outANoneValue(ANoneValue node)
    {
        defaultOut(node);
    }

    public void caseANoneValue(ANoneValue node)
    {
        inANoneValue(node);
        outANoneValue(node);
    }

    public void inAIdentifier(AIdentifier node)
    {
        defaultIn(node);
    }

    public void outAIdentifier(AIdentifier node)
    {
        defaultOut(node);
    }

    public void caseAIdentifier(AIdentifier node)
    {
        inAIdentifier(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdentifier(node);
    }
}
