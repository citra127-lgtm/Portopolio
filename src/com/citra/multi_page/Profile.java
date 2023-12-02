package com.citra.multi_page;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends Activity {
	
	void tampilkanData(){
		
		TextView lblnama=(TextView)findViewById(R.id.tikk1);
		lblnama.setText(Data_profilku.nama);
		TextView lbljmlapp = (TextView)findViewById(R.id.jmlapp);
		lbljmlapp.setText(String.valueOf(Data_profilku.jml_aplikasi));
		
		TextView lbljmlfwr=(TextView)findViewById(R.id.jmlwr);
		lbljmlfwr.setText(String.valueOf(Data_profilku.jml_followers));
		TextView lbljmlflw=(TextView)findViewById(R.id.jmlflw);
		lbljmlflw.setText(String.valueOf(Data_profilku.jml_following));
		
		TextView lblaou=(TextView)findViewById(R.id.trd);
		lblaou.setText("About"+ Data_profilku.nama);
		TextView lblket=(TextView)findViewById(R.id.sklh);
		lblket.setText(Data_profilku.keterangan);
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		tampilkanData();
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);
		
		tampilkanData();
		
		ImageView panah=(ImageView)findViewById(R.id.panah);
		panah.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
		Button btnlogout=(Button)findViewById(R.id.btnlogout);
		btnlogout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),Login.class);
				startActivity(i);
				finish();
				
			}
		});
		ImageView edit=(ImageView)findViewById(R.id.edit);
		edit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),Edit_page.class);
				startActivity(i);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.profile, menu);
		return true;
	}

}
