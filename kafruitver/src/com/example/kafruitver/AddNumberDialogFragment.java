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
import android.widget.EditText;

public class AddNumberDialogFragment extends DialogFragment {
	
	AddNumberDialogFragmentListener mAddNumberDialogFragmentListener;
	SelectCheckBoxListener mSelectCheckBoxListener;
	public static float addkg = 0;
	EditText numberaddedittext;
	String myAddnumberitem;
	
	public interface AddNumberDialogFragmentListener{void doPositiveClick();}
	public interface SelectCheckBoxListener{void checkPositive();} 
	
	@Override
	public void onAttach(Activity activity){
		super.onAttach(activity);
		mAddNumberDialogFragmentListener = (AddNumberDialogFragmentListener) getTargetFragment();
		mSelectCheckBoxListener = (SelectCheckBoxListener) getTargetFragment();
	}
	
	@Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
  
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()); 
        View mView = getActivity().getLayoutInflater().inflate(R.layout.addnumberdialog, null);
        builder.setView(mView);
        numberaddedittext = (EditText) getActivity().findViewById(R.id.numberaddkg);
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id){
            	if(numberaddedittext != null){
            		myAddnumberitem = numberaddedittext.getText().toString();
            		addkg = Float.parseFloat(myAddnumberitem);
            	}
            	mAddNumberDialogFragmentListener.doPositiveClick();
            }
        });
 
        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id){
            	mSelectCheckBoxListener.checkPositive();
            	dismiss();
            }
        });      
        return builder.create();
    }
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
		getDialog().setCanceledOnTouchOutside(false);
		return super.onCreateView(inflater, container, savedInstanceState);
	}
}