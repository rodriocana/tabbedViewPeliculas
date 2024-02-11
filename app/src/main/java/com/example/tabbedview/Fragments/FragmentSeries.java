package com.example.tabbedview.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tabbedview.AdaptadorSerie;
import com.example.tabbedview.Modelo.Serie;
import com.example.tabbedview.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentSeries extends Fragment {

    List<Serie> listaSeries = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.recyclefragment, container, false);

        RecyclerView rv = view.findViewById(R.id.recycleId);
        rv.setLayoutManager(new LinearLayoutManager(getActivity() ));

        AdaptadorSerie adapter = new AdaptadorSerie(listaSeries,getActivity());
        rv.setAdapter(adapter);

        Serie serie1 = new Serie("Juego de Tronos", "HBO", "juegotronos2");
        Serie serie2 = new Serie("Los Soprano", "HBO", "sopranos2");
        Serie serie4 = new Serie("Lost", "Netflix", "lost");
        Serie serie5 = new Serie("Hermanos de sangre", "HBO", "hermanos1");
        Serie serie6 = new Serie("True Detective", "HBO", "truedetective");
        Serie serie7 = new Serie("Breaking Bad", "HBO", "breakingbad");

        listaSeries.add(serie1);
        listaSeries.add(serie2);
        listaSeries.add(serie4);
        listaSeries.add(serie5);
        listaSeries.add(serie6);
        listaSeries.add(serie7);

        return view;
    }

}
