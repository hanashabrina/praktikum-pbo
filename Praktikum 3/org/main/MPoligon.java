/**
* File		: MPoligon.java 08/03/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Driver class untuk poligon, persegi panjang, dan segitiga
* Lab		: B1
*/

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		System.out.println("--Persegi Panjang--");
		PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
	
		System.out.println("\n--Segitiga--");
		Segitiga segitiga = new Segitiga(10, 30, 3);
		segitiga.printInfo();
		System.out.println("Luas Segitiga : "+segitiga.hitungLuasSegitiga());
	}
}