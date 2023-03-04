/*
* Pembuat	: Hana Shabrina
* NIM		: 24060121130077
* Tanggal	: 3 Maret 2023
* Deskripsi	: Kelas yang mendeskripsikan titik
* Lab		: B1
*/

class Titik {
	public double absis;
	public double ordinat;
	private static int counterTitik;
	
	public Titik() {
		counterTitik++;
	}
	
	public void setAbsis(double a){
		absis = a;
	}
		
	public void setOrdinat(double o){
		ordinat = o;
	}
		
	public double getAbsis(){
		return absis;
	}
		
	public double getOrdinat(){
		return ordinat;
	}
		
	public static int getCounterTitik(){
		return counterTitik;
	}
}