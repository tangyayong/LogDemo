package com.example.tangyayong.logdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etInput= (EditText) findViewById(R.id.et_input);
    }


    public void writeLog(View v){
        if (TextUtils.isEmpty(etInput.getText().toString())){
            Toast.makeText(this, "请输入内容", Toast.LENGTH_SHORT).show();
            return;
        }
        MyLogUtils.writeLog(etInput.getText().toString());
    }
}
