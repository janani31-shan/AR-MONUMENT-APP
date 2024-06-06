package com.techcruz.arappformonuments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class splashac extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashac);



        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {

                Intent i = new Intent(splashac.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 4000);

    }
}