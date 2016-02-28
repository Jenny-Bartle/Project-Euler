package com.jenny.projecteuler;
import android.os.SystemClock;

public class Problem17 implements Problem
{
	public String getAnswer() {
		long startTime = SystemClock.currentThreadTimeMillis();
		long unitsSum = sumUnitLengths();
		long teensSum = sumTeenLengths();
		long hundredSum = sumTo99(unitsSum, teensSum);
		long hundredsSum = sumHundreds();
		long andSum = andLength * 99 * 9;
		long digitsSum = hundredsSum + hundredSum *10 + andSum + oneThousandLength;
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + digitsSum + "\nTime: " + (endTime - startTime);
	}

	@Override
	public String getProblemDescriptor() {
		return "Number letter counts";
	}

	private long sumHundreds() {
		long total = 0;
		for (int unit : unitLengths) {
			total += (unit + hundredLength)*100;
		}
		return total;
	}

	private long sumUnitLengths() {
		long total = 0;
		for (int unit : unitLengths) {
			total += unit;
		}
		return total;
	}
	private long sumTeenLengths() {
		long total = 0;
		for (int teen : teenLengths) {
			total += teen;
		}
		return total;
	}
	private long sumTo99(long unitsSum, long teensSum) {
		long total = unitsSum + teensSum;
		for (int tens : tensLengths) {
			total += (tens*10 + unitsSum);
		}
		return total;
	}
	private static int[] unitLengths = 
	{
		3, 3, 5, 4, 4, 3, 5, 5, 4
	};
	private static int[] tensLengths =
	{
		6, 6, 5, 5, 5, 7, 7, 5
	};
	private static int[] teenLengths =
	{
		3, 6, 6, 8, 8, 7, 7, 9, 8, 8
	};
	private static int hundredLength = 7;
	private static int andLength = 3;
	private static int oneThousandLength = 11;
}
