package com.jenny.projecteuler;
import android.os.SystemClock;

import java.util.ArrayList;
import java.util.List;

public class Problem10 implements Problem
{
	public String getAnswer() {
		long startTime = SystemClock.currentThreadTimeMillis();
		long answer = 2;
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);

		for (int i = 3; i <2000000; i = i+2) {
			if(Utilities.isPrime(i, primes)) {
				answer += i;
			}
		}

		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + answer + "\nTime: " + (endTime - startTime);
	}

	@Override
	public String getProblemDescriptor() {
		return "Summation of primes";
	}
	
}
