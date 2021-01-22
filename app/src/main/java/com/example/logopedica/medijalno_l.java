package com.example.logopedica;

import android.app.Dialog;
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

public class medijalno_l extends AppCompatActivity {
    Button vila,pcela,hlace,slon,stolica,salica,balon,naocale;
    Dialog myDialog;
    Animation bounce,bounce2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medijalno_l);
        vila  = (Button)findViewById(R.id.vila);
        pcela = (Button)findViewById(R.id.pcela);
        hlace = (Button)findViewById(R.id.hlace);
        slon = (Button)findViewById(R.id.slon);
        stolica  = (Button)findViewById(R.id.stolica);
        salica = (Button)findViewById(R.id.salica);
        balon = (Button)findViewById(R.id.balon);
        naocale = (Button)findViewById(R.id.naocale);

        //Učitavanje animacije
        bounce =  AnimationUtils.loadAnimation(this,R.anim.bounce);
        bounce2 =  AnimationUtils.loadAnimation(this,R.anim.bounce2);

        //Animacije
        vila.setAnimation(bounce);
        pcela.setAnimation(bounce2);
        hlace.setAnimation(bounce);
        slon.setAnimation(bounce2);
        stolica.setAnimation(bounce);
        salica.setAnimation(bounce2);
        balon.setAnimation(bounce);
        naocale.setAnimation(bounce2);

        //Dialog

        myDialog = new Dialog(this);
    }

    public void Vila(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.vila);


        // glas za vilu
        final MediaPlayer vila = MediaPlayer.create(medijalno_l.this,R.raw.lav);
        Toast.makeText(medijalno_l.this, "Vila", Toast.LENGTH_LONG).show();
        vila.start();

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

    public void Pcela(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.pcela);


        // glas za pcelu
        final MediaPlayer pcela = MediaPlayer.create(medijalno_l.this,R.raw.lav);
        Toast.makeText(medijalno_l.this, "Pčela", Toast.LENGTH_LONG).show();
        pcela.start();

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

    public void Hlace(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.hlace);


        // glas za hlace
        final MediaPlayer hlace = MediaPlayer.create(medijalno_l.this,R.raw.lav);
        Toast.makeText(medijalno_l.this, "Hlače", Toast.LENGTH_LONG).show();
        hlace.start();

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

    public void Slon(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.slon);


        // glas za slona
        final MediaPlayer slon = MediaPlayer.create(medijalno_l.this,R.raw.lav);
        Toast.makeText(medijalno_l.this, "SLON", Toast.LENGTH_LONG).show();
        slon.start();

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

    public void Stolica(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.stolica);


        // glas za stolicu
        final MediaPlayer stolica = MediaPlayer.create(medijalno_l.this,R.raw.lav);
        Toast.makeText(medijalno_l.this, "STOLICA", Toast.LENGTH_LONG).show();
        stolica.start();

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

    public void Salica(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.salica);


        // glas za šalice
        final MediaPlayer salica = MediaPlayer.create(medijalno_l.this,R.raw.lav);
        Toast.makeText(medijalno_l.this, "ŠALICA", Toast.LENGTH_LONG).show();
        salica.start();

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

    public void Balon(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.balon);


        // glas za balon
        final MediaPlayer balon = MediaPlayer.create(medijalno_l.this,R.raw.lav);
        Toast.makeText(medijalno_l.this, "BALON", Toast.LENGTH_LONG).show();
        balon.start();

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

    public void Naocale(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.naocale);


        // glas za naocale
        final MediaPlayer naocale = MediaPlayer.create(medijalno_l.this,R.raw.lav);
        Toast.makeText(medijalno_l.this, "NAOČALE", Toast.LENGTH_LONG).show();
        naocale.start();

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
