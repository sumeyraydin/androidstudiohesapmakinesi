package com.example.basithesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText ilksayi, ikincisayi;
    private TextView textSonuc;
    private String gelenSayi1, gelenSayi2;
    private float s1, s2, sonuc;
    private Hesapla hesapla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ilksayi = (EditText) findViewById(R.id.ilksayi);
        ikincisayi = (EditText) findViewById(R.id.ikincisayi);
        textSonuc = (TextView) findViewById(R.id.textSonuc);
    }

    public void btnHesapla(View v) {

        gelenSayi1 = ilksayi.getText().toString();
        gelenSayi2 = ikincisayi.getText().toString();

        if (!TextUtils.isEmpty(gelenSayi1) && !TextUtils.isEmpty(gelenSayi2)) {
            s1 = Integer.valueOf(gelenSayi1);
            s2 = Integer.valueOf(gelenSayi2);
            hesapla = new Hesapla(s1, s2);

            switch (v.getId()) {

                case R.id.button:
                    sonuc = hesapla.toplam();
                    textSonuc.setText("SONUC:"+sonuc);
                    break;
                case R.id.button2:
                    sonuc = hesapla.cikarma();
                    textSonuc.setText("SONUC:"+sonuc);
                    break;
                case R.id.button3:
                    sonuc = hesapla.carpma();
                    textSonuc.setText("SONUC:"+sonuc);
                    break;
                case R.id.button4:
                    sonuc = hesapla.bolme();
                    textSonuc.setText("SONUC:"+sonuc);
                    break;

            }
            textSonuc.setText("SONUC:"+sonuc);
        } else
            textSonuc.setText("Girilen değerler boş olamazz");
    }
}