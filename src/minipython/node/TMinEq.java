/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class TMinEq extends Token
{
    public TMinEq()
    {
        super.setText("-=");
    }

    public TMinEq(int line, int pos)
    {
        super.setText("-=");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TMinEq(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMinEq(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TMinEq text.");
    }
}
