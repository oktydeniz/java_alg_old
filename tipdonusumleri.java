/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_temel;

import java.util.Scanner;

/**
 *
 * @author oktay
 */
public class tip_Donusumleri {
    public static void main(String[] args) {
        int toplam =0;
        while(true){
           System.out.println("sayı giriniz:");
           Scanner scan = new Scanner(System.in);
           String sayi = scan.nextLine();
            if (sayi.equals("q")){
                break;
            }
            else{
                //karakter dönüşümleri
                int deger =Integer.valueOf(sayi);
                toplam +=deger;
                System.out.println("Toplam "+ toplam);
            }
        }
    }
    
}
 /*
25: int tipini string tipine dönüştürmek
26: int sayi = 5;
27: String sayi1 = String.valueOf(sayi);
28: String sayi2 = Integer.toString(sayi);
29: String sayi3 = sayi + " ";
30: String tipini int tipine dönüştürmek
31: // 2 değişik tip ile dönüştürülebilir.
32: String ifade = "10";
33: // 1. tip
34: int ifade1 = Integer.valueOf(ifade);
35: // 2.tip
36: int ifade2 = Integer.parseInt(ifade);
37:
38:
39:
40: */