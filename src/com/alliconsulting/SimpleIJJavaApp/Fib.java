package com.alliconsulting.SimpleIJJavaApp;

public class Fib {

    public int DoFib(int argNum) {
        if(argNum<2)
            return argNum;
        else
            return DoFib(argNum-1) + DoFib(argNum-2);
    }
}
