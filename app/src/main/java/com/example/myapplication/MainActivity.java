package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction1(View view){
        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText editTextTextPersonName2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String str1 = editTextTextPersonName.getText().toString();
        String str2 = editTextTextPersonName2.getText().toString();

        goToActivity1(str1,str2);
    }

    public void clickFunction2(View view){
        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText editTextTextPersonName2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String str1 = editTextTextPersonName.getText().toString();
        String str2 = editTextTextPersonName2.getText().toString();

        goToActivity2(str1,str2);
    }

    public void clickFunction3(View view){
        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText editTextTextPersonName2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String str1 = editTextTextPersonName.getText().toString();
        String str2 = editTextTextPersonName2.getText().toString();

        goToActivity3(str1,str2);
    }

    public void clickFunction4(View view){
        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText editTextTextPersonName2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String str1 = editTextTextPersonName.getText().toString();
        String str2 = editTextTextPersonName2.getText().toString();

        goToActivity4(str1,str2);
    }

    public void goToActivity1(String s1, String s2){
        Intent intent = new Intent(this, MainActivity2.class);
        String s = "1";
        intent.putExtra("message1", s1);
        intent.putExtra("message2", s2);
        intent.putExtra("message3", s);
        startActivity(intent);
    }

    public void goToActivity2(String s1, String s2){
        Intent intent = new Intent(this, MainActivity2.class);
        String s = "2";
        intent.putExtra("message1", s1);
        intent.putExtra("message2", s2);
        intent.putExtra("message3", s);
        startActivity(intent);
    }

    public void goToActivity3(String s1, String s2){
        Intent intent = new Intent(this, MainActivity2.class);
        String s = "3";
        intent.putExtra("message1", s1);
        intent.putExtra("message2", s2);
        intent.putExtra("message3", s);
        startActivity(intent);
    }

    public void goToActivity4(String s1, String s2){
        Intent intent = new Intent(this, MainActivity2.class);
        String s = "4";
        intent.putExtra("message1", s1);
        intent.putExtra("message2", s2);
        intent.putExtra("message3", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}