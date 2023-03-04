/*
* Pembuat	: Hana Shabrina
* NIM		: 24060121130077
* Tanggal	: 3 Maret 2023
* Deskripsi	: Kelas yang berisi program operasi titik
* Lab		: B1
*/

class OperasiTitik {
	private void refleksiSumbuX(Titik titik){
		double ordinat = titik.getOrdinat();
		titik.setOrdinat(-1 * ordinat);
	}
	
	private void refleksiSumbuY(Titik titik){
		double absis = titik.getAbsis();
		titik.setAbsis(-1 * absis);
	}
	
	public Titik refleksiX(Titik t1){
		refleksiSumbuX(t1);
		return t1;
	}
	
	public Titik refleksiY(Titik t1){
		refleksiSumbuY(t1);
		return t1;
	}
}