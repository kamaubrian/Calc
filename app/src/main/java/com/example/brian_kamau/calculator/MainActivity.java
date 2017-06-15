package com.example.brian_kamau.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.MissingResourceException;

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
            public void onClick(View v)  {

                if(num1.getText().equals(null)){
                    Toast.makeText(MainActivity.this,"Enter Number",Toast.LENGTH_LONG).show();

                    return;
                }
                if(num2.getText().equals(null)){
                    num1.toString();
                    num1.setText("Enter Number");
                    return;
                }
                no1=Integer.parseInt(num1.getText().toString());
                no2=Integer.parseInt(num2.getText().toString());
                result_num=no1+no2;

                result.setText(String.valueOf(result_num));
                Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_LONG).show();

            }
        });
        substract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(num1.getText()==null){
                    num1.setText("Enter Number");

                    return;
                }
                if(num2.getText()==null){
                    num1.setText("Enter Number");

                    return;
                }
                no1=Integer.parseInt(num1.getText().toString());
                no2=Integer.parseInt(num2.getText().toString());
                result_num=no1-no2;

                result.setText(String.valueOf(result_num));
                Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_LONG).show();

            }
        });
        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(num1.getText()==null){
                    num1.setText("Enter Number");

                    return;
                }
                if(num2.getText()==null){
                    num1.setText("Enter Number");

                    return;
                }
                no1=Integer.parseInt(num1.getText().toString());
                no2=Integer.parseInt(num2.getText().toString());
                result_num=no1/no2;

                result.setText(String.valueOf(result_num));
                Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_LONG).show();

            }
        });
        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)  throws MissingResourceException{
                if(num1.getText()==null){
                    num1.setText("Enter Number");

                    return;
                }
                if(num2.getText()==null){
                    num1.setText("Enter Number");

                    return;
                }
                no1=Integer.parseInt(num1.getText().toString());
                no2=Integer.parseInt(num2.getText().toString());
                result_num=no1*no2;

                result.setText(String.valueOf(result_num));
                Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_LONG).show();

            }
        });


    }
}
