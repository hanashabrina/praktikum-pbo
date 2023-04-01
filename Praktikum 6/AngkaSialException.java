/**
* File		: AngkaSialException.java 30/03/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Eksepsi buatan sendiri, menolak masukan angka 13!
* Lab		: B1
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
}