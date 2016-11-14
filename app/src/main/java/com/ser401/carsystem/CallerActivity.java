package com.ser401.carsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CallerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caller);

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

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update(1);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update(2);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update(3);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update(4);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update(5);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update(6);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update(7);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update(8);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update(9);
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
                update(0);
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

    }

    private void update(int input)
    {
        final TextView output = (TextView) findViewById(R.id.caller_UserInput);

        output.setText(output.getText().toString() + input);
        limit(output);
    }

    private void update(char input)
    {
        final TextView output = (TextView) findViewById(R.id.caller_UserInput);

        output.setText(output.getText().toString() + input);
        limit(output);
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
    }
}
