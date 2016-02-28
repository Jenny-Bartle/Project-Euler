package com.jenny.projecteuler;
import android.app.*;
import android.os.*;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.math.*;

public class Problem16
{

	public String Problem16() {
		long startTime = SystemClock.currentThreadTimeMillis();
		BigInteger powerTwo = BigInteger.valueOf(2);
		powerTwo = powerTwo.pow(1000);
		long digitsSum = sumDigits(powerTwo);
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + digitsSum + "\nTime: " + (endTime - startTime);
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
}
