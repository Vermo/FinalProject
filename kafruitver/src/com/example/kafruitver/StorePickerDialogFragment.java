package com.example.kafruitver;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class StorePickerDialogFragment extends DialogFragment{
	
	private static int single = 0;
	final String[] mStores = {"Calle Buen Orden 12", "Avenida Barón de Carcer 51"};
	StorePickerFragmentListener mStorePickerFragmentListener;
	
	public interface StorePickerFragmentListener{void swapSelectorStore(String mStores);}
	
	@Override
	public void onAttach(Activity activity){
		super.onAttach(activity);
		mStorePickerFragmentListener = (StorePickerFragmentListener) getActivity();
	}
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState){
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		builder.setTitle(R.string.tittle);
		DialogSelectStore(builder, mStores);
		return builder.create();
	}
	
	private void DialogSelectStore(AlertDialog.Builder builder, final String[] mStores) {
		builder.setSingleChoiceItems(mStores, single, new DialogInterface.OnClickListener() {
			@Override
        	public void onClick(DialogInterface dialog, int which) {			
				mStorePickerFragmentListener.swapSelectorStore(mStores[which]);
        		dialog.dismiss();
        	}
        });
	}
}