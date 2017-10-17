package net.androidbootcamp.anagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    private Button newGame;
    private Button cont;
    private Button selectStage;
    private Button about;
    private boolean isReturning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListenerButton();
    }

    public void onClickListenerButton() {
        newGame = (Button) findViewById(R.id.newGame);
        cont = (Button) findViewById(R.id.button2);
        selectStage = (Button) findViewById(R.id.button3);
        about = (Button) findViewById(R.id.button4);
        newGame.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), NewGame.class);
                        startActivity(intent);
                    }
                });
        cont.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isReturning) {
                            Intent intent = new Intent(getApplicationContext(), Continue.class);
                            startActivity(intent);
                        }
                    }
                });
        selectStage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Stage.class);
                        startActivity(intent);
                    }
                });
        about.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Credits.class);
                        startActivity(intent);
                    }
                });
    }
}
