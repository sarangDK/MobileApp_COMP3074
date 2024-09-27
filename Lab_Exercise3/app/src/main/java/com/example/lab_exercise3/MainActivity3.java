package com.example.lab_exercise3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(MainActivity.TAG, "onCreate: screen3");

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnBackToScreen1 = findViewById(R.id.btn6);
        btnBackToScreen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button btnOpenBrowser = findViewById(R.id.btn5);
        EditText userUrl = findViewById(R.id.userUrl);
        btnOpenBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlStr = userUrl.getText().toString().trim();
                
                if(!urlStr.isEmpty()) {
                    if(!urlStr.startsWith("http://") && !urlStr.startsWith("https://")) {
                        urlStr = "http://" + urlStr;
                    }
                    
                    Uri url = Uri.parse(urlStr);
                    Intent intent = new Intent(Intent.ACTION_VIEW, url);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity3.this, "Please enter a valid URL", Toast.LENGTH_SHORT).show();                }
            }
        });


    }

//        Button btnOpenBrowser
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