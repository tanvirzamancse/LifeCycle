package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView click;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate MainActivity");

        click = findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
                finish();

            }
        });

    }

    @Override
    protected void onStart() {

        Toast.makeText(this, "onStart MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart MainActivity");

        super.onStart();
    }

    @Override
    protected void onResume() {

        Toast.makeText(this, "onResume MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume MainActivity");
        super.onResume();

    }

    @Override
    protected void onPause() {

        Toast.makeText(this, "onPause MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause MainActivity");

        super.onPause();
    }

    @Override
    protected void onStop() {

        Toast.makeText(this, "onStop MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop MainActivity");

        super.onStop();
    }

    @Override
    protected void onRestart() {

        Toast.makeText(this, "onRestart MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onRestart MainActivity");

        super.onRestart();
    }

    @Override
    protected void onDestroy() {

        Toast.makeText(this, "onDestroy MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy MainActivity");

        super.onDestroy();
    }

}