package com.example.lab4_2;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    EditText editText1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn1 = findViewById(R.id.btn1);
        editText1 = findViewById(R.id.editText1);

    }


    public void grabMyName(View view) {

        String text = editText1.getText().toString();
        if (TextUtils.isEmpty(text))

            return;
        displayDialog(text);

    }


    private void displayDialog(String text) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Your Name")
                .setMessage(text)
                .setPositiveButton("show message", (dialog, w) -> {
                    displaySnackBar(text);
                })
                .setNegativeButton("cancel", null)
                .create()
                .show();
    }

    private void displaySnackBar(String text) {
        Snackbar.make(findViewById(R.id.main), text, Snackbar.LENGTH_LONG)
                .setAction("ok", (o))
                .show();
    }


}