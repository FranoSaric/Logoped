package com.example.logopedica;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class slova extends AppCompatActivity {

    TextView btnll,btnkk,btncc,btnc,btnr,btnlj;
    Dialog myDialog;
    Animation bounce,bounce2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slova);
        btnll  = (TextView)findViewById(R.id.btnl);
        btnkk = (TextView)findViewById(R.id.btnk);
        btncc = (TextView)findViewById(R.id.btncc);
        btnc = (TextView)findViewById(R.id.btnc);
        btnr = (TextView)findViewById(R.id.btnr);
        btnlj = (TextView)findViewById(R.id.btnlj);

        //Učitavanje animacije
        bounce =  AnimationUtils.loadAnimation(this,R.anim.bounce);
        bounce2 =  AnimationUtils.loadAnimation(this,R.anim.bounce2);

        //Animacije
        btnll.setAnimation(bounce);
        btnkk.setAnimation(bounce2);
        btncc.setAnimation(bounce);
        btnc.setAnimation(bounce2);
        btnr.setAnimation(bounce);
        btnlj.setAnimation(bounce2);

        //Dialog

        //myDialog = new Dialog(this);

        btnll.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent kategorije = new Intent(slova.this,kategorije_l.class) ;
                startActivity(kategorije);
            }
        });
    }

    /*public void Slovol(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.slovol);


        // glas za slovo L
        final MediaPlayer slovol = MediaPlayer.create(slova.this,R.raw.slovol);
        Toast.makeText(slova.this, "Slovo L", Toast.LENGTH_LONG).show();
        slovol.start();

        // zatvaranje
        txtclose = (TextView)myDialog.findViewById(R.id.txtclose);
        txtclose.setText("X");
        txtclose.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                myDialog.dismiss();
            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }*/
}