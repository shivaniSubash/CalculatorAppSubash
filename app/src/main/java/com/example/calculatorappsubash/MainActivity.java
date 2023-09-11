package com.example.calculatorappsubash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText num1ET = findViewById(R.id.editTextNumberInputBox);
    String strNum1 = num1ET.getText().toString();
    int num1= Integer.valueOf(strNum1);
    EditText num2ET = findViewById(R.id.editTextNumberInputBox2);
    String strNum2 = num2ET.getText().toString();
    int num2 = Integer.valueOf(strNum2);
    public void mult(){
       int output= num1*num2;
    }
}