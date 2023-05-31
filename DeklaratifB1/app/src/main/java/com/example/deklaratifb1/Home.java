
package com.example.deklaratifb1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Context;
//    2101010094
//    I Komang Gesah Indrada
public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        Semua kodingan dibawah ini berfungsi untuk pindah kehalaman lain.
//        Kodingan ini akan kemenu databarang ketika di klik button databarang.
        Button menudatabarang = findViewById(R.id.btndatabarang);
        menudatabarang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, barang.class);
                startActivity(intent);
            }
        });

        Button menujenis = findViewById(R.id.btnjenis);
        menujenis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, jenis.class);
                startActivity(intent);
            }
        });

        Button menupenjualan = findViewById(R.id.btnpenjualan);
        menupenjualan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, penjualan.class);
                startActivity(intent);
            }
        });

        Button menupembelian = findViewById(R.id.btnpembelian);
        menupembelian.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, pembelian.class);
                startActivity(intent);
            }
        });

        Button menulogin = findViewById(R.id.btnlogout);
        menulogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}