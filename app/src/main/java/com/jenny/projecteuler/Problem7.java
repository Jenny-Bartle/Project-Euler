package com.jenny.projecteuler;
import java.util.ArrayList;
import java.util.List;

import android.os.SystemClock;

public class Problem7 implements Problem
{

	public String getAnswer() {
		long startTime = SystemClock.currentThreadTimeMillis();

		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for(int i = 3; primes.size() < 10001; i++){
			isPrime(i, primes);
		}
		int answer = primes.get(10000);
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + answer + "\nTime: " + (endTime - startTime);
	}


	private boolean isPrime(int value, List<Integer> primes) {
		for (int i = 0; i < primes.size(); i++) {
			if ((value % primes.get(i)) == 0) {
				return false;
			}
		}
		primes.add(value);
		return true;
	}

	@Override
	public String getProblemDescriptor() {
		return "10001st prime";
	}
	
}
