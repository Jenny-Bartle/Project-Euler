package com.jenny.projecteuler;
import android.os.SystemClock;

import java.util.ArrayList;
import java.util.List;

public class Problem3 implements Problem
{

	/** Find the largest prime factor of N */
	public String getAnswer() {
		long startTime = SystemClock.currentThreadTimeMillis();
		List<Integer> primes = new ArrayList<Integer>();
		List<Integer> primeFactors = new ArrayList<Integer>();

		long bigNo = 600851475143l;
		double sqrtBigNo = Math.sqrt(bigNo);

		primes.add(2);
		for(int i = 3; i <= sqrtBigNo; i++) {
			if(Utilities.isPrime(i, primes)) {
				if(bigNo%i == 0) {
					primeFactors.add(i);
				}
			}
		}
		int N = 1;
		for(Integer prime : primeFactors) {
			N = (prime > N) ? prime : N;
		}
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + N + "\nTime: " + (endTime - startTime);
	}

	@Override
	public String getProblemDescriptor() {
		return "Largest prime factor";
	}
	
}
