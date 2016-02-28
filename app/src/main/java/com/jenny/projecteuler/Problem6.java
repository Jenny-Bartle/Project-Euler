package com.jenny.projecteuler;
import android.os.SystemClock;

public class Problem6 implements Problem
{

	public String getAnswer() {
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

	@Override
	public String getProblemDescriptor() {
		return "Sum square difference";
	}
	
}
