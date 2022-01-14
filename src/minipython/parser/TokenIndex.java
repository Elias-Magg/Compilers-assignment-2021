/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.parser;

import minipython.node.*;
import minipython.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    public void caseTTab(TTab node)
    {
        index = 0;
    }

    public void caseTPlus(TPlus node)
    {
        index = 1;
    }

    public void caseTMinus(TMinus node)
    {
        index = 2;
    }

    public void caseTMult(TMult node)
    {
        index = 3;
    }

    public void caseTDmult(TDmult node)
    {
        index = 4;
    }

    public void caseTDiv(TDiv node)
    {
        index = 5;
    }

    public void caseTMod(TMod node)
    {
        index = 6;
    }

    public void caseTAssign(TAssign node)
    {
        index = 7;
    }

    public void caseTExclam(TExclam node)
    {
        index = 8;
    }

    public void caseTDict(TDict node)
    {
        index = 9;
    }

    public void caseTDef(TDef node)
    {
        index = 10;
    }

    public void caseTLogicPlus(TLogicPlus node)
    {
        index = 11;
    }

    public void caseTLPar(TLPar node)
    {
        index = 12;
    }

    public void caseTRPar(TRPar node)
    {
        index = 13;
    }

    public void caseTLBr(TLBr node)
    {
        index = 14;
    }

    public void caseTRBr(TRBr node)
    {
        index = 15;
    }

    public void caseTComma(TComma node)
    {
        index = 16;
    }

    public void caseTQmark(TQmark node)
    {
        index = 17;
    }

    public void caseTGqmark(TGqmark node)
    {
        index = 18;
    }

    public void caseTIf(TIf node)
    {
        index = 19;
    }

    public void caseTElif(TElif node)
    {
        index = 20;
    }

    public void caseTElse(TElse node)
    {
        index = 21;
    }

    public void caseTFor(TFor node)
    {
        index = 22;
    }

    public void caseTIn(TIn node)
    {
        index = 23;
    }

    public void caseTWhile(TWhile node)
    {
        index = 24;
    }

    public void caseTPrint(TPrint node)
    {
        index = 25;
    }

    public void caseTReturn(TReturn node)
    {
        index = 26;
    }

    public void caseTMax(TMax node)
    {
        index = 27;
    }

    public void caseTMin(TMin node)
    {
        index = 28;
    }

    public void caseTLess(TLess node)
    {
        index = 29;
    }

    public void caseTGreat(TGreat node)
    {
        index = 30;
    }

    public void caseTTrue(TTrue node)
    {
        index = 31;
    }

    public void caseTSemi(TSemi node)
    {
        index = 32;
    }

    public void caseTFalse(TFalse node)
    {
        index = 33;
    }

    public void caseTQuote(TQuote node)
    {
        index = 34;
    }

    public void caseTImport(TImport node)
    {
        index = 35;
    }

    public void caseTAs(TAs node)
    {
        index = 36;
    }

    public void caseTFrom(TFrom node)
    {
        index = 37;
    }

    public void caseTLen(TLen node)
    {
        index = 38;
    }

    public void caseTAssert(TAssert node)
    {
        index = 39;
    }

    public void caseTDot(TDot node)
    {
        index = 40;
    }

    public void caseTAnd(TAnd node)
    {
        index = 41;
    }

    public void caseTOr(TOr node)
    {
        index = 42;
    }

    public void caseTNot(TNot node)
    {
        index = 43;
    }

    public void caseTNone(TNone node)
    {
        index = 44;
    }

    public void caseTGeq(TGeq node)
    {
        index = 45;
    }

    public void caseTLeq(TLeq node)
    {
        index = 46;
    }

    public void caseTNeq(TNeq node)
    {
        index = 47;
    }

    public void caseTEquals(TEquals node)
    {
        index = 48;
    }

    public void caseTMinEq(TMinEq node)
    {
        index = 49;
    }

    public void caseTDivEq(TDivEq node)
    {
        index = 50;
    }

    public void caseTNumber(TNumber node)
    {
        index = 51;
    }

    public void caseTId(TId node)
    {
        index = 52;
    }

    public void caseTString(TString node)
    {
        index = 53;
    }

    public void caseEOF(EOF node)
    {
        index = 54;
    }
}