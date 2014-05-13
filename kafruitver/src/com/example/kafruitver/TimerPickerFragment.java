package com.example.kafruitver;

import java.util.Calendar;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.widget.TimePicker;
import android.app.*;

public class TimerPickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

	public interface TimePickerFragmentListener{ 
		void onFinishTimePickerDialog(int hour, int minute); 
	}
	
	@Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        // Use the current time as the default values for the picker
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
 
        // Create a new instance of TimePickerDialog and return it
        return new TimePickerDialog(getActivity(), this, hour, minute, DateFormat.is24HourFormat(getActivity()));
    }
	
	@Override
	public void onTimeSet(TimePicker view, int hour, int minute){
		TimePickerFragmentListener mTPFL = (TimePickerFragmentListener) getActivity(); 
		mTPFL.onFinishTimePickerDialog(hour, minute);
		
	}

}
