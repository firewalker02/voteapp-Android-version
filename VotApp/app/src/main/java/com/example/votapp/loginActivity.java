package com.example.votapp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
public class loginActivity extends AppCompatActivity{
TextView loginIn;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        loginIn=(TextView) findViewById(R.id.log_in);
        loginIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent create_voteIntent= new Intent(loginActivity.this,createVoteActivity.class);
                startActivity(create_voteIntent);
            }
        });
    }



}
