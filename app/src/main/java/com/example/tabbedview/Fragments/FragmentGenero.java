package com.example.tabbedview.Fragments;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tabbedview.AdaptadorGenero;
import com.example.tabbedview.Controlador.BaseDatosPeliculas;
import com.example.tabbedview.Modelo.Genero;
import com.example.tabbedview.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentGenero extends Fragment {



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recyclefragment, container, false);

        RecyclerView rv = view.findViewById(R.id.recycleId);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));

        List<Genero> listaGeneros = getFullList();

        AdaptadorGenero adapter = new AdaptadorGenero(listaGeneros, getActivity());
        rv.setAdapter(adapter);




        return view;

    }

    public List<Genero> getFullList(){

        List<Genero> listado = new ArrayList<>();

        SQLiteDatabase db = new BaseDatosPeliculas(getActivity()).getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM Genero", null);  // aqui hacemos la consulta


        if (cursor.getCount() == 0) {
            Log.e("PMDM", "La base de datos está vacía.");
        } else {
            cursor.moveToFirst();
            do {  // Recorremos el conjunto de registros recibidos en el cursor
                int dataId  = cursor.getInt(cursor.getColumnIndexOrThrow("genero_id"));
                String nombre = cursor.getString(cursor.getColumnIndexOrThrow("genero_nombre"));
                String foto = cursor.getString(cursor.getColumnIndexOrThrow("foto"));

                Genero genero = new Genero(dataId, nombre, foto);
                listado.add(genero); // almacenamos en el List cada pintura recuperada
            } while (cursor.moveToNext());

            cursor.close();
            db.close();
        }

        return listado;

    }

}