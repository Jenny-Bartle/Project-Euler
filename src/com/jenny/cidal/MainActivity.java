package com.jenny.cidal;

import android.view.*;
import android.widget.*;
import android.app.*;
import android.os.*;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.math.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
		TextView text = new TextView(this);
		text.setText(Problem23());
		setContentView(text);
    }

	public String Problem23() {
		long startTime = SystemClock.currentThreadTimeMillis();
		int UPPER_BOUND = 28124;
		List<Integer> abundantNumbers = new ArrayList<Integer>();
		for (int i = 12; i < UPPER_BOUND; i++) {
			if (i < properDivisorsSum(i)) {
				abundantNumbers.add(i);
			}
		}
		long notAbundantNumberSum = 0;
		for (int i = 1; i < UPPER_BOUND; i++) {
			notAbundantNumberSum += i;
		}
		long abundantNumberSum = 0;
		int abundantNumbersSize = abundantNumbers.size();
		for (int i = 0; i < abundantNumbersSize; i++) {
			for (int j = i; j < abundantNumbersSize; j++) {
				int sum = abundantNumbers.get(i) + abundantNumbers.get(j);
				if (sum < UPPER_BOUND) {
					abundantNumberSum += sum;
				}
				else {
					break;
				}
			}
		}
		notAbundantNumberSum -= abundantNumberSum;
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + notAbundantNumberSum + "\nTime: " + (endTime - startTime);
	}

	private int properDivisorsSum(int findDivisors) {
		double sqrt = Math.sqrt(findDivisors);
		int divisorsSum = 1;
		for (int i = 2; i <= sqrt; i++) {
			if ((findDivisors % i) == 0) {
				divisorsSum += i;
				divisorsSum += (findDivisors / i);
			}
		}
		return divisorsSum;
	}
	
}
