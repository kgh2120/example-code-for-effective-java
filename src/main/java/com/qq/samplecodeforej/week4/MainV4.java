package com.qq.samplecodeforej.week4;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

/**
 * 이펙티브 자바 아이템 37에 관한 예제 코드
 * Topic, Item을 이용해서 Topic에 Item이 들어가는 것을 만든다.
 */
public class MainV4 {

    public static void main(String[] args) {

        List<Item> items = List.of(
                new Item(1, MemberV2.JDM, Topic.OBJECT_CREATE_DESTROY),
                new Item(2, MemberV2.JDM, Topic.OBJECT_CREATE_DESTROY),
                new Item(3, MemberV2.KKH, Topic.OBJECT_CREATE_DESTROY),
                new Item(11, MemberV2.CSE, Topic.OBJECT_COMMON_METHOD),
                new Item(12, MemberV2.CSE, Topic.OBJECT_COMMON_METHOD),
                new Item(18, MemberV2.KKH, Topic.CLASS_AND_INTERFACE),
                new Item(16, MemberV2.LSH, Topic.CLASS_AND_INTERFACE),
                new Item(17, MemberV2.LSH, Topic.CLASS_AND_INTERFACE),
                new Item(32, MemberV2.HYG, Topic.GENERIC),
                new Item(33, MemberV2.HYG, Topic.GENERIC)
        );


        List<Set<Item>> topicItems = List.of(
                new HashSet<>(),
                new HashSet<>(),
                new HashSet<>(),
                new HashSet<>(),
                new HashSet<>(),
                new HashSet<>()
        );
        for (Item item : items) {
            topicItems.get(item.getTopic().ordinal()).add(item);
        }
        int i = 0;
        for (Set<Item> topicItem : topicItems) {
            System.out.printf("%d : %s%n",i++, topicItem);
        }
        /*
        0 : [Item{itemNo=1, member=JDM, topic=OBJECT_CREATE_DESTROY}, Item{itemNo=2, member=JDM, topic=OBJECT_CREATE_DESTROY}, Item{itemNo=3, member=KKH, topic=OBJECT_CREATE_DESTROY}]
        1 : [Item{itemNo=11, member=CSE, topic=OBJECT_COMMON_METHOD}, Item{itemNo=12, member=CSE, topic=OBJECT_COMMON_METHOD}]
        2 : [Item{itemNo=17, member=LSH, topic=CLASS_AND_INTERFACE}, Item{itemNo=18, member=KKH, topic=CLASS_AND_INTERFACE}, Item{itemNo=16, member=LSH, topic=CLASS_AND_INTERFACE}]
        3 : [Item{itemNo=32, member=HYG, topic=GENERIC}, Item{itemNo=33, member=HYG, topic=GENERIC}]
        4 : []
        5 : []
         */


        Map<Topic, Set<Item>> topicItemMap = items.stream().collect(groupingBy(Item::getTopic,
                () -> new EnumMap<>(Topic.class), toSet()));

        for (Map.Entry<Topic, Set<Item>> topicSetEntry : topicItemMap.entrySet()) {
            System.out.println(topicSetEntry);
        }
        /*
        OBJECT_CREATE_DESTROY=[Item{itemNo=1, member=JDM, topic=OBJECT_CREATE_DESTROY}, Item{itemNo=2, member=JDM, topic=OBJECT_CREATE_DESTROY}, Item{itemNo=3, member=KKH, topic=OBJECT_CREATE_DESTROY}]
        OBJECT_COMMON_METHOD=[Item{itemNo=11, member=CSE, topic=OBJECT_COMMON_METHOD}, Item{itemNo=12, member=CSE, topic=OBJECT_COMMON_METHOD}]
        CLASS_AND_INTERFACE=[Item{itemNo=17, member=LSH, topic=CLASS_AND_INTERFACE}, Item{itemNo=18, member=KKH, topic=CLASS_AND_INTERFACE}, Item{itemNo=16, member=LSH, topic=CLASS_AND_INTERFACE}]
        GENERIC=[Item{itemNo=32, member=HYG, topic=GENERIC}, Item{itemNo=33, member=HYG, topic=GENERIC}]
         */


    }
}
