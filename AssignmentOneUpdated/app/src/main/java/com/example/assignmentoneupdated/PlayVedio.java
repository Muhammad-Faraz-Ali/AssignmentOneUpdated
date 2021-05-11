package com.example.assignmentoneupdated;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayVedio extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_vedio);
        videoView=findViewById(R.id.videoView);
        int vedioId=getIntent().getExtras().getInt("vedioID");
        if(vedioId==1){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_01);
            //videoView.setVideoPath(String.valueOf(R.raw.video_01));
        }
        else if(vedioId==2){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_02);
        }
        else if(vedioId==3){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_03);
        }
        else if(vedioId==4){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_04);
        }
        else if(vedioId==5){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_05);
        }
        else if(vedioId==6){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_06);
        }
        else if(vedioId==7){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_07);
        }
        else if(vedioId==8){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_08);
        }
        else if(vedioId==9){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_09);
        }
        else if(vedioId==10){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_10);
        }
        else if(vedioId==11){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_11);
        }
        else if(vedioId==12){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_12);
        }
        else if(vedioId==13){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_13);
        }
        else if(vedioId==14){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_14);
        }
        else if(vedioId==15){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_15);
        }
        else if(vedioId==16){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_16);
        }
        else if(vedioId==17){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_17);
        }
        else if(vedioId==18){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_18);
        }
        else if(vedioId==19){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_19);
        }
        else if(vedioId==20){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_20);
        }
        else if(vedioId==21){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_21);
        }
        else if(vedioId==22){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_22);
        }
        else if(vedioId==23){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_23);
        }
        else if(vedioId==24){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_24);
        }
        else if(vedioId==25){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_25);
        }
        else if(vedioId==26){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_26);
        }
        //MediaController class to controll the vedio section
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();

    }
}