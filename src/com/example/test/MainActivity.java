package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.activity.R;


@SuppressWarnings("deprecation")
public class MainActivity extends ActionBarActivity {
	Button But;
	EditText text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		But = (Button) findViewById(R.id.b1);
		text = (EditText) findViewById(R.id.text_2);
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

