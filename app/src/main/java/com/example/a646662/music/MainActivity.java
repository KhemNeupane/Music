package com.example.a646662.music;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

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

        listView =(ListView) findViewById(R.id.ListView);

        list = new ArrayList<>();
        Field

        adapter =new ArrayAdapter<>(this,android.R.layout.simple_list_item_1);


    }
        }


