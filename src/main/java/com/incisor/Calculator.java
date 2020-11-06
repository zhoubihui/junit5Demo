package com.incisor;

public class Calculator {
    private static int result = 0;
    public static int getResult(){
        return result;
    }

    public static int add(int x, int y){
        result = x + y;
        return result;
    }

    public static int count(int ... x) throws InterruptedException {
        for (int i = 0; i < x.length; ++i){
            result += x[i];
            Thread.sleep(1000);
        }
        return result;
    }

    public static int subtract(int x, int y){
        result = x - y;
        return result;
    }

    public static int multiply(int x, int y){
        result = x * y;
        return result;
    }

    public static int divide(int x, int y){
        result = x / y;
        return result;
    }
}
