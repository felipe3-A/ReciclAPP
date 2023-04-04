package com.felipe.reciclapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Intento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intento);
    }
    //metodos
    //Crear un intento
    public void Siguiente(View view){
        Intent siguiente =new Intent(this, Intento2.class);
        startActivity(siguiente);
    }
}