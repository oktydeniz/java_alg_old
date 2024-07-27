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
public class Saatinput {
    public static void main(String[] args) {
		System.out.println("Saniye cinsinden bir tam sayi giriniz: ");
		
		Scanner klavye = new Scanner(System.in);
		
		int saniye = klavye.nextInt();
		
		int dakika = saniye / 60;
		
		int kalanSaniye = saniye % 60;
		
		System.out.println(saniye + " saniye " + dakika + " dakika ve " + kalanSaniye + " saniyedir");
	}
}
