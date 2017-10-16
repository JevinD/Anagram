package net.androidbootcamp.anagram;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    private Button newGame;
    private Button cont;
    private Button selectStage;
    private Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickListenerButton() {
        newGame = (Button) findViewById(R.id.newGame);
        cont = (Button) findViewById(R.id.cont);
        selectStage = (Button) findViewById(R.id.selectStage);
        about = (Button) findViewById(R.id.about);
    }
       newGame.setOnClickListener(
               new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            displayStr += "New Game";
            display.setText(displayStr);
        }
    });
        cont.setOnClickListener(
                new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            displayStr += "Continue";
            display.setText(displayStr);
        }
    });
        selectStage.setOnClickListener(
                new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            displayStr += "Select Stage";
            display.setText(displayStr);
        }
    });
        about.setOnClickListener(
                new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            displayStr += "About";
            display.setText(displayStr);
        }
    });

}
