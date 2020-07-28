package com.example.recycliniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PerEntActivity extends AppCompatActivity {
    public Button button;
    public Button button1;
    ImageView backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per_ent);
        button=(Button)findViewById(R.id.buttonInd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PerEntActivity.this, PersonneActivity.class);
                startActivity(intent);
                finish();


            }
        });


        button1= (Button) findViewById(R.id.buttonEnt);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( PerEntActivity.this,EntrepriseActivity.class);
                startActivity(intent);
                finish();
            }
        });

        backbutton=findViewById(R.id.backbtn);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PerEntActivity.this,BienvActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    }
