package com.example.kafruitver;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ConfirmDialogFragment extends DialogFragment{
	
	ConfirmDialogFragmentListener mConfirmDialogFragmentListener;
	
	public interface ConfirmDialogFragmentListener{void doPositiveClick();}

	@Override
	public void onAttach(Activity activity){
		super.onAttach(activity);
		mConfirmDialogFragmentListener = (ConfirmDialogFragmentListener) getTargetFragment();		
	}
	
	@Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
  
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("¿Estas seguro de tu compra?");
        
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id){mConfirmDialogFragmentListener.doPositiveClick();}
        });
 
        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id){dismiss();}
        });
        
        return builder.create();
    }
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
		getDialog().setCanceledOnTouchOutside(false);
		return super.onCreateView(inflater, container, savedInstanceState);
	}
}