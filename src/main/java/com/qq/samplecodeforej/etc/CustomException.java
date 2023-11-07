package com.qq.samplecodeforej.etc;

public class CustomException extends RuntimeException{
    public static final CustomException INSTANCE = new CustomException("나는 미리 만든 인스턴스야");

    public CustomException(String message) {
        super(message);
    }

}
