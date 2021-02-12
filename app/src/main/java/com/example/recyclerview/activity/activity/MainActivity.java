package com.example.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.FileObserver;
import android.widget.LinearLayout;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.adapter.Adapter;
import com.example.recyclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycleView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleView = findViewById(R.id.recyclerView);

        //Listagem de filmes
        this.criarFilmes();
        //configurar adapter
        Adapter adapter = new Adapter( listaFilmes );

        //Configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recycleView.setLayoutManager(layoutManager);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recycleView.setHasFixedSize(true);
        recycleView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recycleView.setAdapter(adapter);
    }

    public void criarFilmes(){

        Filme filme = new Filme("Atomic Monk","sci-Fi","2021");
        listaFilmes.add(filme);

        filme = new Filme("Capitao Brasil","Documentário","2021");
        listaFilmes.add(filme);

        filme = new Filme("Albert Richers","Documentário","2021");
        listaFilmes.add(filme);

        filme = new Filme("Velozes e Curiosos","Action","2021");
        listaFilmes.add(filme);

        filme = new Filme("Esqueceram de mim","Suspense","2021");
        listaFilmes.add(filme);

        filme = new Filme("Animais Fantásticos: O retorno do jacksparol","comédia","2021");
        listaFilmes.add(filme);
    }

}