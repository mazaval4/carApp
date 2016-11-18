package com.ser401.carsystem;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class BlueActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue);

        String [] names = {
                "1: Device 1 ",
                "2: Device 2",
                "3: Device 3",
                "4: Device 4",
                "5: Device 5",
                "6: Device 6",
                "7: Device 7",
                "8: Device 8",
                "9: Device 9",
                "10: Device 10",
                "11: Device 11",
                "12: Device 12",
                "13: Device 13"
        };
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names));
    }
}
