package com.example.benjamin.suivam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Error;
    private Button Check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=(EditText)findViewById(R.id.edtNom);
        Password=(EditText)findViewById(R.id.edtPassword);
        Error=(TextView)findViewById(R.id.txtErreur);
        Check=(Button)findViewById(R.id.btnValider);

    }

    private void validate(String userName,String userPassword){

        if(userName=="test" && userPassword=="1234"){
            Intent intent= new Intent(MainActivity.this, SecondActivity.class);
        }
    }
}
