package com.jenny.projecteuler;
import android.os.*;

public class Problem12 implements Problem
{
	public String getAnswer() {
		long startTime = SystemClock.currentThreadTimeMillis();
		int numberFactors = 1;
		long triangularNo = 1;
		for(int i = 2; numberFactors<500; i++) {
			triangularNo += i;
			numberFactors = getNumberOfFactors(triangularNo);
		}

		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + triangularNo + "\nTime: " + (endTime - startTime);
	}

	@Override
	public String getProblemDescriptor() {
		return "Summation of primes";
	}
	
	private int getNumberOfFactors(long number) {
		int numberFactors = 1;
		long sqrt = (long)Math.sqrt(number);
		for (int i = 1; i <= sqrt; i++) {
			if (number % i == 0) {
				numberFactors ++;
			}
		}
		return numberFactors * 2;
	}
}
