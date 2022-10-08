package com.example.trainyourself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        Button buttonRead = findViewById(R.id.button_read);
        buttonRead.setOnClickListener(new  View.OnClickListener(){
            //TODO verif password et Pseudo pour valider le onclick
            public void onClick (View view){
                Intent intent = new Intent(view.getContext(), Enchainements.class);
                startActivity(intent);
            }
        });
    }
}