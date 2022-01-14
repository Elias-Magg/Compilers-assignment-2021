/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.analysis;

import minipython.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object in);
    Object getOut(Node node);
    void setOut(Node node, Object out);

    void caseStart(Start node);
    void caseAGoal(AGoal node);
    void caseAFunctionCommand(AFunctionCommand node);
    void caseAStatementCommand(AStatementCommand node);
    void caseAFunction(AFunction node);
    void caseASingleArgument(ASingleArgument node);
    void caseASingleAssignArgument(ASingleAssignArgument node);
    void caseAManyArgument(AManyArgument node);
    void caseAIdAssign(AIdAssign node);
    void caseAIfStatement(AIfStatement node);
    void caseAWhileStatement(AWhileStatement node);
    void caseAForStatement(AForStatement node);
    void caseAReturnStatement(AReturnStatement node);
    void caseAPrintStatement(APrintStatement node);
    void caseAAssignStatement(AAssignStatement node);
    void caseAMineqStatement(AMineqStatement node);
    void caseADiveqStatement(ADiveqStatement node);
    void caseAArraycellStatement(AArraycellStatement node);
    void caseAAssertStatement(AAssertStatement node);
    void caseAFunctioncallStatement(AFunctioncallStatement node);
    void caseAImportStatement(AImportStatement node);
    void caseAOneArglist(AOneArglist node);
    void caseAManyArglist(AManyArglist node);
    void caseAAndcComparison(AAndcComparison node);
    void caseAOrcComparison(AOrcComparison node);
    void caseANotcComparison(ANotcComparison node);
    void caseALesscComparison(ALesscComparison node);
    void caseAGreatcComparison(AGreatcComparison node);
    void caseALeqcComparison(ALeqcComparison node);
    void caseAGeqcComparison(AGeqcComparison node);
    void caseANeqcComparison(ANeqcComparison node);
    void caseAEqcComparison(AEqcComparison node);
    void caseATrueComparison(ATrueComparison node);
    void caseAFalseComparison(AFalseComparison node);
    void caseAAdditionExpression(AAdditionExpression node);
    void caseASubtractionExpression(ASubtractionExpression node);
    void caseAMultiplicationExpression(AMultiplicationExpression node);
    void caseADivisionExpression(ADivisionExpression node);
    void caseAModuloExpression(AModuloExpression node);
    void caseAExponentiationExpression(AExponentiationExpression node);
    void caseAListExpressionExpression(AListExpressionExpression node);
    void caseAFunctioncallExpression(AFunctioncallExpression node);
    void caseAValueExpression(AValueExpression node);
    void caseAIdentifierExpression(AIdentifierExpression node);
    void caseALenExpression(ALenExpression node);
    void caseAMaxExpression(AMaxExpression node);
    void caseAMinExpression(AMinExpression node);
    void caseAArrayExpression(AArrayExpression node);
    void caseAParenthensesExpression(AParenthensesExpression node);
    void caseASingleArrayExpression(ASingleArrayExpression node);
    void caseAManyArrayExpression(AManyArrayExpression node);
    void caseASimpleImportImportPackage(ASimpleImportImportPackage node);
    void caseASpecificImportImportPackage(ASpecificImportImportPackage node);
    void caseACommaIdAsId(ACommaIdAsId node);
    void caseAMultiModule(AMultiModule node);
    void caseASingleModule(ASingleModule node);
    void caseACommaModule(ACommaModule node);
    void caseAFunctionCall(AFunctionCall node);
    void caseAFuncCallValue(AFuncCallValue node);
    void caseAPosNumValue(APosNumValue node);
    void caseANegNumValue(ANegNumValue node);
    void caseAStringValue(AStringValue node);
    void caseANoneValue(ANoneValue node);
    void caseAIdentifier(AIdentifier node);

    void caseTTab(TTab node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTMult(TMult node);
    void caseTDmult(TDmult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTAssign(TAssign node);
    void caseTExclam(TExclam node);
    void caseTDict(TDict node);
    void caseTDef(TDef node);
    void caseTLogicPlus(TLogicPlus node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBr(TLBr node);
    void caseTRBr(TRBr node);
    void caseTComma(TComma node);
    void caseTQmark(TQmark node);
    void caseTGqmark(TGqmark node);
    void caseTIf(TIf node);
    void caseTElif(TElif node);
    void caseTElse(TElse node);
    void caseTFor(TFor node);
    void caseTIn(TIn node);
    void caseTWhile(TWhile node);
    void caseTPrint(TPrint node);
    void caseTReturn(TReturn node);
    void caseTMax(TMax node);
    void caseTMin(TMin node);
    void caseTLess(TLess node);
    void caseTGreat(TGreat node);
    void caseTTrue(TTrue node);
    void caseTSemi(TSemi node);
    void caseTFalse(TFalse node);
    void caseTQuote(TQuote node);
    void caseTImport(TImport node);
    void caseTAs(TAs node);
    void caseTFrom(TFrom node);
    void caseTLen(TLen node);
    void caseTAssert(TAssert node);
    void caseTDot(TDot node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTNot(TNot node);
    void caseTNone(TNone node);
    void caseTGeq(TGeq node);
    void caseTLeq(TLeq node);
    void caseTNeq(TNeq node);
    void caseTEquals(TEquals node);
    void caseTMinEq(TMinEq node);
    void caseTDivEq(TDivEq node);
    void caseTBlank(TBlank node);
    void caseTLineComment(TLineComment node);
    void caseTNumber(TNumber node);
    void caseTId(TId node);
    void caseTString(TString node);
    void caseEOF(EOF node);
}