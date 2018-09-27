package com.example.klob.appventuresareacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickMe = findViewById(R.id.clickMe);
        final TextView text = findViewById(R.id.textViewOutput);
        final TextView length2Label = findViewById(R.id.textView3);
        final TextView textShape = findViewById(R.id.textViewShape);
        final EditText length1 = findViewById(R.id.editTextLength1);
        final EditText length2 = findViewById(R.id.editTextLength2);
        final ImageButton square = findViewById(R.id.squareButton);
        final ImageButton circle = findViewById(R.id.circleButton);
        final ImageButton triangle = findViewById(R.id.triangleButton);


        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double area = 0;
                if(textShape.getText().equals("Square")) {
                    area = Integer.parseInt(length1.getText().toString())
                            * Integer.parseInt(length1.getText().toString());
                } else if (textShape.getText().equals("Circle")) {
                    area = Integer.parseInt(length1.getText().toString())
                            * Integer.parseInt(length1.getText().toString()) * 3.14;
                } else if (textShape.getText().equals("Triangle")) {
                    area = Integer.parseInt(length1.getText().toString())
                            * Integer.parseInt(length2.getText().toString()) * 0.5;
                } else {
                    // Do nothing
                }

                text.setText("" + area);
            }
        });

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textShape.setText("Square");
                length2Label.setVisibility(View.INVISIBLE);
                length2.setVisibility(View.INVISIBLE);
            }
        });

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textShape.setText("Circle");
                length2Label.setVisibility(View.INVISIBLE);
                length2.setVisibility(View.INVISIBLE);
            }
        });

        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textShape.setText("Triangle");
                length2Label.setVisibility(View.VISIBLE);
                length2.setVisibility(View.VISIBLE);
            }
        });
    }
}
