package com.jenny.projecteuler;
import android.os.SystemClock;

import java.math.BigInteger;

public class Problem15 implements Problem
{
	public String getAnswer() {
		long startTime = SystemClock.currentThreadTimeMillis();
		BigInteger fac20 = factorial(20, 1);
		BigInteger fac40 = factorial(40, 20);
		BigInteger noRoutes = fac40.divide(fac20);
		// 40!/(20!*20!)
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + noRoutes.longValue() + "\nTime: " + (endTime - startTime);
	}

	@Override
	public String getProblemDescriptor() {
		return "Lattice paths";
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
