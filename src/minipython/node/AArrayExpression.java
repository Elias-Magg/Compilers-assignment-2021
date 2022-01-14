/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AArrayExpression extends PExpression
{
    private PArrayExpression _arrayExpression_;

    public AArrayExpression()
    {
    }

    public AArrayExpression(
        PArrayExpression _arrayExpression_)
    {
        setArrayExpression(_arrayExpression_);

    }
    public Object clone()
    {
        return new AArrayExpression(
            (PArrayExpression) cloneNode(_arrayExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayExpression(this);
    }

    public PArrayExpression getArrayExpression()
    {
        return _arrayExpression_;
    }

    public void setArrayExpression(PArrayExpression node)
    {
        if(_arrayExpression_ != null)
        {
            _arrayExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _arrayExpression_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_arrayExpression_);
    }

    void removeChild(Node child)
    {
        if(_arrayExpression_ == child)
        {
            _arrayExpression_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_arrayExpression_ == oldChild)
        {
            setArrayExpression((PArrayExpression) newChild);
            return;
        }

    }
}