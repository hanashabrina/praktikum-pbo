/**
* File		: BujurSangkar.java 25/03/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Kelas yang membuat implementasi metode abstrak pada bangun datar
* Lab		: B1
*/

public class BujurSangkar extends BangunDatar{
	//Jika kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar 
	//maka kelas BujurSangkar juga harus dideklarasikan sebagai kelas abstrak. 
	//Ini karena, kelas BujurSangkar akan mewarisi metode abstrak dari kelas induknya (BangunDatar) 
	//tetapi tidak memberikan implementasi untuk metode abstrak tersebut.
	public double hitungLuas(double sisi){
		luas = sisi*sisi;
		return luas;
	}
}
