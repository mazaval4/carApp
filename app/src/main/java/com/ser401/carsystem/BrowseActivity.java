package com.ser401.carsystem;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class BrowseActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_browse);

        String [] names = {
                "1: A postcard to china : John Lennon : Cards To Alaska ",
                "2: Growin Boy : John Lennon : Cards To Alaska ",
                "3: Faces : John Lennon : Cards To Alaska ",
                "4: Books toes : John Lennon : Cards To Alaska ",
                "5: Im done : John Lennon : Cards To Alaska ",
                "6: Tired Tonight : John Lennon : Cards To Alaska ",
                "7: Dont be mad : John Lennon : Cards To Alaska ",
                "8: Made Men : John Lennon : Cards To Alaska ",
                "9: I like chords : John Lennon : Cards To Alaska ",
                "10: Computers are cool : John Lennon : Cards To Alaska ",
                "11: Dont crash : John Lennon : Cards To Alaska ",
                "12: Watch It : John Lennon : Cards To Alaska ",
                "13: Typing : John Lennon : Cards To Alaska "
        };
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names));
    }
}
