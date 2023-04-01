/**
* File		: Asersi2.java 30/03/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Program untuk demo asersi, yang akan menolak input
			jari-jari lingkaran yang bernilai nol
* Lab		: B1
*/

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari > 0): "jari-jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "+kelilingLingkaran);
	}
}

/* Pertanyaan modul: 
Ada yang kurang tepat pada program Asersi2 di atas?

Ada, yang kurang tepat adalah kondisi jariJari > 0 yang seharusnya 
kondisi yang tepat adalah jariJari != 0. 
Karena jika yang diinginkan angka yang bukan nol, 
maka masukan jari-jari masih bisa bernilai angka negatif.
sehingga jika jariJari > 0 digunakan, maka untuk jari-jari yang bernilai negatif 
tidak dapat dijalankan. Maka, kondisi yang paling tepat digunakan adalah jariJari != 0*/