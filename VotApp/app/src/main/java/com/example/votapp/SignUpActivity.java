package com.example.votapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
public class SignUpActivity extends AppCompatActivity {
TextView login;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_activity);

        login= (TextView) findViewById(R.id.deja_un_mem);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startLogin= new Intent(SignUpActivity.this,loginActivity.class);
                startActivity(startLogin);
            }
        });
    }



}
