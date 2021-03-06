package com.dianping.sansi.interpreter.interpreter.script.node;

import com.dianping.sansi.interpreter.interpreter.calculator.Calculator;
import com.dianping.sansi.interpreter.interpreter.script.SansiScript;

/**
 * Created by lenovo on 2014/6/14.
 */
public class AddNode extends OperatorNode{

    public AddNode(SansiScript p, int i) {
        super(p, i);
    }

    public AddNode(int i) {
        super(i);
    }

    public int getValue(){
        return this.getOperand(0)+this.getOperand(1);
    }
}
