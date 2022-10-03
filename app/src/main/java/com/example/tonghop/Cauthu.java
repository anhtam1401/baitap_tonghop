package com.example.tonghop;

public class Cauthu {
    private String Ten;
    private String Mota;
    private String Noidung;
    private int Hinh, Co;

    public Cauthu (String ten, String mota,String noidung, int hinh,int co){
        Ten = ten ;
        Mota =mota;
        Noidung = noidung;
        Hinh = hinh ;
        Co = co;
    }

    public String getTen() {
        return Ten;
    }
    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMota() {
        return Mota;
    }
    public void setMota(String mota) {
        Mota = mota;
    }

    public String getNoidung() {
        return Noidung;
    }
    public void setNoidung(String noidung) {Noidung = noidung;}

    public int getHinh() {
        return Hinh;
    }
    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public int getCo() {
        return Co;
    }
    public void setCo(int co) {Co = co;}
}

