package net.androidbootcamp.anagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;

public class NewGame
{
    public static final Random RANDOM = new Random();
    public static final String[] WORDS = { "ACCOUNT","BULLIE","PIECES"};
    public static String randomWord()
    {
        return WORDS[RANDOM.nextInt(WORDS.length)];
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
