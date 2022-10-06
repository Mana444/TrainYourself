package com.example.trainyourself;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"dans onresume");
        Button button = findViewById(R.id.se_connecter_btn);
        button.setOnClickListener(new  View.OnClickListener(){

            public void onClick (View view){
            Log.i(TAG,"dans onclick");            }
        });

    }
}