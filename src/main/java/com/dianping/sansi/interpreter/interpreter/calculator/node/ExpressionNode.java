package com.dianping.sansi.interpreter.interpreter.calculator.node;

import com.dianping.sansi.interpreter.interpreter.calculator.Calculator;

/**
 * Created by lenovo on 2014/6/14.
 */
public class ExpressionNode extends ValueNode {

    public ExpressionNode(int i) {
        super(i);
    }

    public ExpressionNode(Calculator p, int i) {
        super(p, i);
    }

    public int getValue(){
        ValueNode vn= (ValueNode) this.jjtGetChild(0);
        return vn.getValue();
    }
}
