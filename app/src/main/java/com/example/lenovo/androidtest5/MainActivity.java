package com.example.lenovo.androidtest5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.t);
    }
    public void onClick(View view){
        Intent intent=new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("url","http://www.baidu.com");
        startActivity(intent);
    }
}