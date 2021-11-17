package com.android.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setupClickListener();

    }
    private  void setupClickListener(){
        CardView thingsToDoCard = findViewById(R.id.things_to_Do);
        CardView placesToGoCard = findViewById(R.id.places_to_GO);


        thingsToDoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Things_to_Do.class);
                startActivity(intent);
            }
        });
    placesToGoCard.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,Places_to_Go.class);
            startActivity(intent);

        }
    });
    }
}