package com.example.kafruitver;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DialogAddNumber extends Fragment {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);  
	}
	  
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View mV = inflater.inflate(R.layout.fm_addnumber, container, false);
		return mV;
	}
		
}
