/**
Nama file : Titik.java
Nama/NIM : Hana Shabrina/24060121130077
Tanggal : 24 februari 2023
Deskripsi : Kelas yang berisi realisasi untuk menjalankan kelas MTitik
**/

class Titik {
	
	double absis;
	double ordinat;
	static int counterTitik;
	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
		
	Titik(double x, double y){
		absis = x;
		ordinat = y;
		counterTitik++;
	}
		
	void setAbsis(double a){
		absis = a;
	}
		
	void setOrdinat(double o){
		ordinat = o;
	}
		
	double getAbsis(){
		return absis;
	}
		
	double getOrdinat(){
		return ordinat;
	}
		
	static int getCounterTitik(){
		return counterTitik;
	}
}
