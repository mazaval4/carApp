package com.ser401.carsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupCarActivity();
        setupRadioActivity();
    }

    public void setupCarActivity(){
        final ImageButton car_button = (ImageButton)findViewById(R.id.carBtn);
        car_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent e) {
                startActivity(new Intent(MainActivity.this, CarActivity.class));
                return true;
            }
        });
    }

    public void setupRadioActivity(){
        final ImageButton radio_button = (ImageButton)findViewById(R.id.radioBtn);
        radio_button.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent e){
                startActivity(new Intent(MainActivity.this, RadioActivity.class));
                return true;
            }
        });
    }
}
