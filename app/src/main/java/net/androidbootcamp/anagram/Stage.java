package net.androidbootcamp.anagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Stage extends AppCompatActivity {
    private Button newGame;
    private Button cont;
    private Button selectStage;
    private Button about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage);
    }
}
