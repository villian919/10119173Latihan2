package com.example.a10119173latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class verify_code extends AppCompatActivity {
    ////22 April 2022, 10119173, Birliano Ekayan Arsyad, IF5
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_code);
    }

    public void send (View view) {
        Intent intent = new Intent(this, user_home.class);
        startActivity(intent);
    }

}