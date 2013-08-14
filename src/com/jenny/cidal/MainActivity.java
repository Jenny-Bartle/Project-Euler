package com.jenny.cidal;

import android.view.*;
import android.widget.*;
import android.app.*;
import android.os.*;
import java.util.List;
import java.util.ArrayList;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
		TextView text = new TextView(this);
		text.setText(Problem3());
		setContentView(text);
    }
	public String Problem3() {
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
