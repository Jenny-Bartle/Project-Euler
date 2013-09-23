package com.jenny.cidal;
import java.math.*;
import android.app.*;
import android.os.*;

public class Problem15
{
	public String Problem15() {
		long startTime = SystemClock.currentThreadTimeMillis();
		BigInteger fac20 = factorial(20, 1);
		BigInteger fac40 = factorial(40, 20);
		BigInteger noRoutes = fac40.divide(fac20);
		// 40!/(20!*20!)
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + noRoutes.longValue() + "\nTime: " + (endTime - startTime);
	}

	private BigInteger factorial(long startNo, long endNo) {
		BigInteger total = BigInteger.valueOf(1);
		while(startNo > endNo) {
			total = total.multiply(BigInteger.valueOf(startNo));
			startNo--;
		}
		return total;
	}

}
