package com.example.recycleview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailMakanan extends AppCompatActivity {
    TextView tvNamaMakananDetail;
    TextView tvDeskripsiMakananDetail;
    TextView tvHargaMakananDetail;
    ImageView fotoDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_makanan);

        tvNamaMakananDetail = findViewById(R.id.tvNamaMakananDetail);
        tvDeskripsiMakananDetail = findViewById(R.id.tvDeskripsiMakananDetail);
        tvHargaMakananDetail = findViewById(R.id.tvHargaMakananDetail);
        fotoDetail = findViewById(R.id.fotoDetail);

        Intent intent = getIntent();

        String namaMakanan = intent.getStringExtra("namaMakanan");
        String deskripsiMakanan = intent.getStringExtra("deskripsiMakanan");
        String hargaMakanan = intent.getStringExtra("hargaMakanan");
        int foto = intent.getIntExtra("foto",0);

        tvNamaMakananDetail.setText(namaMakanan);
        tvDeskripsiMakananDetail.setText(deskripsiMakanan);
        tvHargaMakananDetail.setText(hargaMakanan);
        fotoDetail.setImageResource(foto);
    }
}