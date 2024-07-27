package bolum07;

public class IskambilKagitlari {

	public static void main(String[] args) {
		String[] tipDizisi = { "Karo", "Maca", "Sinek", "Kupa" };
		String[] sayiDizisi = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Vale", "Kiz", "Papaz" };
		
		int[] iskambilDestesi = new int[52];
		
		for (int i = 0; i < iskambilDestesi.length; i++) {
			iskambilDestesi[i] = i;
		}
		
		for (int i = 0; i < iskambilDestesi.length; i++) {
			int rassalIndex = (int)(Math.random() * 52);
			
			int gecici = iskambilDestesi[i];
			iskambilDestesi[i] = iskambilDestesi[rassalIndex];
			iskambilDestesi[rassalIndex] = gecici;
		}
		
		for (int i = 0; i < 4; i++) {
			String tip = tipDizisi[iskambilDestesi[i] / 13];
			String sayi = sayiDizisi[iskambilDestesi[i] % 13];
			System.out.println(tip + " " + sayi);
		}
	}

}
