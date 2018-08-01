package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Button;
import android.view.View;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create all the elements on the app
        final Button myButton;
        myButton = (Button) findViewById(R.id.askButton);
        final ImageView eightBall;
        eightBall = (ImageView) findViewById(R.id.image_eightball);

        //Create utilities for the app
        final int[] possibleAnswers = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3, R.drawable.ball4,R.drawable.ball5};

        //Actual code for the app
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random numberGen = new Random();
                int nextAnswerId = numberGen.nextInt(4);
                Log.d("MyApp", "Random gen within bounds: "+ nextAnswerId);
                eightBall.setImageResource(possibleAnswers[nextAnswerId]);
            }
        });
    }
}
