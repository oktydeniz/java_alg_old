package bolum07;

import java.util.Scanner;

public class OrtalamaninUstundekileriGoster {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Ortalama alinmasi için kac sayinin girmek istiyorsunuz?");
		
		int donguSayisi = klavye.nextInt();
		
		double toplam = 0;
		double[] dizi = new double[donguSayisi];
		
		for (int i = 0; i < donguSayisi; i++) {
			System.out.println("Lutfen bir sayi girirniz:");
			dizi[i] = klavye.nextDouble(); 
			toplam += dizi[i];
		}
		
		double ortalama = (toplam / donguSayisi);
		System.out.println("Ortalama: " + ortalama);
		
		int ortalamadanBuyuklerSayaci = 0;
		for (int i = 0; i < donguSayisi; i++) {
			if (dizi[i] > ortalama) {
				ortalamadanBuyuklerSayaci++;
			}
		}
		
		System.out.println(ortalamadanBuyuklerSayaci + " tane sayi ortalamadan büyüktür");
	}

}
