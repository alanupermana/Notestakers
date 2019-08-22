package com.example.notestakers.splashscreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.notestakers.R;
import com.example.notestakers.onboarding.Introduction;

public class SplashScreen extends AppCompatActivity {
    private int waktu_loading=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.splash_screen );

        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(SplashScreen.this, Introduction.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);

    }
}
