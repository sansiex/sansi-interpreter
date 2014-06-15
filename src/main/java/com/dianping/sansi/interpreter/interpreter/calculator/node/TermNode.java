package com.dianping.sansi.interpreter.interpreter.calculator.node;

import com.dianping.sansi.interpreter.interpreter.calculator.Calculator;

/**
 * Created by lenovo on 2014/6/14.
 */
public class TermNode extends ValueNode {

    public TermNode(int i) {
        super(i);
    }

    public TermNode(Calculator p, int i) {
        super(p, i);
    }

    public int getValue(){
        ValueNode vn= (ValueNode) this.jjtGetChild(0);
        return vn.getValue();
    }
}
