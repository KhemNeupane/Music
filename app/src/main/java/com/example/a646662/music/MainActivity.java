package com.example.a646662.music;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_search:
                    mTextMessage.setText("search");
                    return true;
                case R.id.navigation_play:
                    mTextMessage.setText("play");
                    return true;
                case R.id.navigation_playlist:
                    mTextMessage.setText("playlist");
                    return true;
                case R.id.navigation_history:
                    mTextMessage.setText("history");
                    return true;
                case R.id.navigation_download:
                    mTextMessage.setText("download");
                    return true;
            }
            return false;
        }
    };



    ListView listView;

    List<String> list;

    ListAdapter adapter;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.ListView);

        list = new ArrayList<>();

        Field[] fields = R.raw.class.getFields();
        for (int i = 0; i < fields.length; i++) {
            list.add(fields{i}.getName());
        }


        //remove first two elements
        list.remove(0);
        list.remove (0):

        adapter =new ArrayAdapter<>(this,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);


        listView.setOnIteamClickListenear(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,View view, int i, long 1 ){
                if (mediaPlayer != null){
                    mediaPlayer.release();
                }
                int resID = getResources().getIdentifier(list.get(i), "raw", getPackageName());
                MediaPlayer =MediaPlayer.create(MainActivity.this, resID);
                MediaPlayer.start();

            });

            }

    }
