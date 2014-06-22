package com.dianping.sansi.interpreter.controller;

import com.dianping.sansi.interpreter.interpreter.script.ParseException;
import com.dianping.sansi.interpreter.interpreter.script.SansiScript;
import com.dianping.sansi.interpreter.interpreter.script.node.Node;
import com.dianping.sansi.interpreter.interpreter.script.node.ProcedureNode;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2014/6/15.
 */
public class ScriptInterpretor {
    public static List<Node> execScript(String script) throws ParseException {
        SansiScript parser=new SansiScript(new StringReader(script));
        ProcedureNode pn= (ProcedureNode) parser.procedure();
        ArrayList<Node> list=new ArrayList<>(pn.jjtGetNumChildren());
        for (int i = 0; i < pn.jjtGetNumChildren(); i++) {
            list.add(pn.jjtGetChild(i));
        }
        return list;
    }
}
