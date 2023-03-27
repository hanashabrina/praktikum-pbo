/**
* File		: BangunDatar.java 25/03/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Kelas abstrak, berisi abstraksi bangun datar
* Lab		: B1
*/

public abstract class BangunDatar{
	protected double luas;
	
	public abstract double hitungLuas(double sisi);
	
	public void setLuas(double l){
		luas = l;
	}
	
	public double getLuas(){
		return luas;
	}
}