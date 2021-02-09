package com.example.jualbelionline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void produkbarang(View view){
        Intent intent=new Intent(MainActivity.this, ProdukBarangActivity.class);
        startActivity(intent);

    }
    public void pengaturan(View view){
        Intent intent=new Intent(MainActivity.this, PengaturanActivity.class);
        startActivity(intent);

    }
    public void pemberitahuan(View view){
        Intent intent=new Intent(MainActivity.this, PemberitahuanActivity.class);
        startActivity(intent);

    }
    public void keranjang(View view){
        Intent intent=new Intent(MainActivity.this, KeranjangActivity.class);
        startActivity(intent);

    }
    public void pencarianbarang(View view){
        Intent intent=new Intent(MainActivity.this, PencarianBarangActivity.class);
        startActivity(intent);

    }
    public void belanja(View view){
        Intent intent=new Intent(MainActivity.this, BelanjaActivity.class);
        startActivity(intent);

    }
}
