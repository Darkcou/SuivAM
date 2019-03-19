package com.example.benjamin.suivam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class PremierActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premier);
    }
    private void validate(String userName,String userPassword){

        if(userName=="test" && userPassword=="1234"){
            Intent intent= new Intent(PremierActivity.this, SecondActivity.class);
        }
    }
}
