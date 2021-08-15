package com.example.crackerrank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.crackerrank.adapter.MainAdapter;
import com.example.crackerrank.entity.Main;
import com.example.crackerrank.entity.MainData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMain;
    private ArrayList<Main> mains = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMain = findViewById(R.id.rv_main);
        mains.addAll(MainData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        MainAdapter mainAdapter = new MainAdapter(mains);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        rvMain.setLayoutManager(layoutManager);
        rvMain.setAdapter(mainAdapter);
    }
}