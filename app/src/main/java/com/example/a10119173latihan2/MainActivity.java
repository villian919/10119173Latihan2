package com.example.a10119173latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ////22 April 2022, 10119173, Birliano Ekayan Arsyad, IF5
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void register (View view) {
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }
}