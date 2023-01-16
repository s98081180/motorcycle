package com.example.appfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnmoto=findViewById(R.id.btnmoto);
        Button btnoil=findViewById(R.id.btnoil);
        Button btnfix=findViewById(R.id.btnfix);
        Button btndata=findViewById(R.id.btndata);

        btnmoto.setOnClickListener(btnmotoListener);
        btnoil.setOnClickListener(btnoilListener);
        btnfix.setOnClickListener(btnfixListener);
        btndata.setOnClickListener(btndataListener);
    }
    private Button.OnClickListener btnmotoListener=new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,btnmotopage1.class);
            startActivity(intent);
        }
    };
    private Button.OnClickListener btnoilListener=new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,btnoilpage1.class);
            startActivity(intent);
        }
    };
    private Button.OnClickListener btnfixListener=new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,btnfixpage1.class);
            startActivity(intent);
        }
    };
    private Button.OnClickListener btndataListener=new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,btndatapage1.class);
            startActivity(intent);
        }
    };

    }