/**
* File		: MKubus.java 18/03/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Driver class untuk kubus
* Lab		: B1
*/

package org.main; 
 
import org.bangunruang.*; 
import org.bangundatar.*; 
 
public class MKubus{ 
	public static void main(String[] args){ 
		BujurSangkar bujurSangkar = new BujurSangkar(6); 
		Kubus kubus = new Kubus(bujurSangkar); 
		System.out.println("Luas Alas Kubus : "+kubus.hitungLuasAlas()); 
		System.out.println("Volume Kubus : "+kubus.hitungVolume()); 
	} 
}