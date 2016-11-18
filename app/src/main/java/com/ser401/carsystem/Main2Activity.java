package com.ser401.carsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        chooseButton();
    }

    public void chooseButton() {
        final Button sources_button = (Button) findViewById(R.id.media_sources);
        final Button browse_button = (Button) findViewById(R.id.radio_browse);

        View.OnTouchListener listener = new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent e) {

                switch (view.getId()) {
                    case(R.id.radio_browse):
                        startActivity(new Intent(Main2Activity.this, BrowseActivity.class));
                        break;
                    case(R.id.media_sources):
                        startActivity(new Intent(Main2Activity.this, SourcesActivity.class));
                        break;
                }
                return true;
            }


        };

        sources_button.setOnTouchListener(listener);
        browse_button.setOnTouchListener(listener);

    }
}

