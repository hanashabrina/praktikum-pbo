/**
* File		: Lingkaran.java 25/03/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Kelas implementasi IArea berupa cara menghitung luas lingkaran
* Lab		: B1
*/

import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI*jejari*jejari;
	}
}