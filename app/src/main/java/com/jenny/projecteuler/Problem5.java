package com.jenny.projecteuler;
import android.os.SystemClock;

import java.util.ArrayList;
import java.util.List;

public class Problem5 implements Problem
{
	public String getAnswer() {
		long startTime = SystemClock.currentThreadTimeMillis();
		int upperLimit = 20;
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		long lowestCommonFactor = 2;
		// Make list of primes
		for(int i = 3; i < upperLimit; i++) {
			isPrime(i, primes);
		}
		// Check list of primes for required repeats
		for(int prime : primes) {
			int primeMultiply = 1;
		 	for(int power = 2; power < Integer.MAX_VALUE; power++) {
		 		if(primeMultiply*prime < upperLimit){
		 			primeMultiply *= prime;
		 		}
		 	}
		 	primes.remove(prime);
		 	primes.add(primeMultiply);
		}
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + lowestCommonFactor + "\nTime: " + (endTime - startTime);
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
		return "Smallest multiple";
	}
	
	
}