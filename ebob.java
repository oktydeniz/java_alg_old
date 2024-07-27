/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_uygulama;

import java.util.Scanner;

/**
 *
 * @author oktay
 */
public class Ebob {
    public static void main(String[] args){
    Scanner input =new Scanner(System.in);
    int obeb=1;
    int bolen=2;
    
    System.out.println("İlk Sayıyı Giriniz: ");
    int sayi1 =input.nextInt();
    System.out.println("İlk Sayıyı Giriniz: ");
    int sayi2 = input.nextInt();
    while(bolen<=sayi1 && bolen<=sayi2){
        if(sayi1%bolen==0 && sayi2%bolen==0){
            obeb =bolen;
        }
        bolen++;
    }
    System.out.println(sayi1 +" ve " +sayi2 +" sayılarının obebi "+ obeb);
    
    
    
    
    
    
    
    
    }
    
}
