package com.qq.samplecodeforej.week1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args)
            throws Exception {
        Calculator cal = Calculator.getInstance();

        // 외부 파일명
        String fileName = "Calculator.obj";

        // 파일 스트림 객체 생성 (try with resource)
        try (
                FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream out = new ObjectOutputStream(fos)
        ) {
            // 직렬화 가능 객체를 바이트 스트림으로 변환하고 파일에 저장
            out.writeObject(cal);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // 파일 스트림 객체 생성 (try with resource)
        Calculator deserializedCalculator = null;
        try(
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream in = new ObjectInputStream(fis)
        ) {
            // 바이트 스트림을 다시 자바 객체로 변환 (이때 캐스팅이 필요)
            deserializedCalculator = (Calculator) in.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(cal == deserializedCalculator); // true
    }
}
