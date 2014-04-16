package com.example.kafruitver;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.kafruitver.R;

public class ScreenSplash extends Activity {

	private long mDelay = 3000; //3 segundos
	 
	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.screensplash);
	 
	    TimerTask task = new TimerTask() {
	      @Override
	      public void run() {
	        Intent mainIntent = new Intent().setClass(ScreenSplash.this, MainActivity.class);
	        startActivity(mainIntent);
	        finish();
	      }
	    };
	 
	    Timer timer = new Timer();
	    timer.schedule(task, mDelay);
	  }
}
