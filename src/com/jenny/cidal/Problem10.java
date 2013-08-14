package com.jenny.cidal;
import android.app.*;
import android.os.*;
import java.util.List;
import java.util.ArrayList;

public class Problem10
{
	public String Problem10() {
		long startTime = SystemClock.currentThreadTimeMillis();
		long answer = 2;
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);

		for (int i = 3; i <2000000; i = i+2) {
			if(isPrime(i, primes)) {
				answer += i;
			}
		}

		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + answer + "\nTime: " + (endTime - startTime);
	}

	private boolean isPrime(int value, List<Integer> primes) {
		double sqrt = Math.sqrt(value);
		for (int i = 0; i < primes.size(); i++) {
			if(primes.get(i) > sqrt) {
				break;
			}
			if ((value % primes.get(i)) == 0) {
				return false;
			}
		}
		primes.add(value);
		return true;
	}
	
}
