package com.example.kafruitver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.kafruitver.AddNumberDialogFragment.AddNumberDialogFragmentListener;
import com.example.kafruitver.AddNumberDialogFragment.SelectCheckBoxListener;

public class FruitFragment extends Fragment implements AddNumberDialogFragmentListener, SelectCheckBoxListener{
	
	MyApp mApp;
	CompoundButton mSelectedCheckBox;
	DialogFragment mAddNumberDialogFragment = new AddNumberDialogFragment();
	ExpandableListView mViewExpandable;
	OnCheckedChangeListener mOnCheckedChangeListenerImp = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
			mSelectedCheckBox = buttonView;
			if(mSelectedCheckBox.isChecked()){
				mAddNumberDialogFragment.setTargetFragment(FruitFragment.this, 125);
				mAddNumberDialogFragment.show(getFragmentManager(), "AddNumber");
			}else{Toast.makeText(getActivity(), "Elemento Eliminado de la lista de la compra", Toast.LENGTH_SHORT).show();}			
		}
	};
	
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mApp = (MyApp)getActivity().getApplication();
    }
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View mView = inflater.inflate(R.layout.expandible_main, container, false);
		ExpandableAdapter mAdapter = mApp.getAdapter();
		mViewExpandable = mApp.getListView();
		ArrayList<String> mHeadersFruits = mApp.getHeadersFruits();
		HashMap<String, List<String>> mChildsFruits = mApp.getChildsFruits();
		mViewExpandable = (ExpandableListView) mView.findViewById(R.id.expandableList);
		mAdapter = new ExpandableAdapter(getActivity(), mHeadersFruits, mChildsFruits);
		mAdapter.onSetCheckedChangeListenerImp(mOnCheckedChangeListenerImp);
		mViewExpandable.setAdapter(mAdapter);
		return mView;
	}

	@Override
	public void doPositiveClick(){Toast.makeText(getActivity(), "Elemento Añadido de la lista de la compra", Toast.LENGTH_SHORT).show();}

	@Override
	public void checkPositive(){if(mSelectedCheckBox != null){mSelectedCheckBox.setChecked(false);}}

}