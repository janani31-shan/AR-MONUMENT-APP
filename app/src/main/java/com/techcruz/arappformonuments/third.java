package com.techcruz.arappformonuments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        RelativeLayout rt1,rt2,rt3,rt4,rt5,rt6;
        rt1=findViewById(R.id.rt1);
        rt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(third.this,forthmaps.class);
                startActivity(intent);
            }
        });

        rt2=findViewById(R.id.rt2);
        rt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(third.this,fourthreligious.class);
                startActivity(intent);
            }
        });

        rt3=findViewById(R.id.rt3);
        rt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(third.this,fourthstatue.class);
                startActivity(intent);
            }
        });

        rt4=findViewById(R.id.rt4);
        rt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(third.this,fourthunesco.class);
                startActivity(intent);
            }
        });

        rt5=findViewById(R.id.rt5);
        rt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(third.this,forthmemorial.class);
                startActivity(intent);
            }
        });

        rt6=findViewById(R.id.rt6);
        rt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(third.this,fourtharchae.class);
                startActivity(intent);
            }
        });

    }
}