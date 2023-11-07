package com.qq.samplecodeforej.week2;

import java.util.Vector;

public class CustomStack<T> {

    private Vector<T> vector;

    public CustomStack() {
        vector = new Vector<>();
    }

    public CustomStack(int initialCapacity) {
        vector = new Vector<>(initialCapacity);
    }

    public void push(T t) {
        vector.add(t);
    }

    public T pop(){
        return vector.remove(vector.size()-1);
    }

    public int size(){
        return vector.size();
    }
}
