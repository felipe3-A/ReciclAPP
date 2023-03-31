package com.felipe.reciclapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //metodos
    public void Siguiente(View view){
        Intent siguiente =new Intent(this,ResultadoActivity.class);
    }
    public void Enviar(View view){
        Intent i=new Intent(this,ResultActivity.class);
        i.putExtra("dato",et1.getText().toString());
        startActivity(i);
    }
}