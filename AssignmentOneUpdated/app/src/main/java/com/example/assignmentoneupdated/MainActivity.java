package com.example.assignmentoneupdated;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     int vedioId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void PlayVedio(View view) {

        Intent intent=new Intent(MainActivity.this,PlayVedio.class);
        vedioId =view.getId();
        if(vedioId==R.id.btnA){
            vedioId=1;
        }
        else if(vedioId==R.id.btnB){
            vedioId=2;
        }
        else if(vedioId==R.id.btnC){
            vedioId=3;
        }
        else if(vedioId==R.id.btnD){
            vedioId=4;
        }
        else if(vedioId==R.id.btnE){
            vedioId=5;
        }
        else if(vedioId==R.id.btnF){
            vedioId=6;
        }
        else if(vedioId==R.id.btnG){
            vedioId=7;
        }
        else if(vedioId==R.id.btnH){
            vedioId=8;
        }
        else if(vedioId==R.id.btnI){
            vedioId=9;
        }
        else if(vedioId==R.id.btnJ){
            vedioId=10;
        }
        else if(vedioId==R.id.btnK){
            vedioId=11;
        }
        else if(vedioId==R.id.btnL){
            vedioId=12;
        }
        else if(vedioId==R.id.btnM){
            vedioId=13;
        }
        else if(vedioId==R.id.btnN){
            vedioId=14;
        }
        else if(vedioId==R.id.btnO){
            vedioId=15;
        }
        else if(vedioId==R.id.btnP){
            vedioId=16;
        }
        else if(vedioId==R.id.btnQ){
            vedioId=17;
        }
        else if(vedioId==R.id.btnR){
            vedioId=18;
        }
        else if(vedioId==R.id.btnS){
            vedioId=19;
        }
        else if(vedioId==R.id.btnT){
            vedioId=20;
        }
        else if(vedioId==R.id.btnU){
            vedioId=21;
        }
        else if(vedioId==R.id.btnV){
            vedioId=22;
        }
        else if(vedioId==R.id.btnW){
            vedioId=23;
        }
        else if(vedioId==R.id.btnX){
            vedioId=24;
        }
        else if(vedioId==R.id.btnY){
            vedioId=25;
        }
        else if(vedioId==R.id.btnZ){
            vedioId=26;
        }
        intent.putExtra("vedioID",vedioId);
        startActivity(intent);

    }
}