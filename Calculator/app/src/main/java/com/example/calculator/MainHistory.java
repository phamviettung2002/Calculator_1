package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.Arrays;


import java.util.ArrayList;
import java.util.List;

public class MainHistory extends AppCompatActivity {
    ListView showHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_history);

        Intent intent = getIntent();

        String showarr [] = intent.getStringArrayExtra("showhistory");
        showHistory = findViewById(R.id.lvHistory);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, showarr);
        showHistory.setAdapter(adapter);


    }
}