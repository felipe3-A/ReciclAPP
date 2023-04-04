package com.felipe.reciclapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class
Reciclaya extends AppCompatActivity {

    // Declaracion de variables
    ImageView img_verde,img_blanco,img_negro;
MediaPlayer verde;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciclaya);

        //Referenciacion

        img_verde=findViewById(R.id.img_verde);
        img_blanco=findViewById(R.id.img_blanco);
        img_negro=findViewById(R.id.img_negro);

        //Crear sonido
        verde = MediaPlayer.create(this, R.raw.verdecito);
        //Activar el evento click
        img_verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   verde.start();
                Toast.makeText(Reciclaya.this, "Reproduciendo...", Toast.LENGTH_SHORT).show();
            }
        });



    }
    public void menu(View view){
        Intent menu = new Intent(this,MainMenu.class);
        startActivity(menu);
    }
}