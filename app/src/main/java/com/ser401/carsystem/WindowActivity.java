package com.ser401.carsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class WindowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window);

        setupOtherActivities();
    }

    public void setupOtherActivities(){
        //Back and Home Buttons//
        final Button back_button = (Button)findViewById(R.id.window_back);
        final Button home_button = (Button)findViewById(R.id.window_home);

        //Making a listener//
        View.OnTouchListener listener = new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent e) {

                switch(view.getId()){
                    case(R.id.window_back):
                        startActivity(new Intent(WindowActivity.this, CarActivity.class));
                        break;
                    case(R.id.window_home):
                        startActivity(new Intent(WindowActivity.this, MainActivity.class));
                        break;
                }
                return true;
            }
        };

        //Apply listener to all buttons//
        back_button.setOnTouchListener(listener);
        home_button.setOnTouchListener(listener);
    }
}
