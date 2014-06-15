package com.dianping.sansi.interpreter.interpreter.calculator.node;

import com.dianping.sansi.interpreter.interpreter.calculator.Calculator;

/**
 * Created by lenovo on 2014/6/15.
 */
public class ProcedureNode extends SimpleNode {
    public ProcedureNode(int i) {
        super(i);
    }

    public ProcedureNode(Calculator p, int i) {
        super(p, i);
    }
}
