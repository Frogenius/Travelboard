package com.example.travelb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.Toast;

public class Kalendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalendar);
        //
        Button buttonK = (Button) findViewById(R.id.profil);

        buttonK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(Kalendar.this, HomeActivity.class);
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
                    Intent intent = new Intent(Kalendar.this, MapsF.class);
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
                    Intent intent = new Intent(Kalendar.this, Pogoda.class);
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
                    Intent intent = new Intent(Kalendar.this, Search.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }

        });



}
}