package com.example.juanmanuel.strategicactivation;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class Main4Activity extends AppCompatActivity {
    Chronometer chronometer;
    Button start,stop,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        String font_path = "fonts/IndieFlower.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(),font_path);
        chronometer = (Chronometer)findViewById(R.id.chronometer1);
        chronometer.setTypeface(TF);
        start = (Button)findViewById(R.id.button1);
        start.setTypeface(TF);
        stop = (Button)findViewById(R.id.button2);
        stop.setTypeface(TF);
        reset = (Button)findViewById(R.id.button3);
        reset.setTypeface(TF);

        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                chronometer.start();

            }
        });

        stop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                chronometer.stop();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                chronometer.setBase(SystemClock.elapsedRealtime());

            }
        });
    }
}
