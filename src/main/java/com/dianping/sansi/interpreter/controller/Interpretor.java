package com.dianping.sansi.interpreter.controller;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by lenovo on 2014/6/15.
 */
public interface Interpretor {
    void interpret(InputStream in, OutputStream out);
}
