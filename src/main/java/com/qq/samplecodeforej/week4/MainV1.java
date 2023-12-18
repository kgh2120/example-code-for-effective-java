package com.qq.samplecodeforej.week4;

import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 이펙티브 자바 Item 35,36,37에 대한 예제 코드
 * MemberV1에 대해서 주차별 출석을 관리한다.
 */
public class MainV1 {

    public static void main(String[] args) {
        Map<Integer, Set<Integer>> rollBook = new HashMap<>();
        // 1주차
        rollBook.put(1, Set.of(MemberV1.CSE.ordinal(),
                MemberV1.HYG.ordinal(),
                MemberV1.JDM.ordinal()));

        // 2주차
        rollBook.put(2, Set.of(MemberV1.CSE.ordinal(),
                MemberV1.HYG.ordinal(),
                MemberV1.JDM.ordinal(),
                MemberV1.KJU.ordinal(),
                MemberV1.KKH.ordinal(),
                MemberV1.LSH.ordinal()));

        System.out.println(rollBook);
        // 1=[0, 1, 2],
        // 2=[0, 1, 2, 3, 4, 5]
        rollBook.put(3, Set.of(
                MemberV2.CMH.ordinal(),
                MemberV2.CSE.ordinal(),
                MemberV2.HYG.ordinal(),
                MemberV2.JDM.ordinal(),
                MemberV2.KJU.ordinal(),
                MemberV2.KKH.ordinal())
        );
        System.out.println(rollBook); // 3=[3, 2, 1, 0, 5, 4]
    }
}
