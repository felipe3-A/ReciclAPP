package com.felipe.reciclapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Tipos extends AppCompatActivity {

      View boton_verde;
      VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos);
        //referenciar audio
        boton_verde=findViewById(R.id.boton_negro);
        MediaPlayer boton_verde;
        boton_verde=MediaPlayer.create(this,R.raw.verdecito);

        //Referenciar video
        video=findViewById(R.id.id_video);
        MediaPlayer id_video;

        //Activar el evento click
       boton_verde.start();
//Direciones
        video.setVideoPath("android.resource://" + getPackageName() + "/"+R.raw.video);
        //Controles
        video.setMediaController(new MediaController(this));
        video.start();
    }
    public void menu(View view){
        Intent menu = new Intent(this,MainMenu.class);
        startActivity(menu);
    }
}