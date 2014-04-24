package com.example.kafruitver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class ListCustom extends Activity {

	MyApp mApp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.expandible_main);
		mApp = (MyApp)getApplication();
		ExpandableAdapter mListExpandableAdapter = mApp.getAdapter();
		ExpandableListView mViewExpandable = mApp.getListView();
		ArrayList<String> mHeadersFruits = mApp.getHeadersFruits();
		HashMap<String, List<String>> mChildsFruits = mApp.getChildsFruits();
		
		mViewExpandable = (ExpandableListView) findViewById(R.id.expandableList);
		mListExpandableAdapter = new ExpandableAdapter(this, mHeadersFruits, mChildsFruits);
		mViewExpandable.setAdapter(mListExpandableAdapter);
		
	}
	
}
