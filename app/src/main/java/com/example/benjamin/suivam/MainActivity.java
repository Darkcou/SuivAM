package com.example.benjamin.suivam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView interdition;
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        interdition=(TextView)findViewById(R.id.dtVisite);
        logo=(ImageView) findViewById(R.id.imgMatrix);
        validate("1","2",interdition,logo);
            }

    private void validate(String userName,String userPassword, TextView interdition,ImageView logo){

        if(userName=="test" && userPassword=="1234"){
            Intent intent= new Intent(MainActivity.this, SecondActivity.class);
        }
        else {
            logo.setVisibility(View.INVISIBLE);
            interdition.setVisibility(View.VISIBLE);
        }
    }
}
