package com.jenny.projecteuler;
import android.os.SystemClock;

import java.util.ArrayList;
import java.util.List;

public class Problem7 implements Problem
{

	public String getAnswer() {
		long startTime = SystemClock.currentThreadTimeMillis();

		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for(int i = 3; primes.size() < 10001; i++){
			Utilities.isPrime(i, primes);
		}
		int answer = primes.get(10000);
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + answer + "\nTime: " + (endTime - startTime);
	}

	@Override
	public String getProblemDescriptor() {
		return "10001st prime";
	}
	
}
