package com.example.klob.appventuresareacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TriangleActivity extends AppCompatActivity {

    Button calculate;
    TextView area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        calculate = findViewById(R.id.calculateTriangle);
        area = findViewById(R.id.areaTriangle);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText a = findViewById(R.id.height);
                int height = Integer.parseInt(a.getText().toString());
                EditText b = findViewById(R.id.width);
                int width = Integer.parseInt(b.getText().toString());
                area.setText("" + width * height * 0.5);
            }
        });
    }
}
