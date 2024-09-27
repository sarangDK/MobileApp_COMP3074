package com.example.lab3_final;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.net.URI;

/*
3 Screens:
 Each screen has one text view and one button
 Screen 1 : grab text from the text view and pass it to screen 2
 screen 2 : display the text on the texxtview on the second screen , grab a URL from screen 2
 pass to screen 3
 screen 3 : open the url on web view

 */

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

        /* findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent is used to switch between activities
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        }); */
    }
    // same thing with findviewbyId
    public void goToScreen2(View v) {
        Button btn1 = (Button) v;
        btn1.setText("test case");
        Intent intent= new Intent(MainActivity.this, Activity2.class);
        intent.putExtra("FromScreen1", "Text from Screen 1");
        startActivity(intent);

    };

    public void openGoogle(View v) {
        Uri url = Uri.parse("https://www.google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, url);
        startActivity(intent);
    }



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