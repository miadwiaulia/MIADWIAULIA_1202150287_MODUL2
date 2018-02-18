package com.tugas.asus.miadwiaulia_1202150287_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData() {
        for (int i = 0; i < 3; i++) {
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("Mint Ice Cream");
            foods.add("Cutton Candy Ice Cream");
            foods.add("Fish Ice Cream");
            foods.add("Ice Cream Bucket");
            foods.add("Oreo Ice Cream");
            foods.add("Unicorn Ice Cream");
            foods.add("Rainbow Ice Cream");
            foods.add("Black Ice Cream");
            foods.add("Ombre Ice Cream");

            // mamanggil harga
            priceses.add(20000);
            priceses.add(20000);
            priceses.add(30000);
            priceses.add(25000);
            priceses.add(25000);
            priceses.add(20000);
            priceses.add(20000);
            priceses.add(10000);
            priceses.add(10000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.minticecream);
            photos.add(R.drawable.cuttoncandyicecream);
            photos.add(R.drawable.fishicecream);
            photos.add(R.drawable.icecreambucket);
            photos.add(R.drawable.oreoicecream);
            photos.add(R.drawable.unicornicecream);
            photos.add(R.drawable.rainbowicecream);
            photos.add(R.drawable.blackicecream);
            photos.add(R.drawable.ombreicecream);
        }
    }
}
