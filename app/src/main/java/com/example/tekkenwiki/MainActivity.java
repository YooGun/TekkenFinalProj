package com.example.tekkenwiki;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, Tekken);
        setListAdapter(mAdapter);

    }


    final String[] Tekken = new String[]{"Akuma", "Alisa", "Anna",
            "Armor King", "Asuka Kazama", "Bryan Fury", "Jin Kazama", "Zafina", "Yoshimitsu",
            "Kadzumi Mishima", "Kunimitsu", "Lucky Chloe", "Lars", "Marshall Law", "Heihachi Mishima"};

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(position==0) {
            Intent intent = new Intent(MainActivity.this, AkumaActivity.class);
            startActivity(intent);
        }else if(position==1) {
            Intent intent = new Intent(MainActivity.this, AlisaActivity.class);
            startActivity(intent);
        }
        else if(position==2) {
            Intent intent = new Intent(MainActivity.this, AnnaActivity.class);
            startActivity(intent);
        }
        else if(position==3) {
            Intent intent = new Intent(MainActivity.this, ArmorActivity.class);
            startActivity(intent);
        }
        else if(position==4) {
            Intent intent = new Intent(MainActivity.this, AsukaActivity.class);
            startActivity(intent);
        }
        else if(position==5) {
            Intent intent = new Intent(MainActivity.this, BryanActivity.class);
            startActivity(intent);
        }
        else if(position==6) {
            Intent intent = new Intent(MainActivity.this, JinActivity.class);
            startActivity(intent);
        }
        else if(position==7) {
            Intent intent = new Intent(MainActivity.this, ZafinaActivity.class);
            startActivity(intent);
        }
        else if(position==8) {
            Intent intent = new Intent(MainActivity.this, YoshimitsuActivity.class);
            startActivity(intent);
        }
        else if(position==9) {
            Intent intent = new Intent(MainActivity.this, KadzumiActivity.class);
            startActivity(intent);
        }
        else if(position==10) {
            Intent intent = new Intent(MainActivity.this, KunimitsuActivity.class);
            startActivity(intent);
        }
        else if(position==11) {
            Intent intent = new Intent(MainActivity.this, LuckyActivity.class);
            startActivity(intent);
        }
        else if(position==12) {
            Intent intent = new Intent(MainActivity.this, LarsActivity.class);
            startActivity(intent);
        }
        else if(position==13) {
            Intent intent = new Intent(MainActivity.this, LawActivity.class);
            startActivity(intent);
        }
        else if(position==14) {
            Intent intent = new Intent(MainActivity.this, HeihachiActivity.class);
            startActivity(intent);
        }
    }
}

