package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import java.util.ArrayList;

public class SharingStunting extends AppCompatActivity {


    private RecyclerView recyclerView;
    private SharingAdapter sharingAdapter;
    private ArrayList<SharingModel> sharingModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharing_stunting);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        sharingAdapter = new SharingAdapter(sharingModel);

        RecyclerView.LayoutManager layoutManager;
        layoutManager = new LinearLayoutManager(SharingStunting.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(sharingAdapter);

    }

    private void getData() {
        sharingModel = new ArrayList<>();
        sharingModel.add(new SharingModel("Cegah Stunting dengan Perbaikan Pola Makan", R.drawable.informasistunting_1));
        sharingModel.add(new SharingModel("Mengenal Stunting, Kenali Penyebabnya", R.drawable.informasistunting_2));
        sharingModel.add(new SharingModel("Nutrisi Ibu Hamil bantu Cegah Stunting", R.drawable.informasistunting_3));
        sharingModel.add(new SharingModel("Program Penurunan Stunting. Apa Susahnya?", R.drawable.informasistunting_4));
        sharingModel.add(new SharingModel("Tips Bumil Lengakapi Nutrisi Bayi", R.drawable.informasistunting_5));

    }

    public void pindahHome (View view){
        Intent home = new Intent(this, Home.class);
        startActivity(home);
    }
}