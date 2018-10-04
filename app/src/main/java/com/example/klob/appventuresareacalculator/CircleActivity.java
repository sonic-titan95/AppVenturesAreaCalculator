package com.example.klob.appventuresareacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CircleActivity extends AppCompatActivity {

    Button calculate;
    TextView area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        calculate = findViewById(R.id.calculateCircle);
        area = findViewById(R.id.areaCircle);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText r = findViewById(R.id.radius);
                int radius = Integer.parseInt(r.getText().toString());
                area.setText("" + radius * radius * 3.14);
            }
        });
    }
}
