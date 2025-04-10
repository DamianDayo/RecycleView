package com.example.recycleview;

public class MakananModel {
    private String namaMakanan;
    private String deskripsiMakanan;
    private String hargaMakanan;

    private int foto;

    public MakananModel(String namaMakanan, String deskripsiMakanan, String hargaMakanan, int foto) {
        this.namaMakanan = namaMakanan;
        this.deskripsiMakanan = deskripsiMakanan;
        this.hargaMakanan = hargaMakanan;
        this.foto = foto;

    }

    public String getNamaMakanan(){
        return namaMakanan;
    }

    public String getDeskripsiMakanan(){
        return deskripsiMakanan;
    }

    public String getHargaMakanan(){
        return hargaMakanan;
    }

    public int getFoto(){
        return foto;
    }
}