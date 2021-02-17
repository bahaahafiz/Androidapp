package com.example.androidapp;

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
        final EditText ed_first =findViewById(R.id.et_Firstnumber);
        final EditText ed_secend =findViewById(R.id.et_secondNumber);
        final TextView result =findViewById(R.id.tv_result);
        Button sum  =findViewById(R.id.btn_sum);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1= ed_first.getText().toString();
                String num2=ed_secend.getText().toString();
                int number1=Integer.parseInt(num1);
                int number2 =Integer.parseInt(num2);
                int finalresult=number1+number2;
                result.setText("Result ="+finalresult);
                

            }
        });

    }
}