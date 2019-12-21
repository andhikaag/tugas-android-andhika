package com.example.tugasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView notif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findId();
        onClick();
    }

    void findId(){
        notif = findViewById(R.id.logoNotif);
    }

    void onClick(){
        notif.setClickable(true);
    }
}
