package bolum07;

import java.util.Scanner;

public class DiziIslemleriMetodForEach {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		final int DIZI_UZUNLUGU = 10;
		
		int[] dizi = new int[DIZI_UZUNLUGU];
		
		diziyiRassalSayilarlaDoldur(dizi);
		
		diziyiYazdir(dizi);
		
		int toplam = dizininToplaminiBul(dizi);
		
		System.out.println("Dizi elemanlarinin toplami: " + toplam);
		
		dizininenbuyukElemaniniVeIndeksiniYazdir(dizi);
		
		diziyiKaristir(dizi);
		
		diziyiYazdir(dizi);
		
		diziyiSolaKaydir(dizi);
		
		diziyiYazdir(dizi);
	}

	public static void diziyiSolaKaydir(int[] dizi) {
		// dizinin elemnlari kaydiriliyor (sola)
		int ilkEleman = dizi[0];
		for (int i = 0; i < dizi.length - 1; i++) {
			dizi[i] = dizi[i + 1];
		}
		dizi[dizi.length-1] = ilkEleman;
	}

	public static void diziyiKaristir(int[] dizi) {
		// dizi rassal bir sekilde karistiriliyor
		for (int i = 0; i < dizi.length; i++) {
			int rassalIndeks = (int)(Math.random() * dizi.length);
			
			int gecici = dizi[i];
			dizi[i] = dizi[rassalIndeks];
			dizi[rassalIndeks] = gecici;
		}
	}

	public static void dizininenbuyukElemaniniVeIndeksiniYazdir(int[] dizi) {
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
	}

	public static void diziyiYazdir(int[] dizi) {
		// dizi elemanlari yazdiriliyor
		int satirSayaci = 0;
		for (int sayi : dizi) {
			satirSayaci++;
			System.out.printf("%4d", sayi);
			if (satirSayaci % 10 == 0) {
				System.out.println();
			}
		}
	}
	
	public static void diziyiRassalSayilarlaDoldur(int[] dizi) {
		// diziyi sassal elemanlarla dolduruyoruz
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int)(Math.random() * 100);
		}
	}
	
	public static int dizininToplaminiBul(int[] dizi) {
		// dizinin toplami bulunuyor
		int toplam = 0;
		for (int sayi : dizi) {
			toplam += sayi; 
		}
		return toplam;
	}

}
