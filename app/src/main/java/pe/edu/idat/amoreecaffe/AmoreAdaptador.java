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

public class AmoreAdaptador extends RecyclerView.Adapter<AmoreAdaptador.ViewHolder> {

    private List<Amore> lista;
    private Context context;

    public AmoreAdaptador(List<Amore> lista, Context context) {
        this.lista = lista;
        this.context = context;
    }

    @NonNull
    @Override
    public AmoreAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(FragmentMenuLorenzoBinding.inflate
                (LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AmoreAdaptador.ViewHolder holder, int position) {
        final Amore itemAndroid = lista.get(position);
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
