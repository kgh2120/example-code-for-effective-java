package com.qq.samplecodeforej.week6;

public class PasswordUnMatchedException extends RuntimeException {

	public PasswordUnMatchedException(String password) {
		super(String.format("입력하신 비밀번호 %s는 틀렸습니다."));
	}
}
