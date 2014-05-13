package com.example.kafruitver;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentListBuy extends Fragment { 
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	}
	  
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View mV = inflater.inflate(R.layout.fm_buy, container, false);
		Button mBuylistAccept = (Button) mV.findViewById(R.id.acceptbuylist);
	    mBuylistAccept.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				//getActivity().startActivity(new Intent(getActivity(), Book.class));
				DialogConfirm mDialogFragment = DialogConfirm.newInstance("¿Estas seguro de tu compra?");
				mDialogFragment.show(getFragmentManager(), "dialog");
			    
				
			}
		});
		return mV;
	}
	
    /*public void doPositiveClick(){
		getActivity().startActivity(new Intent(getActivity(), Book.class));
    }
     
    public void doNegativeClick(){
    }*/
}
