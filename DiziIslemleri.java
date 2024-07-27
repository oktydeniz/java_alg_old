package bolum07;

import java.util.Scanner;

public class DiziIslemleri {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		
		final int DIZI_UZUNLUGU = 2;
		
		
		int[] dizi = new int[DIZI_UZUNLUGU];
		
		/*
		System.out.println("Lutfen " + dizi.length + " tane sayi giriniz:");
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = klavye.nextInt();
		}
		*/
		
		System.out.println("once " + dizi[0]);
		
		dizi = new int[10];
		
		System.out.println("sonra " + dizi[0]);
		
		// diziyi sassal elemanlarla dolduruyoruz
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int)(Math.random() * 100);
		}
		
		
		// dizi elemanlari yazdiriliyor
		for (int i = 0; i < dizi.length; i++) {
			System.out.printf("%4d", dizi[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		
		
		
		System.out.println(dizi);
		char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
		System.out.println(city);
		
		String str = "Dallas";
		System.out.println(str);
		
		
		// dizinin toplami bulunuyor
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			toplam += dizi[i]; //toplam = toplam + dizi[i];
		}
		
		System.out.println("Dizi elemanlarinin toplami: " + toplam);
		
		
		// dizinin en buyuk elemani bulunuyor
		// en buyuk elemanin (en kucuk) indeksi bulunuyor
		int enBuyukEleman = 0;
		int enBuyukElemaninIndexsi = -1;
		for (int i = 0; i < dizi.length; i++) {
			if (enBuyukEleman < dizi[i]) {
				enBuyukEleman = dizi[i];
				enBuyukElemaninIndexsi = i; 
			}
		}
		System.out.println("Dizideki en buyuk eleman: " + enBuyukEleman + " dir");
		System.out.println("Dizideki en buyuk elemanin indeksi: " + enBuyukElemaninIndexsi + " dir");
		
		
		// dizi rassal bir sekilde karistiriliyor
		for (int i = 0; i < dizi.length; i++) {
			int rassalIndeks = (int)(Math.random() * dizi.length);
			
			int gecici = dizi[i];
			dizi[i] = dizi[rassalIndeks];
			dizi[rassalIndeks] = gecici;
		}
		
		// dizi elemanlari yazdiriliyor
		for (int i = 0; i < dizi.length; i++) {
			System.out.printf("%4d", dizi[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		
		// dizinin elemnlari kaydiriliyor (sola)
		int ilkEleman = dizi[0];
		for (int i = 0; i < dizi.length - 1; i++) {
			dizi[i] = dizi[i + 1];
		}
		dizi[dizi.length-1] = ilkEleman;
		
		
		// dizi elemanlari yazdiriliyor
		for (int i = 0; i < dizi.length; i++) {
			System.out.printf("%4d", dizi[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		
		
	}

}
