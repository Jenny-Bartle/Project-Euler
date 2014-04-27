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
		//text.setText(Problem23());
		setContentView(text);
    }
    
    public void problem1(View view) {
		TextView text = new TextView(this);
		text.setText(Problem1.getProblem1());
		setContentView(text);
    }
}
