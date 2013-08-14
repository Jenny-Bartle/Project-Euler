package com.jenny.cidal;
import android.app.*;
import android.os.*;
import java.util.List;
import java.util.ArrayList;

public class Problem3
{

	/** Find the largest prime factor of N */
	public String Problem3() {
		long startTime = SystemClock.currentThreadTimeMillis();
		List<Integer> primes = new ArrayList<Integer>();
		List<Integer> primeFactors = new ArrayList<Integer>();
		
		long bigNo = 600851475143l;
		double sqrtBigNo = Math.sqrt(bigNo);
		
		primes.add(2);
		for(int i = 3; i <= sqrtBigNo; i++) {
			if(isPrime(i, primes)) {
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

	private boolean isPrime(int value, List<Integer> primes) {
		for (int i = 0; i < primes.size(); i++) {
			if ((value % primes.get(i)) == 0) {
				return false;
			}
		}
		primes.add(value);
		return true;
	}
}