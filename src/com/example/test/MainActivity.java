package com.example.test;

import com.example.activity.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;





public class MainActivity extends ActionBarActivity {
	Button But;
	EditText text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text = (EditText) findViewById(R.id.input);
		But = (Button) findViewById(R.id.button1);
		But.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				String data1 = text.getText().toString();
				Intent i = new Intent(MainActivity.this, Second_activity.class);
				i.putExtra("username", data1);
				startActivity(i);

			}
		});
	}

}

