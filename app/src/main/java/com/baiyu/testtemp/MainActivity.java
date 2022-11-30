package com.baiyu.testtemp;

import android.media.MediaPlayer;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.drawerlayout.widget.DrawerLayout;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1;
    Button b2;
    Button b3;
    DrawerLayout layout;

    MediaPlayer audioPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.ann);
        b1.setOnClickListener(this);
        layout=findViewById(R.id.drawerlayout);
        b3=findViewById(R.id.cehua);
        b3.setOnClickListener(this);
        audioPlayer=new MediaPlayer();
        try {
            audioPlayer.setDataSource("/");//音乐地址 自己修改
            audioPlayer.prepare();
            audioPlayer.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.ann:
                ann();
                break;
            case R.id.cehua:
                cehua();
                break;
        }
    }


    private void ann(){
        layout.openDrawer(Gravity.LEFT);
        System.out.println("ann");
    }
    private  void cehua(){
        System.out.println("cehau");
    }
}