package com.example.jesse.mydiet;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewer = (ImageView)findViewById(R.id.imageView);
        TextView textView = (TextView)findViewById(R.id.quoteText);
        int[] textarray = {
                R.mipmap.apple,
                R.mipmap.orange,
                R.mipmap.kiwifruit
        };

        String[] quotes = {
            "Subway eat fresh",
            "Go hard or go home",
            "Turkey fried chicken in a pizza hut"
        };

        int rand = new Random().nextInt(textarray.length);
        imageViewer.setImageDrawable(getResources().getDrawable(textarray[rand]));
        textView.setText(quotes[rand]);


    }
}
