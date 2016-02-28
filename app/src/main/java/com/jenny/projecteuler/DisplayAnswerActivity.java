package com.jenny.projecteuler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayAnswerActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_answer);

	    // Get the problem from the intent
	    Intent intent = getIntent();
	    String message = intent.getStringExtra(MainActivity.PROBLEM);
		try {
			Class<Problem> c = (Class<Problem>) Class.forName(message);
			Problem problem = (Problem) c.newInstance();
			TextView questionText = (TextView)findViewById(R.id.QuestionBox);
			TextView answerText = (TextView)findViewById(R.id.AnswerBox);
			questionText.setText(problem.getProblemDescriptor());
			answerText.setText(problem.getAnswer());
		} catch (Exception e) {

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_answer, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		return id == R.id.action_settings || super.onOptionsItemSelected(item);
	}
}
