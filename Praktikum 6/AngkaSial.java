/**
* File		: AngkaSial.java 30/03/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Program penggunaan exception buatan sendiri
		pengenalan klausa 'throw' dan 'throws'
* Lab		: B1
*/

public class AngkaSial{
	
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka == 13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

/*Pertanyaan modul: 

Ketika eksepsi terjadi, apakah baris 12 (baris 15 pada codingan) 
pada AngkaSial.java di atas dieksekusi?
baris 15 tidak akan dieksekusi karena program langsung keluar dari blok try-catch 
dan melanjutkan eksekusi pada blok catch.

Apakah baris 21 (baris 24 pada codingan) pada AngkaSial.java di atas dieksekusi?
Baris 24 pada AngkaSial.java tidak akan dieksekusi karena 
program keluar dari blok try-catch pada saat terjadi eksepsi.*/
