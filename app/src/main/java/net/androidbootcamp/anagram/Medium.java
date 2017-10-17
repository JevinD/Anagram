package net.androidbootcamp.anagram;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.Timer;
public class Medium extends AppCompatActivity
{
    public Timer timer= new Timer();
    private TextView scrambledWordView;
    private TextView scoreView;
    private Button validateButton;
    private int counter = 0;
    private EditText edText1;
    public static final Random RANDOM = new Random();
    public static final String[] MEDIUMWORDS = {"BULL","LIVE","HOLE","EASY"};
    int randomIndex = RANDOM.nextInt(MEDIUMWORDS.length - 1);
    public static String randomWord()
    {
        return MEDIUMWORDS[RANDOM.nextInt(MEDIUMWORDS.length)];
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        edText1 = (EditText) findViewById(R.id.editText1);
        onClickListenerButton();

        scrambledWordView = (TextView) findViewById(R.id.textView2);
        scoreView = (TextView) findViewById(R.id.textView3);
        scrambledWordView.setText(shuffleWord(MEDIUMWORDS[randomIndex]));

    }
    public void onClickListenerButton() {
        validateButton = (Button) findViewById(R.id.validateBtn);
        validateButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(edText1.getText().toString().equals(MEDIUMWORDS[randomIndex])){
                            SharedPreferences mPrefs = getSharedPreferences("score", counter);
                            SharedPreferences.Editor mEditor = mPrefs.edit();
                            mEditor.putInt("score", ++counter).commit();
                            Toast.makeText(Medium.this, "Score: " + mPrefs.getInt("score", counter) + "/4", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(getApplicationContext(), NewGame.class);
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(Medium.this, "Incorrect, try again", Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }

    public static String shuffleWord(String word)
    {
        if(word !=null && !"".equals(word))
        {
            char a[] = word.toCharArray();

            for (int i=0;i<a.length; i++)
            {
                int j = RANDOM.nextInt(a.length);
                char temp= a[i];
                a[i] = a[j];
                a[j] = temp;
                return new String(a);
            }
        }
        return word;
    }

}
