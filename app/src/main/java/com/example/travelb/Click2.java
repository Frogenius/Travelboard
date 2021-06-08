package com.example.travelb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Click2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click2);

        Button buttonK = (Button) findViewById(R.id.profil);

        buttonK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(Click2.this, HomeActivity.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }

        });

        Button buttonMap = (Button) findViewById(R.id.map);

        buttonMap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(Click2.this, MapsF.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }

        });
        Button buttonPogoda = (Button) findViewById(R.id.pogoda);

        buttonPogoda.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(Click2.this, Pogoda.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }

        });

        Button buttonSearch = (Button) findViewById(R.id.search);

        buttonSearch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(Click2.this, Search.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }

        });
        Button buttonKal = (Button) findViewById(R.id.kalendar);

        buttonKal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(Click2.this, Kalendar.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }

        });
        /*Button next = (Button) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(Click2.this, Click2.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }

        });*/
    }
}