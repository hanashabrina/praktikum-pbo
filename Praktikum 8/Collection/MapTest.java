/**
* File		: MapTest.java 17/05/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Program yang menggunakan Generic untuk pasangan Kunci-Nilai
* Lab		: B1
*/

import java.util.*;

public class MapTest{
	public static void main(String[] args){
		//kunci -> integer, nilai -> string
		Map<Integer,String> map = new HashMap<Integer,String>();
		//menempatkan elemen kunci dan nilai
		map.put(1, "satu");
		map.put(2, "dua");
		//mengambil elemen pertama
		System.out.println(map.get(1));
		//mengambil keseluruhan kunci sebagai objek collection set
		Set<Integer> keys = map.keySet();
		//iterasi untuk mengambil keseluruhan nilai dari kunci
		for(Integer key: keys){
			System.out.println(key + " : " + map.get(key));
		}
	}
}
