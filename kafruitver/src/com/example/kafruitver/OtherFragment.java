package com.example.kafruitver;
import com.example.kafruitver.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
//import android.support.v7.appcompat.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class OtherFragment extends Fragment {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View mView = inflater.inflate(R.layout.fm_other, container, false);
		TextView tv = (TextView) mView.findViewById(R.id.t_other);
		tv.setText("Tab seleccionada" + "\n\n" + "Complementos");;
		return mView;
	}
}
