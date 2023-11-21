package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DetailSharing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sharing);
    }

    public void pindahStunting (View view){
        Intent stunting = new Intent(this, SharingStunting.class);
        startActivity(stunting);
    }
}