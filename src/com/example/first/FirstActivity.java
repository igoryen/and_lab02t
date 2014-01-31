package com.example.first;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		
		// Create a Button
        Button b1 = (Button) findViewById(R.id.button);

        // Create an Intent 
        final Intent myIntent = new Intent(this, SecondActivity.class);

        // Set up a button event handler that activates SecondActivity
        // by using an anonymous class 
        b1.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
            	startActivity(myIntent);
        	}
    	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.first, menu);
		return true;
	}

}
