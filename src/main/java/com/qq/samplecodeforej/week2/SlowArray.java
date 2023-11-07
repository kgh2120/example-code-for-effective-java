package com.qq.samplecodeforej.week2;

public class SlowArray<T> {


    private Object[] array;
    private int cursor;
    private int size;
    private int limit;

    public SlowArray(){
        limit = 10;
        array = new Object[limit];
    }

    public SlowArray( int initialSize) {
        limit = initialSize;
        array = new Object[limit];
    }

    public synchronized void add(T t) {
        if (size == limit) {
            throw new RuntimeException("아 배불러..");
        }
        array[cursor++] = t;
        size++;
    }



}
