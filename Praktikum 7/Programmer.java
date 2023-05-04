/**
* File		: Programmer.java 03/05/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Representasi dari objek Programmer, turunan dari kelas Pegawai
* Lab		: B1
*/

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama){
        super(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " +bonus);
    }
}