package com.example.tabbedview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tabbedview.Modelo.Pelicula;

import java.util.List;

public class AdaptadorPeliculas extends RecyclerView.Adapter<AdaptadorPeliculas.ViewHolder> {

    List<Pelicula> listaPeliculas;
    Context context;

    public AdaptadorPeliculas(List<Pelicula> listaPeliculas, Context context) {
        this.listaPeliculas = listaPeliculas;
        this.context = context;
    }

    @NonNull
    @Override
    public AdaptadorPeliculas.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cardview_vista, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPeliculas.ViewHolder holder, int position) {
        Pelicula pelicula = listaPeliculas.get(position);

        //holder.txtNombrePelicula.setText(pelicula.getTitulo());
        //holder.txtDirector.setText(pelicula.getDirector());

        int resourceId = context.getResources().getIdentifier(pelicula.getBackgroundImagen(), "drawable", context.getPackageName());
        holder.imageView.setImageResource(resourceId);

    }

    @Override
    public int getItemCount() {
        return listaPeliculas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtNombrePelicula;
        TextView txtDirector;

         ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //txtDirector = itemView.findViewById(R.id.txtNombre);
           // txtNombrePelicula = itemView.findViewById(R.id.TxtOtro);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
