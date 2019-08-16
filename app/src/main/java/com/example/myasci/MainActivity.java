package com.example.myasci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public RecyclerView rvAnggotaAsci;
    public ArrayList<AsciIModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnggotaAsci = findViewById(R.id.rv_anggota_asci);
        rvAnggotaAsci.setHasFixedSize(true);

        list.addAll(DataAnggota.getListData());
        showRecyclerView();
    }

    public void showRecyclerView(){
        rvAnggotaAsci.setLayoutManager(new LinearLayoutManager(this));
        AsciAdapter asciAdapter = new AsciAdapter(list);
        rvAnggotaAsci.setAdapter(asciAdapter);
    }
}
