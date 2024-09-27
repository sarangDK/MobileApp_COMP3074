package com.example.lab_exercise3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        Log.i(MainActivity.TAG, "onCreate: screen2");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnBackToScreen1 = findViewById(R.id.btn3);
        btnBackToScreen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button btnGoToScreen3 = findViewById(R.id.btn2);
        btnGoToScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
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
