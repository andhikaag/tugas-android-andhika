package com.example.tugasandroid.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.tugasandroid.R;
import com.example.tugasandroid.adapter.ListAdapter;
import com.example.tugasandroid.model.Tipe;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView click;
    ListView listView;
    ListAdapter listAdapter;
    private List<Tipe> tipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findId();
        initData();
        onClick();
    }

    void initData() {
        tipe = new ArrayList();
        tipe.clear();
        listAdapter = new ListAdapter(getApplicationContext(), tipe);
        listView.setAdapter(listAdapter);
        listAdapter.notifyDataSetChanged();
    }

    void findId(){
        listView = findViewById(R.id.list);
        click = findViewById(R.id.text3);
    }

    void onClick(){
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipe.clear();
                Tipe newTipe = new Tipe();
                newTipe.setGambar(R.drawable.ms);
                newTipe.setNamaTipe("Cash");
                newTipe.setTgl("14 Dec 2019");
                newTipe.setMoney("8,100,000");
                newTipe.setTipe("Outgoing");
                tipe.add(newTipe);

                newTipe = new Tipe();
                newTipe.setGambar(R.drawable.cm);
                newTipe.setNamaTipe("Cashback MONYAY");
                newTipe.setTgl("2 Dec 2019");
                newTipe.setMoney("+6,500");
                newTipe.setTipe("Incoming");
                tipe.add(newTipe);

                newTipe = new Tipe();
                newTipe.setGambar(R.drawable.sunflower);
                newTipe.setNamaTipe("Interest");
                newTipe.setTgl("28 Nov 2019");
                newTipe.setMoney("+1");
                newTipe.setTipe("Incoming");
                tipe.add(newTipe);

                listAdapter.notifyDataSetChanged();
            }
        });

        click.callOnClick();
    }
}
