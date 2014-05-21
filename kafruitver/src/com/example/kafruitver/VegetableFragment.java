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

public class VegetableFragment extends Fragment implements AddNumberDialogFragmentListener, SelectCheckBoxListener{
	
	MyApp mApp;
	DialogFragment mAddNumberDialogFragment = new AddNumberDialogFragment();
	CompoundButton mSelectedCheckBox;
	ExpandableListView mExpandableListView;
	OnCheckedChangeListener mOnCheckedChangeListenerImp = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
			mSelectedCheckBox = buttonView;
			if(mSelectedCheckBox.isChecked()){
				mAddNumberDialogFragment.setTargetFragment(VegetableFragment.this, 125);
				mAddNumberDialogFragment.show(getFragmentManager(), "AddNumber");
			}else{Toast.makeText(getActivity(), "Elemento Eliminado de la lista de la compra", Toast.LENGTH_SHORT).show();}			
		}
	};
	
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mApp = (MyApp)getActivity().getApplication();
    }
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View mView = inflater.inflate(R.layout.expandible_main, container, false);
		ExpandableAdapter mExpandableAdapter = mApp.getAdapter();
		mExpandableListView = mApp.getListView();
		ArrayList<String> mHeadersVegetables = mApp.getHeadersVegetables();
		HashMap<String, List<String>> mChildsVegetables = mApp.getChildsVegetables();
		mExpandableListView = (ExpandableListView) mView.findViewById(R.id.expandableList);
		mExpandableAdapter = new ExpandableAdapter(getActivity(), mHeadersVegetables, mChildsVegetables);
		mExpandableAdapter.onSetCheckedChangeListenerImp(mOnCheckedChangeListenerImp);
		mExpandableListView.setAdapter(mExpandableAdapter);
		return mView;
	}

	@Override
	public void doPositiveClick(){Toast.makeText(getActivity(), "Elemento Añadido de la lista de la compra", Toast.LENGTH_SHORT).show();}

	@Override
	public void checkPositive(){if(mSelectedCheckBox != null){mSelectedCheckBox.setChecked(false);}}
}