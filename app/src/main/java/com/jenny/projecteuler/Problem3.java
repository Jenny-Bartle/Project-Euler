package com.jenny.projecteuler;
import java.util.ArrayList;
import java.util.List;

import android.os.SystemClock;

public class Problem3 implements Problem
{

	/** Find the largest prime factor of N */
	public String getAnswer() {
		long startTime = SystemClock.currentThreadTimeMillis();
		List<Integer> primes = new ArrayList<Integer>();
		
		long bigNo = 600851475143l;
		double sqrtBigNo = Math.sqrt(bigNo);
		int N=1;
		primes.add(2);
		for(int i = 3; i <= sqrtBigNo; i++) {
			if(isPrime(i, primes)) {
				N = i;
			}
		}
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + N + "\nTime: " + (endTime - startTime);
	}

	private boolean isPrime(int value, List<Integer> primes) {
		int sqrtValue = (int)Math.sqrt(value);
		for (int i = 0; i < sqrtValue; i++) {
			if ((value % primes.get(i)) == 0) {
				return false;
			}
		}
		primes.add(value);
		return true;
	}

	@Override
	public String getProblemDescriptor() {
		return "Largest prime factor";
	}
	
}
