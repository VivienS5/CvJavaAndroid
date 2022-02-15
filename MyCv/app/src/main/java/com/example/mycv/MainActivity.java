package com.example.mycv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.chip.Chip;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Chip buttonExpe = (Chip) findViewById(R.id.chipExpe);
        buttonExpe.setOnClickListener(this);
        Chip buttonForma = (Chip) findViewById(R.id.chipForma);
        buttonForma.setOnClickListener(this);
        Chip buttonReal = (Chip) findViewById(R.id.chipReal);
        buttonReal.setOnClickListener(this);
        Chip buttonCompe = (Chip) findViewById(R.id.chipComp);
        buttonCompe.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.chipExpe:

                Intent intent= new Intent(MainActivity.this, ExpeActivity.class);
                startActivity(intent);

                break;

            case R.id.chipForma:

                intent = new Intent(MainActivity.this, FormaActivity.class);
                startActivity(intent);

                break;

            case R.id.chipReal:

                intent = new Intent(MainActivity.this, RealActivity.class);
                startActivity(intent);

                break;

            case R.id.chipComp:

                intent = new Intent(MainActivity.this, CompeActivity.class);
                startActivity(intent);

                break;

            default:
                break;
        }

    }


}


