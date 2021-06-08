package com.example.travelb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Paris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paris);

        Button buttonBack = (Button) findViewById(R.id.btnLog1);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(Paris.this, Atrakcji.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }

        });

    }
}