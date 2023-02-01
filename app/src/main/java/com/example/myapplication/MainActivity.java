package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;


public class MainActivity extends AppCompatActivity {

    private LinearLayout b;
    private Button b7;
    Handler h;
    private int m = -1, c = 0, d = 5;

    Date x, xx, rtime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b7 = findViewById(R.id.b7);


    }


    public void OnClickStart(View view) {
        finish();
        startActivity(new Intent(MainActivity.this, Activity2.class));


    }

        }