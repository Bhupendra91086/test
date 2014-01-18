package com.example.video;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        VideoView videoView = (VideoView)findViewById(R.id.videoView1);
     //  MediaController mediaController = new MediaController(this);          
     //   mediaController.setAnchorView(videoView);          
        Uri video = Uri.parse("android-resource://com.example.video/" + R.raw.fdsplash1);          
   //     videoView.setMediaController(mediaController);          
        videoView.setVideoURI(video);          
        videoView.start(); 
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
