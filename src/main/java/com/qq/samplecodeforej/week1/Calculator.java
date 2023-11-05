package com.qq.samplecodeforej.week1;


import java.io.Serializable;

public class Calculator {

    private Calculator(){
        throw new RuntimeException("생성자를 호출하지 마시오.");
    }
    public static int add(int a, int b) {
        return a + b;
    }
}