package com.example.logopedica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button start;
    ImageView image;
    Animation topAnim, bottomAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        start = (Button) findViewById(R.id.btnstart);
        image = findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               Intent slovo = new Intent(MainActivity.this,slova.class) ;
               startActivity(slovo);
            }
        });

        //Učitavanje animacije
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //Animacije
        image.setAnimation(topAnim);
        start.setAnimation(bottomAnim);

    }
}