package com.dianping.sansi.interpreter.interpreter.calculator.node;

import com.dianping.sansi.interpreter.interpreter.calculator.Calculator;

/**
 * Created by lenovo on 2014/6/14.
 */
public abstract class ValueNode extends SimpleNode{
    public ValueNode(int i) {
        super(i);
    }

    public ValueNode(Calculator p, int i) {
        super(p, i);
    }

    public abstract int getValue();
}
