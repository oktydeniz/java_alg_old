package bolum07;

import java.util.Scanner;

public class YaziyiTerstenYazdir {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir yazi giriniz: ");
		String yazi = klavye.nextLine();
		
		char[] yaziDizisi = yazi.toCharArray();
		
		char[] yazininTersi = terseCevir(yaziDizisi);
		
		System.out.println("Girdiginiz yazinin tersi:");
		System.out.println(yazininTersi);
		
	}

	public static char[] terseCevir(char[] yaziDizisi) {
		char[] yazininTersi = new char[yaziDizisi.length];
		
		for (int i = 0, j = yazininTersi.length - 1; i < yazininTersi.length; i++, j--) {
			yazininTersi[j] = yaziDizisi[i];
		}
		
		return yazininTersi;
	}
	
	

}
