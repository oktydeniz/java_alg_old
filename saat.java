package java_temel;
public class Saat {
    public static void main(String[] args) {
		
		long toplamMilisaniye = System.currentTimeMillis();
		
		System.out.println("toplamMilisaniye = " + toplamMilisaniye);
		
		long toplamSaniye = toplamMilisaniye / 1000;
		
		System.out.println("toplamSaniye = " + toplamSaniye);
		
		long suankiSaniye = toplamSaniye % 60;
		
		System.out.println("suankiSaniye = " + suankiSaniye);
		
		long toplamDakika = toplamSaniye / 60;
		
		System.out.println("toplanDakika = " + toplamDakika);
		
		long suankiDakika = toplamDakika % 60;
		
		System.out.println("simdikiDakika = " + suankiDakika);
		
		long toplamSaat = toplamDakika / 60;
		
		System.out.println("toplamSaat = " + toplamSaat);
		
		long suankiSaat = toplamSaat % 24;
		
		System.out.println("suankiSaat = " + suankiSaat);
		
		System.out.println(suankiSaat + ":" + suankiDakika + ":" + suankiSaniye + " GMT");
		
	}
}
