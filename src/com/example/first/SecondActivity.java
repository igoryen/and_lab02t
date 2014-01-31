package com.example.first;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast; // lab2:3
import android.content.Context; // lab2:3
import android.content.Intent;

public class SecondActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		
       	super.onCreate(savedInstanceState);
        setContentView(R.layout.secondary);
        
    	// lab2:3 --- start
    	Context context = getApplicationContext();
    	//CharSequence text = "Hello toast!";
    	int duration = Toast.LENGTH_LONG;

    	Intent intent = getIntent();
    	
    	Toast toast = Toast.makeText(context, intent.getExtras().getString("toast_string"), duration);
    	toast.show();
    	// lab2:3 --- finish 
    	
    	
    }
}