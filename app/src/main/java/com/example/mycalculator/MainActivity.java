package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1,number2;
    private ImageButton plusBtn,minusBtn,divideBtn,multiplyBtn;
    private TextView tv_ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.num_1);
        number2 = findViewById(R.id.num_2);

        plusBtn = findViewById(R.id.plusbtn);
        minusBtn = findViewById(R.id.minusbtn);
        divideBtn = findViewById(R.id.dividebtn);
        multiplyBtn = findViewById(R.id.multiplybtn);
        tv_ans = findViewById(R.id.ans);


        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int ansValue = plusnumbers();
                tv_ans.setText(String.valueOf(ansValue));

            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int ansValue = minusnumbers();
                tv_ans.setText(String.valueOf(ansValue));


            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int ansValue = multiplynumbers();
                tv_ans.setText(String.valueOf(ansValue));



            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int ansValue = dividenumbers();
                tv_ans.setText(String.valueOf(ansValue));


            }
        });

    }

    private int plusnumbers(){

        int x = Integer.parseInt(number1.getText().toString());
        int y = Integer.parseInt(number2.getText().toString());

        return x + y;



    }
    private int minusnumbers(){

        int x = Integer.parseInt(number1.getText().toString());
        int y = Integer.parseInt(number2.getText().toString());

        return x - y;



    }
    private int multiplynumbers(){

        int x = Integer.parseInt(number1.getText().toString());
        int y = Integer.parseInt(number2.getText().toString());

        return x * y;



    }
    private int dividenumbers(){

        int x = Integer.parseInt(number1.getText().toString());
        int y = Integer.parseInt(number2.getText().toString());

        return x / y;



    }



}