/*
* Pembuat	: Hana Shabrina
* NIM		: 24060121130077
* Tanggal	: 3 Maret 2023
* Deskripsi	: Kelas yang berisi program utama yang memanfaatkan kelas operasi titik dan titik
* Lab		: B1
*/

class MOperasiTitik{
	public static void main(String[] args){
		Titik t1;
		Titik t2;
	
		t1 = new Titik();
		t2 = new Titik();
				
		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);
				
		t2.setAbsis(4.0);
		t2.setOrdinat(9.0);
				
		System.out.println("t1.x = "+t1.absis);
		System.out.println("t1.y = "+t1.ordinat);
			
		System.out.println("t2.x = "+t2.getAbsis());
		System.out.println("t2.y = "+t2.getOrdinat());
				
		System.out.println("Counter Titik = "+t1.getCounterTitik());
				
		OperasiTitik op = new OperasiTitik();
		// op.refleksiSumbuX(t1);
		// System.out.println("\nTitik t1 setelah refleksi sumbu X menggunakan prosedur refleksiSumbuX");
		// System.out.println("t1.x setelah refleksi X = "+t1.getAbsis());
		// System.out.println("t1.y setelah refleksi X = "+t1.getOrdinat());
				
		// op.refleksiSumbuY(t1);
		// System.out.println("\nTitik t2 setelah refleksi sumbu Y menggunakan prosedur refleksiSumbuY");
		// System.out.println("t1.x setelah refleksi Y = "+t1.getAbsis());
		// System.out.println("t1.y setelah refleksi Y = "+t1.getOrdinat());
				
		op.refleksiX(t1);
		System.out.println("\nTitik t1 setelah refleksi sumbu X menggunakan fungsi refleksiX");
		System.out.println("t1.x setelah refleksi X = "+t1.getAbsis());
		System.out.println("t1.y setelah refleksi X = "+t1.getOrdinat());
		
		op.refleksiY(t1);
		System.out.println("\nTitik t1 setelah refleksi sumbu Y menggunakan fungsi refleksiY");
		System.out.println("t1.x setelah refleksi Y = "+t1.getAbsis());
		System.out.println("t1.y setelah refleksi Y = "+t1.getOrdinat());
	}
}