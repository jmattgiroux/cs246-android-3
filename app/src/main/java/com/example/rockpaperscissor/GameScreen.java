package com.example.rockpaperscissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class GameScreen extends AppCompatActivity {


    Button rock, paper, scissors, quit, back;

    TextView result;

    Game game;

    public void updateResultsText(){
        result.setText(game.returnResultTextString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rock = (Button) findViewById(R.id.rockButton);
        paper = (Button) findViewById(R.id.paperButton);
        scissors = (Button) findViewById(R.id.scissorsButton);
        quit = (Button) findViewById(R.id.quitButton);
        back = (Button) findViewById(R.id.gameBackButton);

        game = new Game();

        result = (TextView) findViewById(R.id.resultsText);

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game.play(1);
                updateResultsText();
            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game.play(2);
                updateResultsText();
            }
        });

        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game.play(3);
                updateResultsText();
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