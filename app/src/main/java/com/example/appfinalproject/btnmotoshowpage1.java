package com.example.appfinalproject;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class btnmotoshowpage1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btnmotoshowpage1);
        Button btnback=findViewById(R.id.btnback);
        btnback.setOnClickListener(btnbackListener);
        Button btnbackhead=findViewById(R.id.btnbackhead);
        btnbackhead.setOnClickListener(btnbackheadListener);
    }
    private Button.OnClickListener btnbackheadListener=new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(btnmotoshowpage1.this,MainActivity.class);
            startActivity(intent);
        }
    };
    private Button.OnClickListener btnbackListener=new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
    }
