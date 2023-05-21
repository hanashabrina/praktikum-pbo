/**
* File		: BangunDatarGeneric.java 17/05/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Kelas konstruksi generic untuk BangunDatar
* Lab		: B1
*/

public class BangunDatarGeneric<T1 extends BangunDatar>{
	private T1 bangunDatar;
	
	public void set(T1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T1 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

//dilakukan pengubahan karakter T menjadi T1 yang 
//bertujuan untuk memberi nama parameter generik deskriptif 
//sehingga dapat membedakan saat menggunakan lebih dari 1 
//parameter generik di dalam kelas BangunDatarGeneric.
//dan mengubah karakter T menjadi T1 atau karakter lain di 
//dalam kelas BangunDatarGeneric, tidak akan menimbulkan masalah,
//program BangunDatarGeneric akan tetap berjalan 
//karena karakter yang digunakan hanya sebagai nama variabel saja
