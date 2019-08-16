package com.example.myasci;

import android.os.Parcel;
import android.os.Parcelable;

public class AsciIModel implements Parcelable {

    private String nama ;
    private String nrp;
    private String tempatTanggalLahir;
    private String alamat;
    private String noHP;
    private String email;
    private String lineOrIg;
    private String motto;
    private String photo;

    protected AsciIModel(Parcel in) {
        nama = in.readString();
        nrp = in.readString();
        tempatTanggalLahir = in.readString();
        alamat = in.readString();
        noHP = in.readString();
        email = in.readString();
        lineOrIg = in.readString();
        motto = in.readString();
        photo = in.readString();
    }

    public static final Creator<AsciIModel> CREATOR = new Creator<AsciIModel>() {
        @Override
        public AsciIModel createFromParcel(Parcel in) {
            return new AsciIModel(in);
        }

        @Override
        public AsciIModel[] newArray(int size) {
            return new AsciIModel[size];
        }
    };

    public AsciIModel() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getTempatTanggalLahir() {
        return tempatTanggalLahir;
    }

    public void setTempatTanggalLahir(String tempatTanggalLahir) {
        this.tempatTanggalLahir = tempatTanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLineOrIg() {
        return lineOrIg;
    }

    public void setLineOrIg(String lineOrIg) {
        this.lineOrIg = lineOrIg;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(nrp);
        dest.writeString(tempatTanggalLahir);
        dest.writeString(alamat);
        dest.writeString(noHP);
        dest.writeString(email);
        dest.writeString(lineOrIg);
        dest.writeString(motto);
        dest.writeString(photo);
    }
}
