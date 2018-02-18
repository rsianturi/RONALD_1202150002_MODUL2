package com.example.android.resto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClicked(View view) {

        RadioButton DineIn = (RadioButton) findViewById(R.id.dinein);
        RadioButton TakeAway = (RadioButton) findViewById(R.id.takeaway);

        if(DineIn.isChecked()){
            dineIn();
        }
        else if (TakeAway.isChecked()){
            takeAway();
        }

    }
    public void dineIn(){
        intent = new Intent(this, DineIn.class);
        startActivity(intent);
    }
    public void takeAway(){
        intent = new Intent(this, TakeAway.class);
        startActivity(intent);
    }
}

