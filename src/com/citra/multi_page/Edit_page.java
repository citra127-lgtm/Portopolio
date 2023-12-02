package com.citra.multi_page;

import android.os.Bundle;
import android.provider.ContactsContract.Contacts.Data;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Edit_page extends Activity {
	
	EditText editnama,editjmlapp, editjmlfollowers, editjmlfollowing, editketerangan;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_page);
		
		editnama=(EditText)findViewById(R.id.edinm);
		editjmlapp=(EditText)findViewById(R.id.jmlhk);
		editjmlfollowers=(EditText)findViewById(R.id.follw);
		editjmlfollowing=(EditText)findViewById(R.id.follong);
		editketerangan=(EditText)findViewById(R.id.keter);
		
		editnama.setText(Data_profilku.nama);
		editjmlapp.setText(String.valueOf(Data_profilku.jml_aplikasi));
		editjmlfollowers.setText(String.valueOf(Data_profilku.jml_followers));
		editjmlfollowing.setText(String.valueOf(Data_profilku.jml_following));
		editketerangan.setText(String.valueOf(Data_profilku.keterangan));
		
		
		
		
		ImageView panah2=(ImageView)findViewById(R.id.panah2);
		panah2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
		
		Button btnsae =(Button)findViewById(R.id.btnsae);
		btnsae.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Data_profilku.nama=editnama.getText().toString();
				Data_profilku.jml_aplikasi=Integer.parseInt(editjmlapp.getText().toString());
				Data_profilku.jml_followers=Integer.parseInt(editjmlfollowers.getText().toString());
				Data_profilku.jml_following=Integer.parseInt(editjmlfollowing.getText().toString());
				Data_profilku.keterangan=editketerangan.getText().toString();
				Toast.makeText(getApplicationContext(), "Data berhasil disimpan", Toast.LENGTH_SHORT).show();
				finish();
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit_page, menu);
		return true;
	}

}
