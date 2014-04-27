package com.jenny.cidal;
import java.math.*;
import android.app.*;
import android.os.*;

public class Problem21
{
	public String Problem21() {
		long startTime = SystemClock.currentThreadTimeMillis();
		int sumOfAmicableNumbers = 0;
		for (int i =200; i < 10000; i++) {
			int i_sum = properDivisorsSum(i);
			int z = properDivisorsSum(i_sum);
			if (i == z && (i != i_sum)) {
				sumOfAmicableNumbers += i;
			}
		}
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + sumOfAmicableNumbers + "\nTime: " + (endTime - startTime);
	}

	private int properDivisorsSum(int findDivisors) {
		double sqrt = Math.sqrt(findDivisors);
		int divisorsSum = 1;
		for (int i = 2; i <= sqrt; i++) {
			if ((findDivisors % i) == 0) {
				divisorsSum += i;
				divisorsSum += (findDivisors / i);
			}
		}
		return divisorsSum;
	}
	
}
