package net.androidbootcamp.anagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
/**
 * Created by Jevinn on 10/16/2017.
 */
public class Continue extends AppCompatActivity implements View.OnClickListener{

        private TextView wordTv;
        private EditText wordEnteredTv;
        private Button validate, newGame;
        private String wordToFind;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            wordTv = (TextView) findViewById(R.id.wordTv);
            wordEnteredTv = (EditText) findViewById(R.id.wordEnteredEt);
            validate = (Button) findViewById(R.id.validate);
            validate.setOnClickListener(this);
            newGame = (Button) findViewById(R.id.newGame);
            newGame.setOnClickListener(this);

            newGame();
        }

        @Override
        public void onClick(View view) {
            if (view == validate) {
                validate();
            } else if (view == newGame) {
                newGame();
            }
        }

        private void validate() {
            String w = wordEnteredTv.getText().toString();

            if (wordToFind.equals(w)) {
                Toast.makeText(this, "Congratulations ! You found the word " + wordToFind, Toast.LENGTH_SHORT).show();
                newGame();
            } else {
                Toast.makeText(this, "Retry !", Toast.LENGTH_SHORT).show();
            }
        }

        private void newGame() {
            wordToFind = NewGame.randomWord();
            String wordShuffled = NewGame.shuffleWord(wordToFind);
            wordTv.setText(wordShuffled);
            wordEnteredTv.setText("");
        }
}

