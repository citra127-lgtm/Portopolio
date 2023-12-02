package com.citra.multi_page;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity {
	EditText username;
	EditText password; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		 username = (EditText)findViewById(R.id.username);
		 password = (EditText)findViewById(R.id.password);
		
		Button btnlogin=(Button)findViewById(R.id.btnlogin);
		btnlogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				String user = username.getText().toString();
				String pass = password.getText().toString();
				if(user.equals(Data_profilku.username) && pass.equals(Data_profilku.password)){
					Intent i =new Intent(getApplicationContext(), Utama.class);
					startActivity(i);
					finish();
				}else{
					Toast.makeText(getApplicationContext(), "Maaf username atau password anda salah", Toast.LENGTH_SHORT).show();
		}
				
				
			}
		});
			
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
