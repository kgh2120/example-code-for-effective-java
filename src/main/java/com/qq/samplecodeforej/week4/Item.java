package com.qq.samplecodeforej.week4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Item {
    @Id
    private Integer itemNo;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "member")
    private MemberV2 member;

    @Enumerated(value = EnumType.STRING)
    private Topic topic;

    @Override
    public String toString() {
        return "Item{" +
                "itemNo=" + itemNo +
                ", member=" + member +
                ", topic=" + topic +
                '}';
    }
}
