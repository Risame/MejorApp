package com.risame.mejorapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity {

	EditText mUsername;
	EditText mPassword;
	Button mLoginButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        mUsername = (EditText) findViewById(R.id.login_username);
        mPassword = (EditText) findViewById(R.id.login_password);
        mLoginButton = (Button) findViewById(R.id.login_button);
              
        mLoginButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				showToast("Please wait...", Toast.LENGTH_SHORT);
				
				if(mUsername.equals("guest") && mUsername.equals("guest")){
                    
                } else {
                	showToast("Please check your Username and/or Passsword", Toast.LENGTH_LONG);
                }			
			}
		});
    }

    private void showToast(String msg, int time) {
    	LayoutInflater inflater = getLayoutInflater();
		View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.toast_layout_root));

		ImageView image = (ImageView) layout.findViewById(R.id.image);
		image.setImageResource(R.drawable.ic_launcher);
		TextView text = (TextView) layout.findViewById(R.id.text);
		text.setText(msg);

		Toast toast = new Toast(getApplicationContext());
		toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		toast.setDuration(time);
		toast.setView(layout);
		toast.show();
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login, menu);
        return true;
    }
}
