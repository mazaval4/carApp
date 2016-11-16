package com.ser401.carsystem;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CallerActivity extends AppCompatActivity {

    private List<String> contacts = new ArrayList<>();
    private List<Button> contactList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caller);

        contacts.add("Adam");
        contacts.add("BinHong");
        contacts.add("Miguel");
        contacts.add("Seema");
        contacts.add("Shokoufee");
        contacts.add("Talab");
        contacts.add("Zach");

        initializeContacts();
        onClickActivities();
    }

    private void onClickActivities()
    {
        final Button one = (Button)findViewById(R.id.caller_one);
        final Button two = (Button)findViewById(R.id.caller_two);
        final Button three = (Button)findViewById(R.id.caller_three);
        final Button four = (Button)findViewById(R.id.caller_four);
        final Button five = (Button)findViewById(R.id.caller_five);
        final Button six = (Button)findViewById(R.id.caller_six);
        final Button seven = (Button)findViewById(R.id.caller_seven);
        final Button eight = (Button)findViewById(R.id.caller_eight);
        final Button nine = (Button)findViewById(R.id.caller_nine);
        final Button asterisk = (Button)findViewById(R.id.caller_asterisk);
        final Button zero = (Button)findViewById(R.id.caller_zero);
        final Button pound = (Button)findViewById(R.id.caller_pound);
        final Button delete = (Button)findViewById(R.id.caller_delete);
        final Button deleteAll = (Button)findViewById(R.id.caller_deleteAll);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('1');
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('2');
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('3');
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('4');
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('5');
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('6');
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('7');
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('8');
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('9');
            }
        });
        asterisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('*');
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('0');
            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('#');
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                delete();
            }
        });
        deleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deleteAll();
            }
        });

    }

    private void update(char input)
    {
        final TextView output = (TextView) findViewById(R.id.caller_UserInput);

        output.setText(output.getText().toString() + input);
        limit(output);
        updateContacts(output.getText().toString());
    }

    private void limit(TextView output)
    {
        int length = output.getText().toString().length();
        if (length > 16)
        {
            output.setText(output.getText().subSequence(length - 16, length));
        }
    }

    private void delete()
    {
        final TextView output = (TextView) findViewById(R.id.caller_UserInput);

        int length = output.length();
        if (length > 0)
        {
            output.setText(output.getText().toString().subSequence(0, length - 1));
        }
        updateContacts(output.getText().toString());
    }

    private void deleteAll()
    {
        final TextView output = (TextView) findViewById(R.id.caller_UserInput);

        while (output.length() > 0)
        {
            delete();
        }
        allContacts();
    }

    private void initializeContacts()
    {
        contactList.add((Button)findViewById(R.id.caller_contact_one));
        contactList.add((Button)findViewById(R.id.caller_contact_two));
        contactList.add((Button)findViewById(R.id.caller_contact_three));
        contactList.add((Button)findViewById(R.id.caller_contact_four));
        contactList.add((Button)findViewById(R.id.caller_contact_five));
        contactList.add((Button)findViewById(R.id.caller_contact_six));
        contactList.add((Button)findViewById(R.id.caller_contact_seven));

        allContacts();
    }

    private void allContacts()
    {
        for (int i = 0; i < contacts.size(); i ++)
        {
            contactList.get(i).setText(contacts.get(i));
        }
    }

    private void updateContacts(String searchTerm)
    {
        if (searchTerm.isEmpty())
        {
            allContacts();
            return;
        }

        List<String> results = new ArrayList<>();
        char[] searchTerms = searchTerm.toCharArray();

        for (int i = 0; i < contacts.size(); i++)
        {
            char[] toCheck = contacts.get(i).toCharArray();

            if (checkCharArrays(searchTerms, toCheck, 0, 0))
            {
                results.add(contacts.get(i));
            }
        }

        if(!results.isEmpty())
        {
            for (int i = 0; i < results.size(); i++)
            {
                contactList.get(i).setText(results.get(i));
            }

            for (int i = results.size() - 1; i < contactList.size(); i++)
            {
                contactList.get(i).setText("");
            }
        }
        else
        {
            for (int i = 0; i < contactList.size(); i++)
            {
                contactList.get(i).setText("");
            }
        }

    }

    private boolean checkCharArrays(char[] searchTerm, char[] toCheck, int searchStart, int checkStart)
    {

        if (searchTerm[searchStart] == toCheck[checkStart])
        {
            if (searchStart + 1 == searchTerm.length)
            {
                return true;
            }
            else if (checkCharArrays(searchTerm, toCheck, checkStart + 1, searchStart + 1))
            {
                return true;
            }
            else
            {
                return checkCharArrays(searchTerm, toCheck, 0, searchStart + 1);
            }
        }
        else
        {
            return false;
        }
    }
}
