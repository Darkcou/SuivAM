package com.example.benjamin.suivam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;


public class SecondActivity extends AppCompatActivity {

    private EditText dateVisite;
    private EditText heureDebut;
    private EditText heureFin;
    private EditText heureArriver;
    private Switch present;
    private Button valider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        dateVisite=(EditText)findViewById(R.id.dtVisite);
        heureDebut=(EditText)findViewById(R.id.edtDebut);
        heureFin=(EditText)findViewById(R.id.edtFin);
        heureArriver=(EditText)findViewById(R.id.edtArriver);
        present=(Switch)findViewById(R.id.swiRV);
        valider=(Button)findViewById(R.id.btnValider);
    }
}
