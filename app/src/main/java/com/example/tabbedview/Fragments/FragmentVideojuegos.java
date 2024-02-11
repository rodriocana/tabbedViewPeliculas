package com.example.tabbedview.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tabbedview.AdaptadorVideojuego;
import com.example.tabbedview.Modelo.Videojuego;
import com.example.tabbedview.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentVideojuegos extends Fragment {

    List<Videojuego> listaVideojuegos = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.recyclefragment, container, false);

        RecyclerView rv = view.findViewById(R.id.recycleId);
        rv.setLayoutManager(new LinearLayoutManager(getActivity() ));

        AdaptadorVideojuego adapter = new AdaptadorVideojuego(listaVideojuegos,getActivity());
        rv.setAdapter(adapter);

        Videojuego video1 = new Videojuego("Metal Gear Solid 3", "Sony", "metalgearsolid");
        Videojuego video2 = new Videojuego("Halo 3", "Microsoft", "haloo");
        Videojuego video3 = new Videojuego("God Of War", "Sony", "godofwar2");
        Videojuego video4 = new Videojuego("Zelda", "Nintendo", "zelda");
        Videojuego video5 = new Videojuego("GTA IV", "Sony", "gtavii");
        Videojuego video6 = new Videojuego("Gears of War", "Microsoft", "gearsofwar");
        Videojuego video7 = new Videojuego("CyberPunk 2042", "Sony", "cyberpunkk");
        Videojuego video8 = new Videojuego("Spiderman 2", "Sony", "spiderman3");

        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);
        listaVideojuegos.add(video6);
        listaVideojuegos.add(video7);
        listaVideojuegos.add(video8);



        return view;

    }
}
