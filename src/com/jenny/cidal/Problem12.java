package com.jenny.cidal;
import android.app.*;
import android.os.*;

public class Problem12
{
	public String Problem12() {
		long startTime = SystemClock.currentThreadTimeMillis();
		int numberFactors = 1;
		long triangularNo = 1;
		for(int i = 2; numberFactors<500; i++) {
			triangularNo += i;
			numberFactors = getNumberOfFactors(triangularNo);
		}

		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + triangularNo + "\nTime: " + (endTime - startTime);
	}

	private int getNumberOfFactors(long number) {
		int numberFactors = 1;
		long sqrt = (long)Math.sqrt(number);
		for (int i = 1; i <= sqrt; i++) {
			if (number % i == 0) {
				numberFactors ++;
			}
		}
		return numberFactors * 2;
	}
}
