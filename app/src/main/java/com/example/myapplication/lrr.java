package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class lrr extends AppCompatActivity {
    Button f00, f0, f1, f2, f3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lrr);
        f00 = (Button) findViewById(R.id.f00);
        f0 = (Button) findViewById(R.id.f0);
        f1 = (Button) findViewById(R.id.f1);
        f2 = (Button) findViewById(R.id.f2);
        f3 = (Button) findViewById(R.id.f3);


        f00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f00 = new Intent(getApplicationContext(), lrr00.class);
                startActivity(f00);
            }
        });

        f0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f0 = new Intent(getApplicationContext(), lrr0.class);
                startActivity(f0);
            }
        });

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f1 = new Intent(getApplicationContext(), lrr1.class);
                startActivity(f1);
            }
        });
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f2 = new Intent(getApplicationContext(), lrr2.class);
                startActivity(f2);
            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f3 = new Intent(getApplicationContext(), lrr3.class);
                startActivity(f3);
            }
        });
    }
}