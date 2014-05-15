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

public class VegetableFragment extends Fragment{
	
	MyApp mApplication;
	
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mApplication = (MyApp)getActivity().getApplication();
    }
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View mView = inflater.inflate(R.layout.expandible_main, container, false);
		ExpandableAdapter mExpandableAdapter = mApplication.getAdapter();
		ExpandableListView mExpandableListView = mApplication.getListView();
		ArrayList<String> mHeadersVegetables = mApplication.getHeadersVegetables();
		HashMap<String, List<String>> mChildsVegetables = mApplication.getChildsVegetables();
		mExpandableListView = (ExpandableListView) mView.findViewById(R.id.expandableList);
		mExpandableAdapter = new ExpandableAdapter(getActivity(), mHeadersVegetables, mChildsVegetables);
		mExpandableListView.setAdapter(mExpandableAdapter);
		return mView;
	}	
}