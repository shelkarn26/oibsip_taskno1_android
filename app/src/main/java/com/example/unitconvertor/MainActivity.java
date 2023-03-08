package com.example.unitconvertor;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar action_bar = getSupportActionBar();
        if (action_bar != null) {
            action_bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.purple_500)));
        }

        CardView area_card, length_card, temperature_card, speed_card, mass_card;

        area_card = findViewById(R.id.cardView_area);
        length_card = findViewById(R.id.cardView_length);
        temperature_card = findViewById(R.id.cardView_temperature);
        speed_card = findViewById(R.id.cardView_speed);
        mass_card = findViewById(R.id.cardView_mass);

        area_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AreaActivity.class));
            }
        });

        length_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LengthActivity.class));
            }
        });

        temperature_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TemperatureActivity.class));
            }
        });

        speed_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SpeedActivity.class));
            }
        });

        mass_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MassActivity.class));
            }
        });
    }

}