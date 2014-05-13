package com.example.kafruitver;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.example.kafruitver.DatePickerFragment.DatePickerFragmentListener;
import com.example.kafruitver.TimerPickerFragment.TimePickerFragmentListener;

public class Book extends FragmentActivity implements TimePickerFragmentListener,DatePickerFragmentListener{
	
	TextView txtdate, txttime;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.book);
	    
	    txtdate = (TextView) findViewById(R.id.selectdate);
	    txttime = (TextView) findViewById(R.id.selecthour);
	    
	    txtdate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				DialogFragment mDFD = new DatePickerFragment();
				mDFD.show(getSupportFragmentManager(), "datePicker");
				
			}
		});
	    
	    txttime.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				   DialogFragment mDFT = new TimerPickerFragment();
				   mDFT.show(getSupportFragmentManager(), "timePicker");				
			}
		});
	    
	}
		 
	@Override 
	public void onFinishDatePickerDialog(int year, int month, int day){   
		txtdate.setText(day + "/" + month + "/" + year);
	}
	
	@Override 
	public void onFinishTimePickerDialog(int hour, int minute) { 
		txttime.setText(hour + ":" + String.format("%02d", minute));
	}

}
