package com.example.exercicireycleview1;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ColorViewHolder> {
    private List<miColor> items;
    public static class ColorViewHolder extends RecyclerView.ViewHolder{
        public TextView nombre;
        public TextView hexadecimal;
        public View color;
        public ImageView vocales;

        public ColorViewHolder( View itemView) {
            super(itemView);
            color = (View) itemView.findViewById(R.id.color);
            hexadecimal = (TextView) itemView.findViewById(R.id.hexadecimal);
            nombre = (TextView) itemView.findViewById(R.id.nombre);
            vocales = (ImageView) itemView.findViewById(R.id.vocales);
            //aqui hacer el onClick

        }
    }
    public ColorAdapter(List<miColor> items){
        this.items=items;
    }

    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //instanciamos el layout que queremos implementar
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ejercicio1, parent, false);
        return new ColorViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ColorAdapter.ColorViewHolder holder, int position) {
        //SI EMPIEZA POR VOCAL VISIBLE
        holder.color.setBackgroundColor(Color.parseColor(items.get(position).getColor()));
        holder.hexadecimal.setText(items.get(position).getHexadecimal());
        holder.nombre.setText(items.get(position).getNombre());
        holder.vocales.setImageResource(items.get(position).getImagenV());
        if(items.get(position).getNombre().startsWith("A") || items.get(position).getNombre().startsWith("E")||items.get(position).getNombre().startsWith("I") ||items.get(position).getNombre().startsWith("O")||items.get(position).getNombre().startsWith("U") ){
          holder.vocales.setVisibility(View.VISIBLE);
        }else{
            holder.vocales.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
