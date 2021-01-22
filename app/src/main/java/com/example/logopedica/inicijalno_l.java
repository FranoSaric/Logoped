package com.example.logopedica;

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

import androidx.appcompat.app.AppCompatActivity;

public class inicijalno_l extends AppCompatActivity {
    Button lav,led,labud,lopta,lubenica,list,leptir,lisica;
    Dialog myDialog;
    Animation bounce,bounce2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicijalno_l);
        lav  = (Button)findViewById(R.id.lav);
        led = (Button)findViewById(R.id.led);
        labud = (Button)findViewById(R.id.labud);
        lopta = (Button)findViewById(R.id.lopta);
        lubenica  = (Button)findViewById(R.id.lubenica);
        list = (Button)findViewById(R.id.list);
        leptir = (Button)findViewById(R.id.leptir);
        lisica = (Button)findViewById(R.id.lisica);

        //Učitavanje animacije
        bounce =  AnimationUtils.loadAnimation(this,R.anim.bounce);
        bounce2 =  AnimationUtils.loadAnimation(this,R.anim.bounce2);

        //Animacije
        lav.setAnimation(bounce);
        led.setAnimation(bounce2);
        labud.setAnimation(bounce);
        lopta.setAnimation(bounce2);
        lubenica.setAnimation(bounce);
        list.setAnimation(bounce2);
        leptir.setAnimation(bounce);
        lisica.setAnimation(bounce2);

        //Dialog

        myDialog = new Dialog(this);
    }

    public void Lav(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.lav);


        // glas za lav
        final MediaPlayer lav = MediaPlayer.create(inicijalno_l.this,R.raw.lav);
        Toast.makeText(inicijalno_l.this, "LAV", Toast.LENGTH_LONG).show();
        lav.start();

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
    }

    public void Led(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.lav);


        // glas za lav
        final MediaPlayer led = MediaPlayer.create(inicijalno_l.this,R.raw.lav);
        Toast.makeText(inicijalno_l.this, "LED", Toast.LENGTH_LONG).show();
        led.start();

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
    }

    public void Labud(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.lav);


        // glas za lav
        final MediaPlayer labud = MediaPlayer.create(inicijalno_l.this,R.raw.lav);
        Toast.makeText(inicijalno_l.this, "LABUD", Toast.LENGTH_LONG).show();
        labud.start();

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
    }

    public void Lopta(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.lav);


        // glas za lav
        final MediaPlayer lopta = MediaPlayer.create(inicijalno_l.this,R.raw.lav);
        Toast.makeText(inicijalno_l.this, "LOPTA", Toast.LENGTH_LONG).show();
        lopta.start();

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
    }

    public void Lubenica(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.lav);


        // glas za lav
        final MediaPlayer lubenica = MediaPlayer.create(inicijalno_l.this,R.raw.lav);
        Toast.makeText(inicijalno_l.this, "LUBENICA", Toast.LENGTH_LONG).show();
        lubenica.start();

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
    }

    public void List(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.lav);


        // glas za lav
        final MediaPlayer list = MediaPlayer.create(inicijalno_l.this,R.raw.lav);
        Toast.makeText(inicijalno_l.this, "LIST", Toast.LENGTH_LONG).show();
        list.start();

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
    }

    public void Leptir(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.lav);


        // glas za lav
        final MediaPlayer leptir = MediaPlayer.create(inicijalno_l.this,R.raw.lav);
        Toast.makeText(inicijalno_l.this, "LEPTIR", Toast.LENGTH_LONG).show();
        leptir.start();

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
    }

    public void Lisica(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.lav);


        // glas za lav
        final MediaPlayer lisica = MediaPlayer.create(inicijalno_l.this,R.raw.lav);
        Toast.makeText(inicijalno_l.this, "LISICA", Toast.LENGTH_LONG).show();
        lisica.start();

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
    }
}
