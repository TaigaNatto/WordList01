package com.example.taiga.wordlist01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout=(LinearLayout)findViewById(R.id.layout);

        Word poan=new Word(R.drawable.popopopohn,"ポーン");
        Word arrow=new Word(R.drawable.arrow,"矢");
        Word atumori=new Word(R.drawable.atsumori,"熱盛");
        Word natto=new Word(R.drawable.natto,"納豆");

        addWord(poan);
        addWord(arrow);
        addWord(atumori);
        addWord(natto);

    }

    public void addWord(Word word){
        LinearLayout liner=new LinearLayout(this.getApplicationContext());
        layout.setOrientation(LinearLayout.HORIZONTAL);

        TextView nameView=new TextView(getApplicationContext());
        nameView.setText(word.name);

        ImageView imageView=new ImageView(this);
        imageView.setImageResource(word.resId);

        liner.addView(imageView);
        liner.addView(nameView);

        layout.addView(liner);
    }
}
