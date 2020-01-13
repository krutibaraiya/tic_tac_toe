package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;

public class exit extends AppCompatActivity {
    EditText high_score;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);

        high_score=(EditText) findViewById(R.id.high_score);


        Animation animation = AnimationUtils.loadAnimation(exit.this, R.anim.blink_anim);

        high_score.startAnimation(animation);

        SharedPreferences preferences = getSharedPreferences("High Score", MODE_PRIVATE);
        TextView tx = (TextView) findViewById(R.id.high_score);
        tx.setText("High Score: " + preferences.getInt("High Score", 0));
}


    public void tryAgain_click(View view)
    {
        Intent intent = new Intent (this, tictactoe.class);
        startActivity(intent);

    }

        }








