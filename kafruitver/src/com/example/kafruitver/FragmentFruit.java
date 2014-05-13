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
import android.widget.ExpandableListView.OnChildClickListener;

public class FragmentFruit extends Fragment {
	
	MyApp mApp;
	private static int startagain;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mApp = (MyApp)getActivity().getApplication();
    }
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View mV = inflater.inflate(R.layout.expandible_main, container, false);
		ExpandableAdapter mAdapter = mApp.getAdapter();
		ExpandableListView mViewExpandable = mApp.getListView();
		ArrayList<String> mHeadersFruits = mApp.getHeadersFruits();
		HashMap<String, List<String>> mChildsFruits = mApp.getChildsFruits();
		mViewExpandable = (ExpandableListView) mV.findViewById(R.id.expandableList);
		mAdapter = new ExpandableAdapter(getActivity(), mHeadersFruits, mChildsFruits);
		mViewExpandable.setAdapter(mAdapter);
		setTargetFragment(this, startagain);
		
		/*mViewExpandable.setOnChildClickListener(new OnChildClickListener() {
			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				
				return false;
			}
		});*/
		return mV;
	}
	
	
}