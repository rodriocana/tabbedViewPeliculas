package com.example.tabbedview.Controlador;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.fragment.app.FragmentActivity;

public class BaseDatosPeliculas extends SQLiteOpenHelper {



    public BaseDatosPeliculas(FragmentActivity context) {

        super(context, "PeliculasSeriesJuegos", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
