package com.example.tabbedview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tabbedview.Modelo.Serie;

import java.util.List;

public class AdaptadorSerie extends RecyclerView.Adapter<AdaptadorSerie.ViewHolder> {

    List<Serie> listaSeries;
    Context context;

    public AdaptadorSerie(List<Serie> listaSeries, Context context) {
        this.listaSeries = listaSeries;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cardview_vista, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Serie serie = listaSeries.get(position);

        int resourceId = context.getResources().getIdentifier(serie.getBackgroundImagen(), "drawable", context.getPackageName());
        holder.imageView.setImageResource(resourceId);
    }

    @Override
    public int getItemCount() {
        return listaSeries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);

        }
    }
}
