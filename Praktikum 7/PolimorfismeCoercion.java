/**
* File		: PolimorfismeCoercion.java 03/05/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Representasi dari Polimorfisme Coercion
* Lab		: B1
*/

public class PolimorfismeCoercion{
	
	public static int kuadrat(int bilangan){
		return bilangan*bilangan;
	}
	
	public static void main(String[] args){
		//deklarasi objek integer
		Integer bilangan = 10;
		
		//objek integer 'dipaksa' untuk diubah
		//menjadi primitif
		int hasilKuadrat = kuadrat(bilangan);
		
		System.out.printf("Hasil kuadrat %d adalah %d",
			bilangan,
			hasilKuadrat);
	}
}