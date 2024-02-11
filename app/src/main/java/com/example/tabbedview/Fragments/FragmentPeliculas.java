package com.example.tabbedview.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tabbedview.AdaptadorPeliculas;
import com.example.tabbedview.Modelo.Pelicula;
import com.example.tabbedview.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentPeliculas extends Fragment {

    List<Pelicula> listaPeliculas = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recyclefragment, container, false);

        RecyclerView rv = view.findViewById(R.id.recycleId);
        rv.setLayoutManager(new LinearLayoutManager(getActivity() ));

        AdaptadorPeliculas adapter = new AdaptadorPeliculas(listaPeliculas,getActivity());
        rv.setAdapter(adapter);

        Pelicula peli1 = new Pelicula("Salvar al solado Ryan", "Steven Spielerg", "saving");
        Pelicula peli2 = new Pelicula("Interstellar", "Christopher Nolan", "inters");
        Pelicula peli3 = new Pelicula("Drive", "Nicolas Winding", "drivee");
        Pelicula peli4 = new Pelicula("Avatar", "James Cameron", "avatar");
        Pelicula peli5 = new Pelicula("Titanic", "James Cameron", "titanic");
        Pelicula peli6 = new Pelicula("Dune", "Denis Villenueve", "dunee");
        Pelicula peli7 = new Pelicula("Blade Runner 2042", "Denis Villenueve", "bladerunnerr");

        listaPeliculas.add(peli1);
        listaPeliculas.add(peli2);
        listaPeliculas.add(peli3);
        listaPeliculas.add(peli4);
        listaPeliculas.add(peli5);
        listaPeliculas.add(peli6);
        listaPeliculas.add(peli7);

        return view;
    }


}
