package com.jenny.projecteuler;
import android.os.*;
import java.util.*;

public class Problem19 implements Problem
{
	public String getAnswer() {
		long startTime = SystemClock.currentThreadTimeMillis();
		int firstSundays = 0;
		for(int year = 1901; year <=2000; year++) {
			for (int month = 1; month <=12; month++) {
				Calendar cal = new GregorianCalendar();
				cal.set(year, month, 1);
				if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
					firstSundays++;
				}
			}
		}

		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + firstSundays + "\nTime: " + (endTime - startTime);
	}

	@Override
	public String getProblemDescriptor() {
		return "Counting Sundays";
	}

}
