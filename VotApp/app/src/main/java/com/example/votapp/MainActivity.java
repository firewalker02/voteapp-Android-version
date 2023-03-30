package com.example.votapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView suite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);
suite= (TextView) findViewById(R.id.suite);

suite.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent= new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(intent);

    }
});

    }


    /*

    <!--<?xml version="1.0" encoding="utf-8"?>-->
<!--<selector xmlns:android="http://schemas.android.com/apk/res/android">-->

<!--&lt;!&ndash;    <item android:state_checked="false">&ndash;&gt;-->
<!--&lt;!&ndash;        <shape android:shape="rectangle">&ndash;&gt;-->
<!--&lt;!&ndash;            <solid android:color="@android:color/white"/>&ndash;&gt;-->
<!--&lt;!&ndash;            <corners android:radius="100sp"/>&ndash;&gt;-->
<!--&lt;!&ndash;            <stroke android:color="#8e8e8e"&ndash;&gt;-->
<!--&lt;!&ndash;                android:width="1dp"/>&ndash;&gt;-->
<!--&lt;!&ndash;        </shape>&ndash;&gt;-->
<!--&lt;!&ndash;    </item>&ndash;&gt;-->

<!--    <item android:state_checked="true">-->
<!--        <shape android:shape="@drawable/rectangle_switch_vote">-->
<!--            <solid android:color="@color/blanc"/>-->
<!--            <corners android:radius="100sp"/>-->
<!--        </shape>-->
<!--    </item>-->

<!--</selector>-->
     */
}