package com.example.klob.appventuresareacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton square = findViewById(R.id.squareButton);
        final ImageButton circle = findViewById(R.id.circleButton);
        final ImageButton triangle = findViewById(R.id.triangleButton);

        square.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(MainActivity.this,SquareActivity.class);
               startActivity(i);
           }
        });

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,CircleActivity.class);
                startActivity(i);
            }
        });

        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,TriangleActivity.class);
                startActivity(i);
            }
        });
    }
}
