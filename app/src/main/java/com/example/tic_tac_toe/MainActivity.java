package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText) findViewById(R.id.name);


                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);

                name.startAnimation(animation);



    }

    public void start_buttonclick(View view)
    {
        Intent intent = new Intent (this, tictactoe.class);
        startActivity(intent);

    }


}