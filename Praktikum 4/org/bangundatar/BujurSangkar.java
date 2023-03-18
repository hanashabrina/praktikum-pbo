/**
* File		: BujurSangkar.java 18/03/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Representasi dari objek bujur sangkar, turunan kelas poligon
* Lab		: B1
*/

package org.bangundatar; 
 
import org.poligon.Poligon; 
 
public class BujurSangkar extends Poligon{ 
	private double panjangSisi; 
  
	public BujurSangkar(double panjangSisi){ 
		this.jumlahSisi = 4; 
		this.panjangSisi = panjangSisi; 
	} 
  
	public double hitungLuas(){ 
		return panjangSisi * panjangSisi; 
	} 
  
	public double getPanjangSisi(){ 
		return this.panjangSisi; 
	} 
}