package com.example.demo.codecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void increment(View v) {

        TextView TextViewCount = (TextView) findViewById(R.id.Count);

        int count = 0;
        try {
            String temp = TextViewCount.getText().toString();
            count = Integer.parseInt(temp);
        } catch (Exception e) {
        }
        count++;

        TextViewCount.setText(count + "");
    }

    public void decrement(View v) {
        TextView TextViewCount = (TextView) findViewById(R.id.Count);

        int count = 0;
        try {
            String temp = TextViewCount.getText().toString();
            count = Integer.parseInt(temp);
        } catch (Exception e) {
        }

        if (count != 0) count--;

        TextViewCount.setText(count + "");
    }

    public void submit(View v) {
        TextView TextViewPrice = (TextView) findViewById(R.id.price);
        TextView TextViewCount = (TextView) findViewById(R.id.Count);
        TextView TextViewResult = (TextView) findViewById(R.id.result);

        int count = 0;
        int price = 0;

        try {
            price = Integer.parseInt(TextViewPrice.getText().toString());
        } catch (Exception e) {

        }

        try {
            count = Integer.parseInt(TextViewCount.getText().toString());
        } catch (Exception e) {

        }


        int result = price * count;

        TextViewResult.setText(result+"");
    }

}
