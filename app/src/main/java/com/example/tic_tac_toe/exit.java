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
import android.app.AlertDialog;
import android.content.DialogInterface;

public class exit extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);

        TextView high_score = findViewById(R.id.high_score);


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
    public void onBackPressed() {
        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit")
                .setMessage("Are you sure?")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    }
                }).setNegativeButton("no", null).show();
    }

}








