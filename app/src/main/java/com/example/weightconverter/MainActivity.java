package com.example.weightconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    private TextView textView5;

    private EditText editTextNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);

        textView5=findViewById(R.id.textView5);

        editTextNumber=findViewById(R.id.editTextNumber);


       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "submitted sucessfully", Toast.LENGTH_SHORT).show();

               String s = editTextNumber.getText().toString();

               int kg = Integer.parseInt(s);

               double pound = 2.205 * kg;

               textView5.setText("the value of pound is " + pound);
           }
       });


            }

       }
                ;
