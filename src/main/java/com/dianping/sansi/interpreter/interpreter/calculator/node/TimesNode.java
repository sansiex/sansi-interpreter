package com.dianping.sansi.interpreter.interpreter.calculator.node;

import com.dianping.sansi.interpreter.interpreter.calculator.Calculator;

/**
 * Created by lenovo on 2014/6/14.
 */
public class TimesNode extends OperatorNode {
    public TimesNode(int i) {
        super(i);
    }

    public TimesNode(Calculator p, int i) {
        super(p, i);
    }

    @Override
    public int getValue() {
        return this.getOperand(0) * this.getOperand(1);
    }
}
