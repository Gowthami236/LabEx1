
package com.example.test;


import com.example.activity.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Second_activity extends Activity {
	TextView result;
	TextView result1;
	TextView result2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sec);
		result = (TextView) findViewById(R.id.text2);
		result1 = (TextView) findViewById(R.id.text);
		result2 = (TextView) findViewById(R.id.text5);
		Typeface tfont = Typeface.createFromAsset(getAssets(),
				"AlexBrush-Regular.ttf");
		Typeface t1font = Typeface.createFromAsset(getAssets(),
				"BlackOpsOne-Regular.ttf");
		Typeface t2font = Typeface.createFromAsset(getAssets(),
				"HomemadeApple.ttf");
		Intent i = getIntent();
		String datafrmMain = i.getStringExtra("username");
		result.setTypeface(tfont);
		result.setText("Hai " + datafrmMain);
		result1.setTypeface(t1font);
		result1.setText("Hello " + datafrmMain);
		result2.setTypeface(t2font);
		result2.setText("Welcome " + datafrmMain);

	}

}
