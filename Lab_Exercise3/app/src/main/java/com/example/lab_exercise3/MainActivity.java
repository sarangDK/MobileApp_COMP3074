package com.example.lab_exercise3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Tag is for tracking the log
    public static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // log is just debugging
        Log.i(TAG, "onCreate: screen1");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }
    // Method grab text from screen 1
    public void goToScreen2(View v) {
        Button btn1 = (Button) v;
        btn1.setText("test case");
        Intent intent= new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("FromScreen1", "Text from Screen 1");
        startActivity(intent);

    };


    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG,"onStart: screen1");
    }
    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG,"onResume: screen1");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG,"onPause: screen1");

    }
    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG,"onStop: screen1");


    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(TAG,"onRestart: screen1");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestory: screen1");

    }
}