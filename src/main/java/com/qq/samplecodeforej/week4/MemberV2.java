package com.qq.samplecodeforej.week4;

public enum MemberV2 {
    CMH(6), CSE(0), HYG(1), JDM(2), KJU(3), KKH(4), LSH(5);

    private final int memberId;

    MemberV2(int memberId) {
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }
}
