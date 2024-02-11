package com.example.tabbedview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tabbedview.Modelo.Genero;
import com.example.tabbedview.Vista.ActivitySegunda;

import java.util.List;

public class AdaptadorGenero extends RecyclerView.Adapter<AdaptadorGenero.ViewHolder> {

    List<Genero> listaGenero;
    Context context;

    public AdaptadorGenero(List<Genero> listaGenero, Context context) {
        this.listaGenero = listaGenero;
        this.context = context;
    }

    @NonNull
    @Override
    public AdaptadorGenero.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cardview_generos, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorGenero.ViewHolder holder, int position) {

        Genero genero = listaGenero.get(position);

        holder.txtgenero.setText(genero.getNombre_genero());

        int resourceId = context.getResources().getIdentifier(genero.getBackgroundImagen(), "drawable", context.getPackageName());
        holder.imagen.setImageResource(resourceId);

        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(context, ActivitySegunda.class);
                intent.putExtra("id", listaGenero.get(position).getId_genero()); // aqui se recoge el id
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listaGenero.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        ImageView imagen;
        TextView txtgenero;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtgenero = itemView.findViewById(R.id.txtGeneroId);
            imagen = itemView.findViewById(R.id.imageView);
            cv = itemView.findViewById(R.id. cardviewId);
        }
    }
}
