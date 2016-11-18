package com.ser401.carsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SourcesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sources);

        setupBlueIMG();
        setupUSBIMG();
    }


    public void setupBlueIMG(){
        final ImageButton blue_button = (ImageButton)findViewById(R.id.blueToothButtonIMG);
        blue_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SourcesActivity.this, BlueActivity.class));
            }
        });
    }

    public void setupUSBIMG(){
        final ImageButton blue_button = (ImageButton)findViewById(R.id.UsbButtonIMG);
        blue_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SourcesActivity.this, UsbActivity.class));
            }
        });
    }
}
