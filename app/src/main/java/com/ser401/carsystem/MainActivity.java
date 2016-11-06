package com.ser401.carsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarTouchListener listener = new CarTouchListener();

        ImageButton carButton = (ImageButton)findViewById(R.id.carBtn);
        carButton.setOnTouchListener(listener);
    }

    public class CarTouchListener implements View.OnTouchListener{
        @Override
        public boolean onTouch(View v, MotionEvent e){
            int button = v.getId();
            switch(button){
                case(R.id.carBtn):
                    setContentView(R.layout.car_layout_step2);
                    ImageButton windowButton = (ImageButton)findViewById(R.id.windowBtn);
                    windowButton.setOnTouchListener(new CarTouchListener());
                    ImageButton wiperButton = (ImageButton)findViewById(R.id.wiperBtn);
                    wiperButton.setOnTouchListener(new CarTouchListener());
                    break;
                case(R.id.windowBtn):
                    setContentView(R.layout.window_layout);
                    break;
                case(R.id.wiperBtn):
                    setContentView(R.layout.wiper_layout);
                    break;
            }

            return true;
        }
    }


}


