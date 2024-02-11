package com.example.tabbedview.Vista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

import com.example.tabbedview.AdaptadorPeliculas;
import com.example.tabbedview.Controlador.BaseDatosPeliculas;
import com.example.tabbedview.Modelo.Pelicula;
import com.example.tabbedview.R;

import java.util.ArrayList;
import java.util.List;

public class ActivitySegunda extends AppCompatActivity {

    int id_genero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peliculas);

        Intent i = getIntent();
        id_genero = i.getIntExtra("id", -1);

        List<Pelicula> registropelicula = getFullListPelicula();

        RecyclerView recyclerViewJugador = findViewById(R.id.recycleViewPelis);
        recyclerViewJugador.setLayoutManager(new LinearLayoutManager(this));

        AdaptadorPeliculas adapter = new AdaptadorPeliculas(registropelicula,this);
        recyclerViewJugador.setAdapter(adapter);

    }

    public List<Pelicula> getFullListPelicula(){

        List<Pelicula> listado = new ArrayList<>();

        SQLiteDatabase db = new BaseDatosPeliculas(this).getReadableDatabase();  // aqui iniciamos la base de datos
        Cursor cursor2 = db.rawQuery("SELECT * FROM Pelicula where genero_id = " + id_genero, null);  // aqui hacemos la consulta

        if (cursor2.getCount() == 0) {
            Log.e("PMDM", "La base de datos está vacía.");
        }
        else
        {
            cursor2.moveToFirst();
            do
            {

                String nombre = cursor2.getString(cursor2.getColumnIndexOrThrow("nombre_pelicula"));
                String director = cursor2.getString(cursor2.getColumnIndexOrThrow("nombre_director"));
                String foto = cursor2.getString(cursor2.getColumnIndexOrThrow("foto"));
                Pelicula p = new Pelicula(nombre,director, foto);
                listado.add(p);

            } while (cursor2.moveToNext());
        }

        return listado;

    }
}

