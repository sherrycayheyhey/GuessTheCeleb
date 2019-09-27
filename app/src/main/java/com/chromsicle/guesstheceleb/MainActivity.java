package com.chromsicle.guesstheceleb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //choose a random position from 1-62
    //if the celebrity was already chosen, choose another,
    // if there aren't anymore, game over, "congrats, you guessed them all....score?"

    //display the celebrity picture
    //show 4 answer choices, one of which matches the celebrity picture

    //player chooses an answer and is showed a corresponding toast, add/dedeuct score

    //what happens when the celeb image is broken? try/catch? skip that one, add the number to the spent list
    //what happens if the list is shorter than 62? should the numbers be chosen by analyzing the html first?

    //additional features: sound effects when buttons pressed, one sound for correct, another for incorrect 



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
