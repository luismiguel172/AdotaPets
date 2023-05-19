package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class Menu_Activity extends AppCompatActivity implements View.OnClickListener{
    MaterialCardView idMenuPets, idMenuProdutos, idMenuDoacoes, idMenuServicos, idMenuLocalizacao, idMenuParceiros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        idMenuPets = findViewById(R.id.idMenuPets);
        idMenuProdutos = findViewById(R.id.idMenuProdutos);
        idMenuDoacoes = findViewById(R.id.idMenuDoacoes);
        idMenuServicos = findViewById(R.id.idMenuServicos);
        idMenuLocalizacao = findViewById(R.id.idMenuLocalizacao);
        idMenuParceiros = findViewById(R.id.idMenuParceiros);

        idMenuPets.setOnClickListener(this);
        idMenuProdutos.setOnClickListener(this);
        idMenuDoacoes.setOnClickListener(this);
        idMenuServicos.setOnClickListener(this);
        idMenuLocalizacao.setOnClickListener(this);
        idMenuParceiros.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.idMenuPets:
                startActivity(new Intent(getApplicationContext(),
                    Pets_Activity.class));
                break;
            case R.id.idMenuProdutos:
                startActivity(new Intent(getApplicationContext(),
                        Alimentos_Activity.class));
                break;
            case R.id.idMenuDoacoes:
                startActivity(new Intent(getApplicationContext(),
                        Doacoes_Activity.class));
                break;
            case R.id.idMenuServicos:
                startActivity(new Intent(getApplicationContext(),
                        Servicos_Activity.class));
                break;
            case R.id.idMenuLocalizacao:
                startActivity(new Intent(getApplicationContext(),
                        Localizacao_Activity.class));
                break;
            case R.id.idMenuParceiros:
                startActivity(new Intent(getApplicationContext(),
                        Parceiros_Activity.class));
                break;
        }
    }
}