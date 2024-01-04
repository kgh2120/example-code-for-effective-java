package com.qq.samplecodeforej.week6;

public class Numbers {

	/**
	 *
	 * @param natureNumber
	 * @return
	 * @throws Throwable 인자로 0이나 음수가 들어오면 발생합니다.
	 */
	public static int addNatureNumber(int natureNumber) throws Throwable {
		if (natureNumber < 0) {
			throw new NegativeNumberException();
		}
		if (natureNumber == 0) {
			throw new ZeroNumberException();
		}
		return 10+natureNumber;
	}
}
