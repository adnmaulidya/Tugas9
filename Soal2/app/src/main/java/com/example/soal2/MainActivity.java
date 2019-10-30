package com.example.soal2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.soal2.adapters.SuperHeroAdapter;
import com.example.soal2.models.SuperHero;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    List<SuperHero> listSuperHero = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        SuperHero hero1 = new SuperHero("Captain America");
        listSuperHero.add(hero1);
        SuperHero hero2 = new SuperHero("Captain Americi");
        listSuperHero.add(hero2);
        SuperHero hero3 = new SuperHero("Captain Americu");
        listSuperHero.add(hero3);
        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);
        recyclerView.setAdapter(superHeroAdapter);
        recyclerView.setLayoutManager ( new LinearLayoutManager(this ,LinearLayoutManager.HORIZONTAL, false));
    }
}