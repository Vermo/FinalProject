package com.example.kafruitver;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.kafruitver.R;

public class ScreenSplashActivity extends Activity {

	private long mDelay = 1000; //1 segundos
	 
	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.screensplash);
	 
	    TimerTask task = new TimerTask() {
	      @Override
	      public void run() {
	        Intent mainIntent = new Intent().setClass(ScreenSplashActivity.this, MainActivity.class);
	        startActivity(mainIntent);
	        finish();
	      }
	    };
	 
	    Timer timer = new Timer();
	    timer.schedule(task, mDelay);
	  }
}
