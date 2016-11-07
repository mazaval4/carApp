package com.ser401.carsystem;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        setupOtherActivities();
    }

    public void setupOtherActivities(){
        //Back and Home Buttons//
        final Button back_button = (Button)findViewById(R.id.car_back);
        final Button home_button = (Button)findViewById(R.id.car_home);

        //Window and Wiper Image Buttons//
        final ImageButton window_button = (ImageButton)findViewById(R.id.windowBtn);
        final ImageButton wiper_button = (ImageButton)findViewById(R.id.wiperBtn);

        //Making a listener//
        View.OnTouchListener listener = new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent e) {

                switch(view.getId()){
                    case(R.id.windowBtn):
                        startActivity(new Intent(CarActivity.this, WindowActivity.class));
                        break;
                    case(R.id.wiperBtn):
                        startActivity(new Intent(CarActivity.this, WiperActivity.class));
                        break;
                    case(R.id.car_back):

                    case(R.id.car_home):
                        startActivity(new Intent(CarActivity.this, MainActivity.class));
                        break;
                }
                return true;
            }
        };

        //Apply listener to all buttons//
        window_button.setOnTouchListener(listener);
        wiper_button.setOnTouchListener(listener);
        back_button.setOnTouchListener(listener);
        home_button.setOnTouchListener(listener);
    }
}
