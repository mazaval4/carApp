package com.ser401.carsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class RadioActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio2);

        setupActivity();
    }

    public void setupActivity(){
        //Back and Home Buttons//
        final Button back_button = (Button)findViewById(R.id.radio_back2);
        final Button home_button = (Button)findViewById(R.id.radio_home2);

        //Making a listener//
        View.OnTouchListener listener = new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent e) {

                switch(view.getId()){
                    case(R.id.radio_back2):
                        startActivity(new Intent(RadioActivity2.this, RadioActivity.class));
                        break;
                    case(R.id.radio_home2):
                        startActivity(new Intent(RadioActivity2.this, MainActivity.class));
                        break;
                }
                return true;
            }
        };

        //Set listeners//
        back_button.setOnTouchListener(listener);
        home_button.setOnTouchListener(listener);
    }
}
