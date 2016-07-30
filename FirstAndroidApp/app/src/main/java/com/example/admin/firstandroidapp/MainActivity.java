package com.example.admin.firstandroidapp;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    protected void voteIncrement( View v ){
        int vote = 0;

        TextView voteCount = (TextView)findViewById(R.id.voteCount);

        try {
            String voteString = voteCount.getText().toString();
            vote = Integer.parseInt(voteString);
        }catch(Exception e){}

        vote++;

        String temp =  vote+"";


        voteCount.setText(temp);

    }





}
