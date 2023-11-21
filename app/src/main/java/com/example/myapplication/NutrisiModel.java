package com.example.myapplication;

public class NutrisiModel {
    private String namaNutrisi;
    private String logoNutrisi;

    public NutrisiModel(String namaNutrisi, int logoNutrisi) {
        this.namaNutrisi = namaNutrisi;
        this.logoNutrisi = String.valueOf(logoNutrisi);
    }

    public String getNamaNutrisi() {
        return namaNutrisi;
    }

    public void setNamaNutrisi(String namaNutrisi) {
        this.namaNutrisi = namaNutrisi;
    }

    public int getLogoNutrisi() {
        return Integer.parseInt(logoNutrisi);
    }

    public void setLogoNutrisi(String logoNutrisi) {
        this.logoNutrisi = logoNutrisi;
    }
}
