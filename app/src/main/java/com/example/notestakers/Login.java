package com.example.notestakers;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.notestakers.Home.HomeFragment;

public class Login extends AppCompatActivity {
    Button btnLogin;
    TextView tvSignup;
    EditText username,pass;
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


        username = (EditText)findViewById(R.id.username);
        pass = (EditText)findViewById(R.id.pass);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameKey = username.getText().toString();
                String passKey = pass.getText().toString();

                if(usernameKey.equals("mosyen") && passKey.equals("123")){
                    Toast.makeText(getApplicationContext(),"LOGIN SUCCESS",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this, Main.class);
                    startActivity(intent);
                }else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                    builder.setMessage("Username or Password invalid!")
                            .setNegativeButton("Retry",null).create().show();
                }
            }
        });

    }
}



