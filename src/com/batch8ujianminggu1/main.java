package com.batch8ujianminggu1;
import java.util.Scanner;

public class main {
	public static void main(String[] args){
	

		Menggambardenganjava hasilgambar = new Menggambardenganjava();
        Scanner scan = new Scanner(System.in);  
        System.out.println("pilihan sesuai alfabet"
        		+ "\n a : kotak "
        		+ "\n b : segitiga "
        		+ "\n c : segitiga terbalik"
        		+ "\n d : selang-seling"
        		+ "\n e : campur"
        		+ "\n f : gabung");
        System.out.print("Masukkan pilihan: ");
		String pilih = scan.next().toLowerCase();

		switch(pilih){
			
		case "a":
		hasilgambar.gambarKotak("kotak");
		hasilgambar.hasil();
		break;
		
		
		case "b":
		hasilgambar.gambarsegitiga("segitiga");
		hasilgambar.hasil();
		break;
		
		case "c":
			hasilgambar.gambarsegitiga("segitiga terbalik");
			hasilgambar.hasil();
			break;
			
		case "d":
			hasilgambar.gambarselangseling("selang-seling");
			hasilgambar.hasil();
			break;
			
		case "e":
			hasilgambar.gambarcampur("campur");
			hasilgambar.hasil();
			break;
			
		case "f":
			hasilgambar.gambargabung("gabung");
			hasilgambar.hasil();
			break;
			default:
	        System.out.println("Tidak Ada ");
	        break;
			
			
		}
	}
}