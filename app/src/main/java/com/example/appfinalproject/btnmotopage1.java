package com.example.appfinalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class btnmotopage1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btnmotopage1);
        Button btnback=findViewById(R.id.btnback);
        btnback.setOnClickListener(btnbackListener);
        Button btnenter=findViewById(R.id.btnenter);
        btnenter.setOnClickListener(btnenterListener);
        Button btnbackhead=findViewById(R.id.btnbackhead);
        btnbackhead.setOnClickListener(btnbackheadListener);
        Button btninsert=findViewById(R.id.btninsert);
        btninsert.setOnClickListener(btninsertListener);
    }
    private Button.OnClickListener btnbackListener=new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            finish();
        }
    };
    private Button.OnClickListener btnenterListener=new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(btnmotopage1.this,btnoilshowpage1.class);
            startActivity(intent);
        }
    };
    private Button.OnClickListener btnbackheadListener=new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(btnmotopage1.this,MainActivity.class);
            startActivity(intent);
        }
    };
    private Button.OnClickListener btninsertListener=new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(btnmotopage1.this,btnmotoinsertpage1.class);
            startActivity(intent);
        }
    };
    }
