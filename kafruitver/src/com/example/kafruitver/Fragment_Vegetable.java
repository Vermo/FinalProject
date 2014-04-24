package com.example.kafruitver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.kafruitver.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

public class Fragment_Vegetable extends Fragment {
	
	MyApp mApp;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mApp = (MyApp)getActivity().getApplication();
    }
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View mV = inflater.inflate(R.layout.expandible_main, container, false);
		ExpandableAdapter mAdapter = mApp.getAdapter();
		ExpandableListView mViewExpandable = mApp.getListView();
		ArrayList<String> mHeadersVegetables = mApp.getHeadersVegetables();
		HashMap<String, List<String>> mChildsVegetables = mApp.getChildsVegetables();
		mViewExpandable = (ExpandableListView) mV.findViewById(R.id.expandableList);
		mAdapter = new ExpandableAdapter(getActivity(), mHeadersVegetables, mChildsVegetables);
		mViewExpandable.setAdapter(mAdapter);
		
		return mV;
	}
	
}
