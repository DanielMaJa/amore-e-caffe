package pe.edu.idat.amoreecaffe;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pe.edu.idat.amoreecaffe.databinding.FragmentMenuLorenzoBinding;

public class CategoriaAdaptador extends RecyclerView.Adapter<CategoriaAdaptador.ViewHolder> {

    private List<CategoriaEntity> lista;
    private Context context;

    public CategoriaAdaptador(List<CategoriaEntity> lista, Context context) {
        this.lista = lista;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoriaAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(FragmentMenuLorenzoBinding.inflate
                (LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriaAdaptador.ViewHolder holder, int position) {
        final CategoriaEntity itemAndroid = lista.get(position);
        holder.binding.ivdesayunos.setImageResource(itemAndroid.getImagen());
        holder.binding.contenedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAndroidCategoria = new Intent(context,
                        CategoriaActivity.class);
                intentAndroidCategoria.putExtra("android",itemAndroid);
                context.startActivity(intentAndroidCategoria);
            }
        });

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        FragmentMenuLorenzoBinding binding;
        public ViewHolder(@NonNull FragmentMenuLorenzoBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
