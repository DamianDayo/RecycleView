package com.example.recycleview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterListMakanan.OnItemClickListener{
    RecyclerView rvListMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rvListMakanan = (RecyclerView) findViewById(R.id.rvListMakanan);
        rvListMakanan.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<MakananModel> dataMakanan = new ArrayList<>();
        dataMakanan.add(new MakananModel("Soto Ayam", "Soto ayam uenak buwanget rek", "Rp 12.000", R.drawable.somto));
        dataMakanan.add(new MakananModel("Bubur Ayam", "Bubur ayam dengan suwiran daging ayam segar", "Rp 10.000", R.drawable.bumbur));
        dataMakanan.add(new MakananModel("Ayam Goreng", "Ayam goreng crispy kriuk", "Rp 15.000", R.drawable.gomremng));
        dataMakanan.add(new MakananModel("Ayam Bakar", "Ayam bakar yang dibakar dengan batu dari planet Mars", "Rp 17.000", R.drawable.bamkar));

        AdapterListMakanan adapterListMakanan = new AdapterListMakanan(dataMakanan, this);
        rvListMakanan.setAdapter(adapterListMakanan);
    }

    @Override
    public void onItemClick(MakananModel makananModel) {
        Toast.makeText(this, makananModel.getNamaMakanan() + ", " + makananModel.getHargaMakanan(), Toast.LENGTH_SHORT).show();

        Intent in = new Intent(MainActivity.this, DetailMakanan.class);

        in.putExtra("foto",makananModel.getFoto());
        in.putExtra("namaMakanan",makananModel.getNamaMakanan());
        in.putExtra("deskripsiMakanan",makananModel.getDeskripsiMakanan());
        in.putExtra("hargaMakanan",makananModel.getHargaMakanan());
        startActivity(in);
    }
}