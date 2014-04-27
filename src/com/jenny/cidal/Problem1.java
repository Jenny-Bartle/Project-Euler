package com.jenny.cidal;

import android.os.SystemClock;

public class Problem1 {
	/** Find the sum of all numbers below 1000 which are multiples of 3 or 5 */
	public static String getProblem1() {
		long startTime = SystemClock.currentThreadTimeMillis();
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum += i;
			}
		}
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + sum + "\nTime: " + (endTime - startTime);
	}

}
