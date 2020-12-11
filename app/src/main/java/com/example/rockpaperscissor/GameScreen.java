package com.example.rockpaperscissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// https://docs.oracle.com/javase/8/docs/api/java/util/Random.html


public class GameScreen extends AppCompatActivity {


    Button rock, paper, scissors, quit, back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rock = (Button) findViewById(R.id.rockButton);
        paper = (Button) findViewById(R.id.paperButton);
        scissors = (Button) findViewById(R.id.scissorsButton);
        quit = (Button) findViewById(R.id.quitButton);
        back = (Button) findViewById(R.id.gameBackButton);

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameScreen.this, RecordsScreen.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}