package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = (TextView)findViewById(R.id.textView2);
        Intent intent = getIntent();
        int num = Integer.parseInt(intent.getStringExtra("message3"));
        double num1 = Integer.parseInt(intent.getStringExtra("message1"));
        int num2 = Integer.parseInt(intent.getStringExtra("message2"));
        double num3 = 0;
        if (num == 1){
            num3 = num1+num2;
        }
        else if(num == 2){
            num3 = num1 - num2;
        }
        else if(num == 3){
            num3 = num1 * num2;
        }
        else if(num == 4){
            num3 = num1 / num2;
        }
        String s = "" + num3;
        textView2.setText(s);
    }
}