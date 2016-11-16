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
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('1');
            }
        });

        final Button two = (Button)findViewById(R.id.caller_two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('2');
            }
        });

        final Button three = (Button)findViewById(R.id.caller_three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('3');
            }
        });

        final Button four = (Button)findViewById(R.id.caller_four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('4');
            }
        });

        final Button five = (Button)findViewById(R.id.caller_five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('5');
            }
        });

        final Button six = (Button)findViewById(R.id.caller_six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('6');
            }
        });

        final Button seven = (Button)findViewById(R.id.caller_seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('7');
            }
        });

        final Button eight = (Button)findViewById(R.id.caller_eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('8');
            }
        });

        final Button nine = (Button)findViewById(R.id.caller_nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('9');
            }
        });

        final Button asterisk = (Button)findViewById(R.id.caller_asterisk);
        asterisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('*');
            }
        });

        final Button zero = (Button)findViewById(R.id.caller_zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('0');
            }
        });

        final Button pound = (Button)findViewById(R.id.caller_pound);
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update('#');
            }
        });

        final Button delete = (Button)findViewById(R.id.caller_delete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                delete();
            }
        });

        final Button deleteAll = (Button)findViewById(R.id.caller_deleteAll);
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

        //Remove everything in 'output'
        while (output.length() > 0)
        {
            delete();
        }

        //Restore the search result of the contactList
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
        //print all contacts
        for (int i = 0; i < contacts.size(); i ++)
        {
            contactList.get(i).setText(contacts.get(i));
        }
    }

    private void updateContacts(String searchTerm)
    {
        //Print all contacts and quit if the textView is empty
        if (searchTerm.isEmpty())
        {
            allContacts();
            return;
        }

        //Declare a list to be used to store results
        List<String> results = new ArrayList<>();
        //Convert searchTerm to char array for compare purpose
        char[] searchTerms = searchTerm.toCharArray();

        //Loop through the contacts list to check every contact
        for (int i = 0; i < contacts.size(); i++)
        {
            //Convert the contact string into char array
            char[] toCheck = contacts.get(i).toCharArray();

            //Compare the char arrays
            if (checkCharArrays(searchTerms, toCheck))
            {
                results.add(contacts.get(i));
            }
        }

        //Print out the search results
        for (int i = 0; i < results.size(); i++)
        {
            contactList.get(i).setText(results.get(i));
        }

        //Clear of the rest of the boxes
        for (int i = results.size(); i < contactList.size(); i++)
        {
            contactList.get(i).setText("");
        }
    }

    private boolean checkCharArrays(char[] searchTerm, char[] toCheck)
    {
        //Check if the given searchTerm is longer than toCheck
        if (searchTerm.length > toCheck.length)
        {
            return false;
        }

        //Check through the searchTerm through toCheck
        for (int i = 0; i < searchTerm.length; i ++)
        {
            //Return false if any character turns out to not match
            if (!ifEquals(searchTerm[i], toCheck[i]))
            {
                return false;
            }
        }

        return true;
    }

    //Comparing the user input with actual characters
    private boolean ifEquals(char input, char toSearch)
    {
        //Make sure all characters to be checked are in upper case
        toSearch = Character.toUpperCase(toSearch);

        switch (input)
        {
            //Check the characters according to the input as intended
            case '2':
                return (toSearch == 'A' || toSearch == 'B' || toSearch == 'C');
            case '3':
                return (toSearch == 'D' || toSearch == 'E' || toSearch == 'F');
            case '4':
                return (toSearch == 'G' || toSearch == 'H' || toSearch == 'I');
            case '5':
                return (toSearch == 'J' || toSearch == 'K' || toSearch == 'L');
            case '6':
                return (toSearch == 'M' || toSearch == 'N' || toSearch == 'O');
            case '7':
                return (toSearch == 'P' || toSearch == 'Q' || toSearch == 'R' || toSearch == 'S');
            case '8':
                return (toSearch == 'T' || toSearch == 'U' || toSearch == 'V');
            case '9':
                return (toSearch == 'W' || toSearch == 'X' || toSearch == 'Y' || toSearch == 'Z');

            //Characters / Numbers not associated with any actual character will return false
            case '1':
            case '0':
            case '*':
            case '#':
            default:
                return false;
        }
    }
}
