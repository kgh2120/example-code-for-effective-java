package com.qq.samplecodeforej.etc;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        try {
            main.throwExistInstance(); // 10
        } catch (CustomException e) {
            e.printStackTrace();
        }

        try {
            main.throwNewInstance(); // 16
        } catch (CustomException e) {
            e.printStackTrace();
        }


    }



    public void throwNewInstance(){
        throw new CustomException("나는 새로 생긴 예외 클래스야"); // 27
    }

    public void throwExistInstance(){
        throw CustomException.INSTANCE; // 31
    }

}
