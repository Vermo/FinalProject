package com.example.kafruitver;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

/*---------------------------------------------------------------------------------------------------------
 * FALTA GENERALIZAR ESTE METODO, QUE LAS FUNCIONES doPositiveClick() y doNegativeClick() 
  se ejecuten en el fragmento que van a ser usados (para este caso han de estar en FragmentListBuy.java)
  -------------------------------------------------------------------------------------------------------**/
public class DialogConfirm extends DialogFragment {
	
	static DialogConfirm newInstance(String title){
		DialogConfirm fragment = new DialogConfirm();
        Bundle args = new Bundle();
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }
 
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String title = getArguments().getString("title");
        setCancelable(false);
        return new AlertDialog.Builder(getActivity())
            .setIcon(R.drawable.ic_launcher)
            .setTitle(title)
            .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            	
                @Override
                public void onClick(DialogInterface dialog, int which) {
                	dismiss();
                	doPositiveClick();
                }
            })
            .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                 
                @Override
                public void onClick(DialogInterface dialog, int which) {
                	dismiss();
                	doNegativeClick();
                }
            })
            .create();
    }
    
    public void doPositiveClick(){
		getActivity().startActivity(new Intent(getActivity(), Book.class));
    }
     
    public void doNegativeClick(){
    	//getActivity().startActivity(new Intent(getActivity(), FragmentFruit.class));
    	getActivity().getActionBar().setSelectedNavigationItem(0);
    }

}
