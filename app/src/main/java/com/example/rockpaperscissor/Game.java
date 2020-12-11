package com.example.rockpaperscissor;

import android.content.Context;

import com.example.rockpaperscissor.Record;
// https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
import java.util.Random;
import java.util.Scanner;

public class Game {

    //member variables

    Integer playerChoice;

    Integer computerChoice;

    public Integer playerScore;

    Record record;


    //default constructor
    public Game()
    {

        record = new Record();

    }

    // updates computer's choice
    public void updateComputerChoice(){
        Random random = new Random();
        computerChoice = (random.nextInt() % 3) + 1;
    }

    //updates text view in GameScreen
    public String returnResultTextString(){
        String string = "Score: " + record.points;

        return string;
    }

    // returns trueIfWon
    public Integer compare(){

        // 1: Rock
        // 2: Paper
        // 3: Scissors

        if ((computerChoice % 3) == (playerChoice - 1))
        {
            // 1 is win
            return 1;
        }

        else if (computerChoice == playerChoice)
            // 2 is tie
            return 2;

        else
            // 3 is loss
            return 3;
    }

    // increment playerScore
    public void updatePoints(Integer result){
        //increments record.points
        // 1 is victory
        if (result == 1)
            record.points++;
        if (result == 3)
            record.points--;
    }

    public void updatePlayerChoice(int choice){

        playerChoice = choice;
    }

    public void play(int choice){

        updatePlayerChoice(choice);
        updateComputerChoice();
        updatePoints(compare());
    }


}
