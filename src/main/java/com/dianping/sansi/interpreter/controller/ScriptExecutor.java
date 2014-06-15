package com.dianping.sansi.interpreter.controller;


import com.dianping.sansi.interpreter.interpreter.calculator.CalculatorInterpretor;

import java.io.*;

/**
 * Created by sansi on 2014/6/4.
 */
public class ScriptExecutor {
    public static void exec(String script, Writer writer) {
        if(!script.endsWith(System.lineSeparator())){
            script+=System.lineSeparator();
        }
        Reader is =new StringReader(script);
        exec(is,writer);
        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exec(Reader reader, Writer writer){
        new CalculatorInterpretor().interpret(reader,writer);
    }

    public static void exec(String script, OutputStream out) {
        if(!script.endsWith(System.lineSeparator())){
            script+=System.lineSeparator();
        }
        InputStream is =new ByteArrayInputStream(script.getBytes());
        exec(is,out);
    }

    public static void exec(InputStream in, OutputStream out){
        new CalculatorInterpretor().interpret(in,out);
    }

    public static void main(String[] args) {
        exec("1+2*3+4",System.out);
    }
}
