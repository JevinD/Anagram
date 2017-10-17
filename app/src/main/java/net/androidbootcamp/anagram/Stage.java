package net.androidbootcamp.anagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Stage extends AppCompatActivity {
    private Button easy;
    private Button medium;
    private Button hard;
    private Button extreme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage);
        onClickListenerButton();
    }
    public void onClickListenerButton() {
        easy = (Button) findViewById(R.id.button13);
        medium = (Button) findViewById(R.id.button14);
        hard = (Button) findViewById(R.id.button15);
        extreme = (Button) findViewById(R.id.button16);
        easy.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), NewGame.class);
                        startActivity(intent);
                    }
                });
        medium.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Medium.class);
                        startActivity(intent);
                    }
                });
        hard.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Hard.class);
                        startActivity(intent);
                    }
                });
        extreme.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Extreme.class);
                        startActivity(intent);
                    }
                });
    }
}
