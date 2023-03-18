/**
* File		: Poligon.java 18/03/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Representasi dasar dari objek poligon (segi banyak)
* Lab		: B1
*/

package org.poligon;

public class Poligon {
    protected int jumlahSisi;

    public Poligon() {
    }

    public void setJumlahSisi(int sisi) {
        this.jumlahSisi = sisi;
    }

    public int getJumlahSisi() {
        return this.jumlahSisi;
    }
}