package com.jenny.projecteuler;
import android.os.SystemClock;

public class Problem2 implements Problem
{
	/** Find the sum of all even numbers in the fibonacci sequence up to 4million*/
	public String getAnswer() {
		final int upperBound = 4000000;
		long startTime = SystemClock.currentThreadTimeMillis();
		double[] fib = new double[upperBound];
		fib[0] = 1.0;
		fib[1] = 2.0;
		int fibLen = 2;
		// Create fib series
		while (fib[fibLen - 1] < upperBound) {
			fib[fibLen] = fib[fibLen-1] + fib[fibLen-2];
			fibLen++;
		}
		// Sum even numbers
		double sum = 0;
		for(int i = 1; i < fibLen; i = i+3) {
			sum += fib[i];
		}
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + sum + "\nTime: " + (endTime - startTime);
	}

	@Override
	public String getProblemDescriptor() {
		return "Even Fibonacci numbers";
	}
	
}
