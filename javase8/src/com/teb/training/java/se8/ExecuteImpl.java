package com.teb.training.java.se8;


public class ExecuteImpl implements IExecute {

    @Override
    public String exec(final String strParam,
                       final int valParam) {
        return "Execute " + strParam + " " + valParam;
    }

}
