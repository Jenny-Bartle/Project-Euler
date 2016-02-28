package com.jenny.projecteuler;
import android.os.SystemClock;

import java.math.BigInteger;

public class Problem20
{

	public String Problem20() {
		long startTime = SystemClock.currentThreadTimeMillis();
		BigInteger fac100 = factorial(100);
		long digits = sumDigits(fac100);
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + digits + "\nTime: " + (endTime - startTime);
	}

	private long sumDigits(BigInteger number) {
		long total = 0;
		String numberAsString = number.toString();
		char[] numberAsChar = numberAsString.toCharArray();
		for (char charNum : numberAsChar) {
			total += Long.parseLong(String.valueOf(charNum));
		}
		return total;
	}

	private BigInteger factorial(long startNo) {
		BigInteger total = BigInteger.valueOf(1);
		while(startNo > 1) {
			total = total.multiply(BigInteger.valueOf(startNo));
			startNo--;
		}
		return total;
	}
	
}
