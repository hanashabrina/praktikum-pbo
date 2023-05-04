/**
* File		: Manajer.java 03/05/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Representasi dari objek Manajer, turunan dari kelas Pegawai
* Lab		: B1
*/

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama){
        super(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " +tunjangan);
    }
}
