package com.techcruz.arappformonuments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button arrow1,secondjourney,arform;
        arrow1=findViewById(R.id.arrow1);
        arrow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(second.this,MainActivity.class);
                startActivity(intent);
            }
        });

        secondjourney=findViewById(R.id.second_startjourney);
        secondjourney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(second.this,third.class);
                startActivity(intent);
            }
        });







    }
}