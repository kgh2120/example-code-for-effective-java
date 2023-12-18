package com.qq.samplecodeforej.week4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 이펙티브 자바 Item 35,36,37에 대한 예제 코드
 * MemberV2에 대해서 주차별 출석을 관리한다.
 */
public class MainV2 {

    public static void main(String[] args) {
        Map<Integer, Set<Integer>> rollBook = new HashMap<>();
        // 1주차
        rollBook.put(1, Set.of(MemberV2.CSE.getMemberId(),
                MemberV2.HYG.getMemberId(),
                MemberV2.JDM.getMemberId()));

        // 2주차
        rollBook.put(2, Set.of(MemberV2.CSE.getMemberId(),
                MemberV2.HYG.getMemberId(),
                MemberV2.JDM.getMemberId(),
                MemberV2.KJU.getMemberId(),
                MemberV2.KKH.getMemberId(),
                MemberV2.LSH.getMemberId()));

        System.out.println(rollBook);
        // 1=[0, 1, 2],
        // 2=[0, 1, 2, 3, 4, 5]
        rollBook.put(3, Set.of(
                MemberV2.CMH.getMemberId(),
                MemberV2.CSE.getMemberId(),
                MemberV2.HYG.getMemberId(),
                MemberV2.JDM.getMemberId(),
                MemberV2.KJU.getMemberId(),
                MemberV2.KKH.getMemberId())
        );
        System.out.println(rollBook); // 3=[0, 1, 2, 3, 4, 6]
    }
}
