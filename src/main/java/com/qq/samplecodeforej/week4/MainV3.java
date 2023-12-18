package com.qq.samplecodeforej.week4;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 이펙티브 자바 Item 36에 대한 예제 코드
 * MemberBit과 EnumSet을 이용해서 출결을 관리한다.
 */
public class MainV3 {

    public static void main(String[] args) {

        Map<Integer, Integer> rollBookBit = new HashMap<>();
        // 1주차
        rollBookBit.put(1, MemberBit.CSE | MemberBit.HYG | MemberBit.JDM);
//        // 2주차
        rollBookBit.put(2, MemberBit.CSE | MemberBit.HYG | MemberBit.JDM
                    | MemberBit.KJU | MemberBit.KKH | MemberBit.LSH );
        System.out.println(rollBookBit);
        // {1=14, 2=126}

        long overLongValue = 1L << 64;
        System.out.println(overLongValue); // 1

        Map<Integer, Set<MemberV2>> rollBookEnumSet = new HashMap<>();
        // 1주차
        rollBookEnumSet.put(1, EnumSet.of(MemberV2.CSE, MemberV2.HYG , MemberV2.JDM));
        // 2주차
        rollBookEnumSet.put(2, EnumSet.of(MemberV2.CSE, MemberV2.HYG , MemberV2.JDM,
                MemberV2.KJU, MemberV2.KKH, MemberV2.LSH) );
        System.out.println(rollBookEnumSet);
        //{1=[CSE, HYG, JDM], 2=[CSE, HYG, JDM, KJU, KKH, LSH]}


    }
}
