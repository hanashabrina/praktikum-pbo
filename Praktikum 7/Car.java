/**
* File		: Car.java 03/05/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Representasi dari objek Car, turunan dari kelas Vehicle
* Lab		: B1
*/

public class Car extends Vehicle{
	void calRent(int jarak, float harga){
		float fare = jarak * harga;
		fare = fare - 100.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}