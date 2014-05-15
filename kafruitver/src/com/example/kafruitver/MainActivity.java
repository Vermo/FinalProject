package com.example.kafruitver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class MainActivity extends ActionBarActivity{
	 
	@Override
	protected void onCreate(Bundle savedInstanceState){
	  super.onCreate(savedInstanceState);
	  startActivity(new Intent(this, TabsSwipeActionBar.class));
	}

}
