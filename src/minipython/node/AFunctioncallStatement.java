/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AFunctioncallStatement extends PStatement
{
    private PFunctionCall _functionCall_;

    public AFunctioncallStatement()
    {
    }

    public AFunctioncallStatement(
        PFunctionCall _functionCall_)
    {
        setFunctionCall(_functionCall_);

    }
    public Object clone()
    {
        return new AFunctioncallStatement(
            (PFunctionCall) cloneNode(_functionCall_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunctioncallStatement(this);
    }

    public PFunctionCall getFunctionCall()
    {
        return _functionCall_;
    }

    public void setFunctionCall(PFunctionCall node)
    {
        if(_functionCall_ != null)
        {
            _functionCall_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _functionCall_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_functionCall_);
    }

    void removeChild(Node child)
    {
        if(_functionCall_ == child)
        {
            _functionCall_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_functionCall_ == oldChild)
        {
            setFunctionCall((PFunctionCall) newChild);
            return;
        }

    }
}
