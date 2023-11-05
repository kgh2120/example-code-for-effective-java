package com.qq.samplecodeforej.week1;

import java.io.Serializable;

public enum CalculatorEnum implements Serializable {
    INSTANCE;
    public int add(int a, int b){return a+b;}

    private CalculatorEnum(){}
}
