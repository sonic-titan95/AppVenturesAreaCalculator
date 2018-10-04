package com.example.klob.appventuresareacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SquareActivity extends AppCompatActivity {

    Button calculate;
    TextView area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        calculate = findViewById(R.id.calculateSquare);
        area = findViewById(R.id.areaSquare);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText l = findViewById(R.id.length);
                int length = Integer.parseInt(l.getText().toString());
                area.setText("" + length * length);
            }
        });
    }
}
