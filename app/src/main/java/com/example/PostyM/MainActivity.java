package com.example.PostyM;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button PostyBtn = (Button)findViewById(R.id.internalBtn);
        PostyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent strInt = new Intent(getApplicationContext(), PostyActivity.class);
                startActivity(strInt);
            }
        });

        Button afBtn = (Button)findViewById(R.id.externalBtn);
        afBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st ="https://www.youtube.com/watch?v=OwvP2e5lFHU";
                Uri link = Uri.parse(st);

                Intent afint = new Intent(Intent.ACTION_VIEW, link);
                if(afint.resolveActivity(getPackageManager()) != null ){
                    startActivity(afint);
                }
            }
        });
    }
}