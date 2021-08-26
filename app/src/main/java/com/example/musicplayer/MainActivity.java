package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2,b3,b4;
    private Boolean play1 = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.song1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(MainActivity.this,MyService1.class));
                stopService(new Intent(MainActivity.this,MyService2.class));
                stopService(new Intent(MainActivity.this,MyService3.class));
                stopService(new Intent(MainActivity.this,MyService4.class));
                startService(new Intent(MainActivity.this,MyService1.class));
            }
        });
        b2 = findViewById(R.id.song2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(MainActivity.this,MyService1.class));
                stopService(new Intent(MainActivity.this,MyService2.class));
                stopService(new Intent(MainActivity.this,MyService3.class));
                stopService(new Intent(MainActivity.this,MyService4.class));
                startService(new Intent(MainActivity.this,MyService2.class));
            }
        });
        b1 = findViewById(R.id.song3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(MainActivity.this,MyService1.class));
                stopService(new Intent(MainActivity.this,MyService2.class));
                stopService(new Intent(MainActivity.this,MyService3.class));
                stopService(new Intent(MainActivity.this,MyService4.class));
                startService(new Intent(MainActivity.this,MyService3.class));
            }
        });
        b2 = findViewById(R.id.song4);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(MainActivity.this,MyService1.class));
                stopService(new Intent(MainActivity.this,MyService2.class));
                stopService(new Intent(MainActivity.this,MyService3.class));
                stopService(new Intent(MainActivity.this,MyService4.class));
                startService(new Intent(MainActivity.this,MyService4.class));
            }
        });
    }
}