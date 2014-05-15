package com.example.kafruitver;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kafruitver.DatePickerDialogFragment.DatePickerFragmentListener;
import com.example.kafruitver.FinishBookAlertDialog.FinishBookAlertDialogListener;
import com.example.kafruitver.StorePickerDialogFragment.StorePickerFragmentListener;
import com.example.kafruitver.TimerPickerDialogFragment.TimePickerFragmentListener;

public class BookActivity extends FragmentActivity implements TimePickerFragmentListener,DatePickerFragmentListener,StorePickerFragmentListener,FinishBookAlertDialogListener{
	
	DialogFragment mDateDialogFragment = new DatePickerDialogFragment();
	DialogFragment mTimeDialogFragment = new TimerPickerDialogFragment();
	DialogFragment mStoreDialogFragment = new StorePickerDialogFragment();
	DialogFragment mFinishDialogFragment = new FinishBookAlertDialog();
	TextView datetextview, timetextview, selectstoretextview;
	Button bookListbutton;
	int count = 0;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.book);
	    
	    datetextview = (TextView) findViewById(R.id.selectdate);
	    timetextview = (TextView) findViewById(R.id.selecthour);
	    selectstoretextview = (TextView) findViewById(R.id.selectstore);
	    bookListbutton = (Button) findViewById(R.id.bookbuy);
	    
	    datetextview.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){mDateDialogFragment.show(getSupportFragmentManager(), "datePicker");}
		});
	    
	    timetextview.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){mTimeDialogFragment.show(getSupportFragmentManager(), "timePicker");}
		});
	    
	    selectstoretextview.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){mStoreDialogFragment.show(getSupportFragmentManager(), "StorePicker");}
		});
	    
	    bookListbutton.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){mFinishDialogFragment.show(getSupportFragmentManager(), "FinishBook");}
		});
	    
	}
		 
	/*METODO DEL DIALOG DATE -- ESTABLECER FECHA DEL PEDIDO A RECOGER*/
	@Override 
	public void onFinishDatePickerDialog(int year, int month, int day){datetextview.setText(day + "/" + month + "/" + year);}
	
	/*METODO DEL DIALOG TIME -- ESTABLECER HORA DEL PEDIDO A RECOGER*/
	@Override 
	public void onFinishTimePickerDialog(int hour, int minute){timetextview.setText(hour + ":" + String.format("%02d", minute));}

	/*METODO DEL DIALOG STORE (SELECCION DE TIENDA) -- ESTABLECER TIENDA DONDE SE HA REALIZADO EL PEDIDO*/
	@Override
	public void swapSelectorStore(String mStores){selectstoretextview.setText(mStores);}

	/*METODO DEL DIALOG FINAL PARA ENVIAR EL PEDIDO JUNTO CON SU RESERVA*/
	@Override
	public void doAcceptFinish(){
		// TODO Auto-generated method stub 
		// FALTA IMPLEMENTAR EL METODO 
	}
	
	/*METODO QUE DESHABILITA EL BOTON VOLVER*/
	@Override
	public void onBackPressed() {
		if(count >= 1){super.onBackPressed();}
		else{
		  count++;
		  Toast.makeText(this,"Pulse una vez mas para volver", Toast.LENGTH_SHORT).show();
		}
	}
}
