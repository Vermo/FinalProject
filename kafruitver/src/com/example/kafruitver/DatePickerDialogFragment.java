package com.example.kafruitver;

import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

public class DatePickerDialogFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

	DatePickerFragmentListener mDatePickerFragmentListener;
	
	public interface DatePickerFragmentListener{void onFinishDatePickerDialog(int year, int month, int day);}
	
	@Override
	public void onAttach(Activity activity){
		super.onAttach(activity);
		mDatePickerFragmentListener = (DatePickerFragmentListener) getActivity();
	}
	
	@Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }
	
	@Override
	public void onDateSet(DatePicker view, int year, int month, int day){mDatePickerFragmentListener.onFinishDatePickerDialog(year, month, day);}
}