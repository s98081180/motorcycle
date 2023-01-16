package com.example.appfinalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class btndatapage1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btndatapage1);
        Button btncancal=findViewById(R.id.btncancal);
        btncancal.setOnClickListener(btncancalListener);
        Button btnenter=findViewById(R.id.btnenter);
        btnenter.setOnClickListener(btnenterListener);
        Button btnbackhead=findViewById(R.id.btnbackhead);
        btnbackhead.setOnClickListener(btnbackheadListener);
        Button btninsert=findViewById(R.id.btninsert);
    }
    private Button.OnClickListener btncancalListener=new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            finish();
        }
    };
    private Button.OnClickListener btnbackheadListener=new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(btndatapage1.this,MainActivity.class);
            startActivity(intent);
        }
    };
    private Button.OnClickListener btnenterListener=new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(btndatapage1.this,btndatashowpage1.class);
            startActivity(intent);
        }
    };
    }
