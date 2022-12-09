package pe.edu.idat.amoreecaffe;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


import pe.edu.idat.amoreecaffe.databinding.FragmentMenuBinding;

public class MenuFragment extends Fragment {


    private FragmentMenuBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMenuBinding.inflate(inflater, container, false);

        ArrayList<Amore> lista = new ArrayList<>();
        lista.add(new Amore(lista.size() + 1, R.drawable.desayunos));
        lista.add(new Amore(lista.size() + 1, R.drawable.bebidas));
        lista.add(new Amore(lista.size() + 1, R.drawable.jugos));
        lista.add(new Amore(lista.size() + 1, R.drawable.postres));
        binding.rvandroid.setLayoutManager(new LinearLayoutManager(this.getContext()));
        AmoreAdaptador adapter = new AmoreAdaptador(lista, this.getContext());
        binding.rvandroid.setAdapter(adapter);

        return binding.getRoot();

    }



}



