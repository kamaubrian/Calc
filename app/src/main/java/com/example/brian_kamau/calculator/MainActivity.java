package com.example.brian_kamau.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText num1;
    EditText num2;
    Button add, substract,multiply,div;
    double result_num;
    int no1,no2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result =(TextView) findViewById(R.id.result);
        num1 =(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        add=(Button)findViewById(R.id.add);
        substract=(Button)findViewById(R.id.sub);
        multiply=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                no1=Integer.parseInt(num1.getText().toString());
                no2=Integer.parseInt(num2.getText().toString());
                result_num=no1+no2;

                result.setText(String.valueOf(result_num));
            }
        });
        substract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                no1=Integer.parseInt(num1.getText().toString());
                no2=Integer.parseInt(num2.getText().toString());
                result_num=no1-no2;

                result.setText(String.valueOf(result_num));
            }
        });
        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                no1=Integer.parseInt(num1.getText().toString());
                no2=Integer.parseInt(num2.getText().toString());
                result_num=no1/no2;

                result.setText(String.valueOf(result_num));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                no1=Integer.parseInt(num1.getText().toString());
                no2=Integer.parseInt(num2.getText().toString());
                result_num=no1*no2;

                result.setText(String.valueOf(result_num));
            }
        });


    }
}
