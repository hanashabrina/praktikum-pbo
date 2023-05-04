/**
* File		: Pegawai.java 03/05/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Representasi dari objek Pegawai yang menjadi super class
* Lab		: B1
*/

public class Pegawai{
	protected String nama;
    protected int gajiPokok = 5000000;

    public Pegawai(String nama){
        this.nama = nama;
    }
	
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public void tampilData(){
        System.out.println("Nama : " +nama+ ", Gaji pokok : " +gajiPokok);
    }
}