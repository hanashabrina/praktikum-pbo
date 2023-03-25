/**
* File		: MLingkaran.java 25/03/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Implementasi cara menghitung luas lingkaran
* Lab		: B1
*/

import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan jejari lingkaran : ");
		double jejari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jejari);
		System.out.println("Luas lingkaran dengan jejari "+jejari+" satuan adalah "+l.hitungLuas());
	}
}