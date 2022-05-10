package com.teb.training.java.se8;


public class TestRun {

    public static void main(final String[] args) {
        ITest testLoc = j -> j.length() > 10;
        // ITest testLoc2 = z -> testExtra(z); yapılamıyor
        ITest testLoc2 = w -> w.contains("and");

        ITestX iTestXLoc = () -> true;

        ITestY testYLoc = (r,
                           t,
                           y) -> (r + t) > y;

        ITestY testYLoc2 = (r,
                            t,
                            y) -> {
            return (r + t) > y;
        };
        ITest testBindToMethod = TestRun::deneme;
        if (testBindToMethod.test("euıhwernfowrfnwer")) {
            System.out.println("String 10 dan büyük");
        }
        TestRun testRunLoc = new TestRun();
        ITest testBindToMethod2 = testRunLoc::denemeObject;
    }

    public static boolean deneme(String stringParam) {
        return stringParam.length() > 10;
    }

    public boolean denemeObject(String stringParam) {
        return stringParam.length() > 10;
    }

}
