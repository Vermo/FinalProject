package com.example.kafruitver;
import com.example.kafruitver.ConfirmDialogFragment.ConfirmDialogFragmentListener;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class ListBuyFragment extends Fragment implements ConfirmDialogFragmentListener{ 
	
	ConfirmDialogFragment mConfirmDialogFragment = new ConfirmDialogFragment();
	
	@Override
	public void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState);}
	  
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View mView = inflater.inflate(R.layout.fm_buy, container, false);
		Button buylistAcceptButton = (Button) mView.findViewById(R.id.acceptbuylist);
		buylistAcceptButton.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				mConfirmDialogFragment.setTargetFragment(ListBuyFragment.this, 100);
				mConfirmDialogFragment.show(getFragmentManager(), "dialog");
			}
		});
		return mView;
	}
	
	/*METODO DEL DIALOG TRAS PULSAR EL BOTON ACEPTAR, UNA VEZ TENGAMOS NUESTRA LISTA DE LA COMPRA HECHA*/
    public void doPositiveClick(){getActivity().startActivity(new Intent(getActivity(), BookActivity.class));}
}
