package com.example.logopedica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class kategorije_l extends AppCompatActivity {
    Animation left_enter,right_enter;
    ListView listView;
    String mTitle[] = {"POČETNA FAZA","INICIJALNA POZICIJA", "MEDIJALNA POZICIJA", "FINALNA POZICIJA"};
    String mDescritption[] = {"Logatomi","Položaj slova na početku riječi", "Položaj slova na sredini riječi", "Položaj slova na kraju riječi"};
    int images[] = {R.drawable.cat1, R.drawable.cat2,R.drawable.cat3,R.drawable.cat4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kategorije);

        left_enter =  AnimationUtils.loadAnimation(this,R.anim.left_enter);
        right_enter =  AnimationUtils.loadAnimation(this,R.anim.right_enter);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this,mTitle,mDescritption,images);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){

                }
                if(position == 1){
                    Intent rijeci = new Intent(kategorije_l.this,inicijalno_l.class) ;
                    startActivity(rijeci);
                }
                if(position == 2){
                    Intent rijeci2 = new Intent(kategorije_l.this,medijalno_l.class) ;
                    startActivity(rijeci2);
                }
                if(position == 3){

                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]){
            super(c, R.layout.kategorije_l, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.kategorije_l, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText((rDescription[position]));

            images.setAnimation(left_enter);
            myTitle.setAnimation(right_enter);
            myDescription.setAnimation(left_enter);
            
            return row;
        }
    }
}
