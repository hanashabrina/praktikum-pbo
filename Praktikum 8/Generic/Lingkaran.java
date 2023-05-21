/**
* File		: Lingkaran.java 17/05/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: implementasi Lingkaran sebagai BangunDatar
* Lab		: B1
*/

public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}