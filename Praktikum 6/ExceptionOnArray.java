/**
* File		: ExceptionOnArray.java 30/03/2023
* Penulis	: Hana Shabrina/24060121130077
* Deskripsi	: Program penggunaan eksepsi menggunakan class library Java
* Lab		: B1
*/

public class ExceptionOnArray{
	public static void main(String[] args){
		//instansiasi object array integer
		Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		}catch(ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();
		}finally{
			System.out.println("clean up code...");
		}
	}
}