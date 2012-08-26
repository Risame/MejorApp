package com.risame.mejorapp;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Splash extends Activity {
	
	Handler myHandler = new Handler();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    } 

    @Override
	public void onResume() {
		super.onResume();
		myHandler.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				startActivity(new Intent(getApplicationContext(), Login.class));
				finish();
			}
		}, 3000);
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_splash, menu);
        return true;
    }
}
