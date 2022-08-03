package com.example.basithesapmakinesi;

public class Hesapla {
    private float gelSayi1, gelSayi2;

    public Hesapla(float gelSayi1, float gelSayi2) {
        this.gelSayi1 = gelSayi1;
        this.gelSayi2 = gelSayi2;
    }

    public float toplam () {
        return gelSayi1 + gelSayi2;
    }
    public float cikarma () {
        return gelSayi1 - gelSayi2;
    }
    public float carpma () {
        return gelSayi1 * gelSayi2;
    }
    public float bolme () {
        return gelSayi1 / gelSayi2;
    }



}
