package com.app.mapandroom.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.app.mapandroom.R;
import com.app.mapandroom.adapter.HistoryAdapter;
import com.app.mapandroom.database.Location;
import com.app.mapandroom.database.MyAppDatabase;
import com.app.mapandroom.utils.AppController;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    MyAppDatabase myAppDatabase = AppController.getMyAppDatabase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        List<Location> locationList = myAppDatabase.myDao().getLocation();

        RecyclerView recyclerViewHistory = findViewById(R.id.recyclerViewHistory);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerViewHistory.getContext(),
                LinearLayoutManager.VERTICAL);
        recyclerViewHistory.addItemDecoration(dividerItemDecoration);
        recyclerViewHistory.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerViewHistory.setAdapter(new HistoryAdapter(this, locationList));

    }
}