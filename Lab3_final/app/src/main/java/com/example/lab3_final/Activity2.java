package com.example.lab3_final;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        Log.i(MainActivity.TAG, "onCreate: screen2");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent intent = getIntent();
        String s = intent.getStringExtra("FromScreen1");
        TextView txtview = findViewById(R.id.text2);
        txtview.setText(s);


    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(MainActivity.TAG, "onStart: screen2");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(MainActivity.TAG, "onResume: screen2");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(MainActivity.TAG, "onPause: screen2");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(MainActivity.TAG, "onStop: screen2");


    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(MainActivity.TAG, "onRestart: screen2");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MainActivity.TAG, "onDestroy: screen2");
    }
}
