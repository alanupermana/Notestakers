package com.example.notestakers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    Button btnLogin;
    TextView tvSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

        btnLogin = findViewById(R.id.btn_login);
        tvSignup = findViewById(R.id.tvSignup);
        tvSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this,SignUp.class);
                startActivity(i);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Profile.class);
                startActivity(intent);
            }
        });
    }



}
