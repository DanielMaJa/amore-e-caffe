package pe.edu.idat.amoreecaffe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import pe.edu.idat.amoreecaffe.databinding.ActivityCategoriaBinding;

public class CategoriaActivity extends AppCompatActivity {

    ActivityCategoriaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCategoriaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if(getIntent().hasExtra("android")){
            Amore objAndroid = getIntent().getParcelableExtra("android");
            binding.ivcategoriadeasayuno.setImageResource(objAndroid.getImagen());
        }
    }
}