package com.ser401.carsystem;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class UsbActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usb);

        String [] names = {
                "1: USBDevice 1 ",
                "2: USBDevice 2",
                "3: USBDevice 3",
                "4: USBDevice 4",
                "5: USBDevice 5",
                "6: USBDevice 6",
                "7: USBDevice 7",
                "8: USBDevice 8",
                "9: USBDevice 9",
                "10: USBDevice 10",
                "11: USBDevice 11",
                "12: USBDevice 12",
                "13: USBDevice 13"
        };
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names));
    }
}
