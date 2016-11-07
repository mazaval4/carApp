package com.ser401.carsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class WiperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wiper);

        setupOtherActivities();
    }

    public void setupOtherActivities(){
        //Back and Home Buttons//
        final Button back_button = (Button)findViewById(R.id.wiper_back);
        final Button home_button = (Button)findViewById(R.id.wiper_home);

        //Making a listener//
        View.OnTouchListener listener = new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent e) {

                switch(view.getId()){
                    case(R.id.wiper_back):
                        startActivity(new Intent(WiperActivity.this, CarActivity.class));
                        break;
                    case(R.id.wiper_home):
                        startActivity(new Intent(WiperActivity.this, MainActivity.class));
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
