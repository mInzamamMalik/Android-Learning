package com.example.demo.formandsubmit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void foo(View view){

        TextView name = (TextView)findViewById(R.id.edittext_name);
        TextView email = (TextView)findViewById(R.id.edittext_email);
        TextView age = (TextView)findViewById(R.id.edittext_age);


        Toast.makeText(this, name.getText() ,Toast.LENGTH_LONG ).show();

        TextView result = (TextView)findViewById(R.id.result);

        result.setText(name.getText());

    }

}
