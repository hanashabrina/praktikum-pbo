/**
* File		: LambdaHashmap.java 31/05/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Implementasi lambda pada hash map
* Lab		: B1
*/

import java.util.HashMap;
import java.util.Map;

public class LambdaHashmap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121130077", "Hana");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " +nim+ ", Nama: " +nama));
    }
}
