package com.ser401.carsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        setupOtherActivities();
    }

    public void setupOtherActivities(){
        //Back and Home Buttons//
        final Button back_button = (Button)findViewById(R.id.radio_back);
        final Button home_button = (Button)findViewById(R.id.radio_home);

        final Button am_button = (Button)findViewById(R.id.amBtn);
        final Button fm_button = (Button)findViewById(R.id.fmBtn);

        //Making a listener//
        View.OnTouchListener listener = new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent e) {

                switch(view.getId()){

                    case(R.id.amBtn):

                    case(R.id.fmBtn):
                        startActivity(new Intent(RadioActivity.this, RadioActivity2.class));
                        break;

                    case(R.id.radio_back):

                    case(R.id.radio_home):
                        startActivity(new Intent(RadioActivity.this, MainActivity.class));
                        break;
                }
                return true;
            }
        };

        //Set listeners//
        back_button.setOnTouchListener(listener);
        home_button.setOnTouchListener(listener);
        am_button.setOnTouchListener(listener);
        fm_button.setOnTouchListener(listener);
    }
}
