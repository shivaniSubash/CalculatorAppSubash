package com.example.calculatorappsubash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.editTextNumberInputBox).requestFocus(1);
    }
    public void mult(){
        EditText num1ET = findViewById(R.id.editTextNumberInputBox);
        String strNum1 = num1ET.getText().toString();
        double num1= Double.valueOf(strNum1);

        EditText num2ET = findViewById(R.id.editTextNumberInputBox2);
        String strNum2 = num2ET.getText().toString();
        double num2 = Double.valueOf(strNum2);
        TextView outputBox = findViewById(R.id.textViewNumberOutputBox);

        double output= num1*num2;

        outputBox.setText(String.valueOf(output));

    }
    public void sub(){
        EditText num1ET = findViewById(R.id.editTextNumberInputBox);
        String strNum1 = num1ET.getText().toString();
        double num1= Double.valueOf(strNum1);

        EditText num2ET = findViewById(R.id.editTextNumberInputBox2);
        String strNum2 = num2ET.getText().toString();
        double num2 = Double.valueOf(strNum2);
        TextView outputBox = findViewById(R.id.textViewNumberOutputBox);

        double output = num1-num2;

        outputBox.setText(String.valueOf(output));
    }
    public void add(){
        EditText num1ET = findViewById(R.id.editTextNumberInputBox);
        String strNum1 = num1ET.getText().toString();
        double num1= Double.valueOf(strNum1);

        EditText num2ET = findViewById(R.id.editTextNumberInputBox2);
        String strNum2 = num2ET.getText().toString();
        double num2 = Double.valueOf(strNum2);
        TextView outputBox = findViewById(R.id.textViewNumberOutputBox);

        double output = num1+num2;

        outputBox.setText(String.valueOf(output));
    }
    public void exp(){
        EditText num1ET = findViewById(R.id.editTextNumberInputBox);
        String strNum1 = num1ET.getText().toString();
        double num1= Double.valueOf(strNum1);

        EditText num2ET = findViewById(R.id.editTextNumberInputBox2);
        String strNum2 = num2ET.getText().toString();
        double num2 = Double.valueOf(strNum2);
        TextView outputBox = findViewById(R.id.textViewNumberOutputBox);

        double output = Math.pow(num1, num2);

        outputBox.setText(String.valueOf(output));
    }
    public void root(){
        EditText num1ET = findViewById(R.id.editTextNumberInputBox);
        String strNum1 = num1ET.getText().toString();
        double num1= Double.valueOf(strNum1);

        TextView outputBox = findViewById(R.id.textViewNumberOutputBox);

        double output = (double) Math.sqrt(num1);

        outputBox.setText(String.valueOf(output));
    }
    public void cubeRoot(){
        EditText num1ET = findViewById(R.id.editTextNumberInputBox);
        String strNum1 = num1ET.getText().toString();
        double num1= Double.valueOf(strNum1);

        TextView outputBox = findViewById(R.id.textViewNumberOutputBox);

        double output = Math.pow(num1, (1/3));

        outputBox.setText(String.valueOf(output));
    }
    public void divide(){
        EditText num1ET = findViewById(R.id.editTextNumberInputBox);
        String strNum1 = num1ET.getText().toString();
        double num1= Double.valueOf(strNum1);

        EditText num2ET = findViewById(R.id.editTextNumberInputBox2);
        String strNum2 = num2ET.getText().toString();
        double num2 = Double.valueOf(strNum2);
        TextView outputBox = findViewById(R.id.textViewNumberOutputBox);

        double output = num1/num2;

        outputBox.setText(String.valueOf(output));
    }
    public void mod(){
        EditText num1ET = findViewById(R.id.editTextNumberInputBox);
        String strNum1 = num1ET.getText().toString();
        double num1= Double.valueOf(strNum1);

        EditText num2ET = findViewById(R.id.editTextNumberInputBox2);
        String strNum2 = num2ET.getText().toString();
        double num2 = Double.valueOf(strNum2);
        TextView outputBox = findViewById(R.id.textViewNumberOutputBox);

        double output=num1%num2;

        outputBox.setText(String.valueOf(output));
    }
    public void factorial(){
        EditText num1ET = findViewById(R.id.editTextNumberInputBox);
        String strNum1 = num1ET.getText().toString();
        double num1= Double.valueOf(strNum1);

        TextView outputBox = findViewById(R.id.textViewNumberOutputBox);

        int output = 1;
        for (int i=1; i<= num1; i++){
            output*=i;
        }
        //calculation of a factorial using a for loop taken from ChatGPT
        outputBox.setText(String.valueOf(output));
    }
    public void numberClick(View v) {
        EditText num1ET;
        TextView operator = findViewById(R.id.textViewOperation);
        if (operator.getText().equals("")) {
            num1ET = findViewById(R.id.editTextNumberInputBox);
        } else {
            num1ET = findViewById(R.id.editTextNumberInputBox2);
        }

        String strNum1 = num1ET.getText().toString();
        Button b = (Button) findViewById(v.getId());
        String newValue=strNum1+b.getText();
        num1ET.setText(newValue);
    }
    public void operatorClick(View v) {
        Button b = (Button) findViewById(v.getId());
        TextView operator = findViewById(R.id.textViewOperation);
        operator.setText(b.getText());
        findViewById(R.id.editTextNumberInputBox2).requestFocus(1);
    }

    public void equals(View v){
        TextView operation = findViewById(R.id.textViewOperation);
        if (operation.getText().equals("+")){
            add();
        }
        if (operation.getText().equals("-")){
            sub();
        }
        if (operation.getText().equals("x")){
            mult();
        }
        if (operation.getText().equals("/")){
            divide();
        }
        if (operation.getText().equals("^")){
            exp();
        }
        if (operation.getText().equals("%")){
            mod();
        }
        if (operation.getText().equals("∛")){
            cubeRoot();
        }
        if (operation.getText().equals("√")){
            root();
        }
        if (operation.getText().equals("!")){
            factorial();
        }

    }
    public void allCancel(View v){
        TextView text1 = findViewById(R.id.editTextNumberInputBox);
        text1.setText("");
        TextView text2 = findViewById(R.id.editTextNumberInputBox2);
        text2.setText("");
        TextView text = findViewById(R.id.textViewNumberOutputBox);
        text.setText("");
        TextView operator = findViewById(R.id.textViewOperation);
        operator.setText("");
        findViewById(R.id.editTextNumberInputBox).requestFocus(1);
    }
}