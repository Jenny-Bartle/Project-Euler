package com.jenny.cidal;
import android.app.*;
import android.os.*;

public class Problem6
{

	public String Problem6() {
		long startTime = SystemClock.currentThreadTimeMillis();
		// Square then sum first 100 integers
		long sumOfSquares = 0;
		for(int i = 1; i <101; i++) {
			sumOfSquares += Math.pow(i, 2);
		}
		// Sum first 100 integers
		int sumFirst100Ints = (101*50);
		double squareOfSums = Math.pow(sumFirst100Ints, 2);
		long answer = (long)squareOfSums - sumOfSquares;
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + answer + "\nTime: " + (endTime - startTime);
	}
}
