package com.example.android.resto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> namaList;
    private ArrayList<String> hargaList;
    private ArrayList<String> keteranganList;
    private ArrayList<Integer> imageList;
    //Daftar makanan
    private String[] Makanan = {"Sate", "Gorengan", "Donat"};
    //Daftar Harga
    private String[] Harga = {"Rp.15000","Rp.5000","Rp.3000"};
    private String[] Keterangan = {"Ayam","Bala-bala","Donat coklat"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.sate, R.drawable.gorengan, R.drawable.donat};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        namaList = new ArrayList<>();
        hargaList = new ArrayList<>();
        keteranganList = new ArrayList<>();
        imageList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerview);
        DaftarItem();

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(namaList, hargaList, keteranganList, imageList);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
    }


    private void DaftarItem(){
        for (int w=0; w<Makanan.length; w++){
            namaList.add(Makanan[w]);
            hargaList.add(Harga[w]);
            keteranganList.add(Keterangan[w]);
            imageList.add(Gambar[w]);
        }
    }
}
