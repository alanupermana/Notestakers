package com.example.notestakers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    Button btnSignUp;
    TextView tvSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sign_up );

        tvSignin = findViewById(R.id.tvSignin);
        btnSignUp = findViewById(R.id.btn_signUp);
        tvSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignUp.this,Login.class);
                startActivity(i);
            }
        });
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this,Profile.class);
                startActivity(intent);
            }
        });

    }
}
