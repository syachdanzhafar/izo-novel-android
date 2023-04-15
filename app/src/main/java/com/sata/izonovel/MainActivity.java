package com.sata.izonovel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout menuInfoPengguna;
    LinearLayout menufavorite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuInfoPengguna = findViewById(R.id.informasi_pengguna);
        menufavorite = findViewById(R.id.favorite);

        menuInfoPengguna.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(MainActivity.this, BiodataActivity.class);
                startActivity(intent);
                return false;
            }
        });
        menufavorite = findViewById(R.id.favorite);
        menufavorite.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(MainActivity.this, MenuFavorite.class);
                startActivity(intent);
                return false;
            }
        });
    }
}