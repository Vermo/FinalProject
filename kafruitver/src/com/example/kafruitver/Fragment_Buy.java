package com.example.kafruitver;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_Buy extends Fragment {
		
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	}
	  
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View mV = inflater.inflate(R.layout.fm_buy, container, false);
		TextView tv = (TextView) mV.findViewById(R.id.t_buy);
		tv.setText("Tab seleccionada" + "\n\n" + "Listado de Compra");;
		return mV;
	}
		
}
