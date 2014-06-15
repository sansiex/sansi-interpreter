package com.dianping.sansi.interpreter.interpreter.calculator.node;

import com.dianping.sansi.interpreter.interpreter.calculator.Calculator;

/**
 * Created by lenovo on 2014/6/14.
 */
public class MinusNode extends OperatorNode{

    public MinusNode(Calculator p, int i) {
        super(p, i);
    }

    public MinusNode(int i) {
        super(i);
    }

    public int getValue(){
        return this.getOperand(0)-this.getOperand(1);
    }
}
