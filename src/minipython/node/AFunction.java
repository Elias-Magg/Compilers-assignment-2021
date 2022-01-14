/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AFunction extends PFunction
{
    private PIdentifier _identifier_;
    private PArgument _argument_;
    private PStatement _statement_;

    public AFunction()
    {
    }

    public AFunction(
        PIdentifier _identifier_,
        PArgument _argument_,
        PStatement _statement_)
    {
        setIdentifier(_identifier_);

        setArgument(_argument_);

        setStatement(_statement_);

    }
    public Object clone()
    {
        return new AFunction(
            (PIdentifier) cloneNode(_identifier_),
            (PArgument) cloneNode(_argument_),
            (PStatement) cloneNode(_statement_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunction(this);
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

    public PArgument getArgument()
    {
        return _argument_;
    }

    public void setArgument(PArgument node)
    {
        if(_argument_ != null)
        {
            _argument_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _argument_ = node;
    }

    public PStatement getStatement()
    {
        return _statement_;
    }

    public void setStatement(PStatement node)
    {
        if(_statement_ != null)
        {
            _statement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _statement_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_identifier_)
            + toString(_argument_)
            + toString(_statement_);
    }

    void removeChild(Node child)
    {
        if(_identifier_ == child)
        {
            _identifier_ = null;
            return;
        }

        if(_argument_ == child)
        {
            _argument_ = null;
            return;
        }

        if(_statement_ == child)
        {
            _statement_ = null;
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

        if(_argument_ == oldChild)
        {
            setArgument((PArgument) newChild);
            return;
        }

        if(_statement_ == oldChild)
        {
            setStatement((PStatement) newChild);
            return;
        }

    }
}
