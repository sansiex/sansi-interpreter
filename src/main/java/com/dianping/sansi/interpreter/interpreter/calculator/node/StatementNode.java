package com.dianping.sansi.interpreter.interpreter.calculator.node;

import com.dianping.sansi.interpreter.interpreter.calculator.Calculator;

/**
 * Created by lenovo on 2014/6/15.
 */
public class StatementNode extends SimpleNode {
    public StatementNode(int i) {
        super(i);
    }

    public StatementNode(Calculator p, int i) {
        super(p, i);
    }
}
