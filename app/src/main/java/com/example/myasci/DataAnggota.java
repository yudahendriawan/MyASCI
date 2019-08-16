package com.example.myasci;

import android.app.DatePickerDialog;

import java.util.ArrayList;

public class DataAnggota {

public static String[][] data = new String[][]{
        {"Yuda Hendriawan Budi Handoko"
                ,"06111640000010"
                ,"Ponorogo, 25 September 1997"
                ,"Jarak, Siman, Ponorogo"
                ,"0852 3524 4417"
                ,"yudahendriawan007@gmail.com"
                ,"yudahendriawanbudih/yudahendriawan"
                ,"Hidup seperti larry"
                ,"https://cdn.myanimelist.net/images/characters/9/310307.jpg"}
};

public static ArrayList<AsciIModel> getListData() {
    ArrayList<AsciIModel> list = new ArrayList<>();
    for (String[] anggotaASCI : data) {

        AsciIModel asciIModel = new AsciIModel();

        asciIModel.setNama(anggotaASCI[0]);
        asciIModel.setNrp(anggotaASCI[1]);
        asciIModel.setTempatTanggalLahir(anggotaASCI[2]);
        asciIModel.setAlamat(anggotaASCI[3]);
        asciIModel.setNoHP(anggotaASCI[4]);
        asciIModel.setEmail(anggotaASCI[5]);
        asciIModel.setLineOrIg(anggotaASCI[6]);
        asciIModel.setMotto(anggotaASCI[7]);
        asciIModel.setPhoto(anggotaASCI[8]);

        list.add(asciIModel);

    }
    return list;
}

}




