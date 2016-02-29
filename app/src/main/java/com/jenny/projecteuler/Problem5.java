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
		// Make list of primes
		for(int i = 3; i < upperLimit; i++) {
            Utilities.isPrime(i, primes);
		}

        // Find repeated prime factors eg eg 16 = 2*2*2*2 so we need four 2s
        List<Integer> primeFactors = new ArrayList<Integer>();
        for (int prime : primes) {
            primeFactors.add(prime);
            for(int power = 2; power < Integer.MAX_VALUE; power++) {
                if(Math.pow(prime, power) < upperLimit){
                    primeFactors.add(prime);
                }
                else {
                    break;
                }
            }
        }

        long lowestCommonFactor = 1;
        for (int factor : primeFactors) {
            lowestCommonFactor *= factor;
        }
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + lowestCommonFactor + "\nTime: " + (endTime - startTime);
	}

	@Override
	public String getProblemDescriptor() {
		return "Smallest multiple";
	}
	
	
}
