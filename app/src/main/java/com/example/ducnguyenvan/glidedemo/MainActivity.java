package com.example.ducnguyenvan.glidedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private Button btnLoad;
    private ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLoad = (Button)findViewById(R.id.btnLoad);
        imgView = (ImageView)findViewById(R.id.myImg);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Glide.with(MainActivity.this).load("https://scontent.fsgn5-1.fna.fbcdn.net/v/t1.0-9/10449939_534376476674314_2613599221797329850_n.jpg?_nc_cat=0&oh=4f1a64bf5a6111b9216d5dafc5a6be78&oe=5B652E66").into(imgView);
                Log.i("Load", " finished.");
            }
        });
    }
}
