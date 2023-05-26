package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Pets_Activity extends AppCompatActivity {

    TabLayout toPets;
    TabItem idItemCachorro, idItemGato, idItemPeixe;
    ViewPager2 idViewPagerPets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pets_layout);

        toPets = findViewById(R.id.idTabLayout);
        idViewPagerPets = findViewById(R.id.idViewPagerPets);
    }
}