/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AFuncCallValue extends PValue
{
    private PIdentifier _identifier_;
    private PFunctionCall _functionCall_;

    public AFuncCallValue()
    {
    }

    public AFuncCallValue(
        PIdentifier _identifier_,
        PFunctionCall _functionCall_)
    {
        setIdentifier(_identifier_);

        setFunctionCall(_functionCall_);

    }
    public Object clone()
    {
        return new AFuncCallValue(
            (PIdentifier) cloneNode(_identifier_),
            (PFunctionCall) cloneNode(_functionCall_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFuncCallValue(this);
    }

    public PIdentifier getIdentifier()
    {
        return _identifier_;
    }

    public void setIdentifier(PIdentifier node)
    {
        if(_identifier_ != null)
        {
            _identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _identifier_ = node;
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
            + toString(_identifier_)
            + toString(_functionCall_);
    }

    void removeChild(Node child)
    {
        if(_identifier_ == child)
        {
            _identifier_ = null;
            return;
        }

        if(_functionCall_ == child)
        {
            _functionCall_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_identifier_ == oldChild)
        {
            setIdentifier((PIdentifier) newChild);
            return;
        }

        if(_functionCall_ == oldChild)
        {
            setFunctionCall((PFunctionCall) newChild);
            return;
        }

    }
}