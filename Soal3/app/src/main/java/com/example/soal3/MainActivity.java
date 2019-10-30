package com.example.soal3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] images = {R.drawable.superhero, R.drawable.superhero1,R.drawable.superhero2,R.drawable.superhero3,
            R.drawable.superhero4,R.drawable.superhero5,R.drawable.thor,R.drawable.hulk};
    private RecylerAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recylerView);
        layoutManager = new GridLayoutManager(this, 2 );
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecylerAdapter(images);
        recyclerView.setAdapter(adapter);
    }
}