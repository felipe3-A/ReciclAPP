package com.felipe.reciclapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tipos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos);
    }
    public void menu(View view){
        Intent menu = new Intent(this,MainMenu.class);
        startActivity(menu);
    }
}