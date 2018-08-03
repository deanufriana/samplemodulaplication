package com.intala.intalalatihan.myactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.intala.intalalatihan.R;

public class ListActivity extends AppCompatActivity {

    RecyclerView news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        news = findViewById(R.id.news);

    }
}