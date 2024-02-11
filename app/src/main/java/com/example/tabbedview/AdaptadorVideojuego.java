package com.example.tabbedview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tabbedview.Modelo.Videojuego;

import java.util.List;

public class AdaptadorVideojuego extends RecyclerView.Adapter<AdaptadorVideojuego.ViewHolder> {

    List<Videojuego> listaVideojuego;
    Context context;


    public AdaptadorVideojuego(List<Videojuego> listaVideojuego, Context context) {
        this.listaVideojuego = listaVideojuego;
        this.context = context;
    }

    @NonNull
    @Override
    public AdaptadorVideojuego.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cardview_vista, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorVideojuego.ViewHolder holder, int position) {

        Videojuego videojuego = listaVideojuego.get(position);

        int resourceId = context.getResources().getIdentifier(videojuego.getBackgroundImagen(), "drawable", context.getPackageName());
        holder.imageView.setImageResource(resourceId);

    }

    @Override
    public int getItemCount() {
        return listaVideojuego.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
