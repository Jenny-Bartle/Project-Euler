package com.jenny.cidal;
import android.app.*;
import android.os.*;
import java.util.List;
import java.util.ArrayList;

public class Problem7
{

	public String Problem7() {
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
	
}
