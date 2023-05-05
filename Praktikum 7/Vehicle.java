/**
* File		: Vehicle.java 03/05/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Representasi dari objek Vehicle
* Lab		: B1
*/

public class Vehicle{
	void calRent(int distance, float price){
		float fare = distance * price;
		System.out.println("vehicle price = "+fare);
	}
}