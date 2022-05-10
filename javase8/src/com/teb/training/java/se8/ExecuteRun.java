package com.teb.training.java.se8;


public class ExecuteRun {

    public static void main(final String[] args) {
        String prefix = "Başla";
        IExecute executeLoc = new ExecuteImpl();
        executeLoc.exec("osman",
                        52);
        IExecute anonimExec = new IExecute() {

            @Override
            public String exec(final String strParam,
                               final int valParam) {
                return "Execute " + strParam + " " + valParam + " " + prefix;
            }
        };
        IExecute anonimExec2 = new IExecute() {

            @Override
            public String exec(final String strParam,
                               final int valParam) {
                return "Execute " + strParam + " " + valParam;
            }
        };
        anonimExec.exec("osman",
                        52);
        IExecute lambdaExecute = (strParam,
                                  valParam) -> "Execute " + strParam + " " + valParam;
        IExecute lambdaExecute2 = (d,
                                   z) -> "Execute " + d + " " + z + " " + prefix;

        lambdaExecute2.exec("osman",
                            52);
        IExecute lambdaExecute3 = (d,
                                   z) -> {
            System.out.println("xyz");
            return "Execute " + d + " " + z + " " + prefix;
        };


    }
}

