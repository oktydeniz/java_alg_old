/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author oktay
 */
public class Gun_Tahmini {
    public static void main(String[] args){
    int gun=0;
    Scanner input =new Scanner(System.in);
    
    String veri_1 ="\n1 3 5 7 \n"+"9 11 13 15 \n"+"17 19 21 23 \n"+"25 27 29 31";
    String veri_2 ="\n2 3 6 7 \n"+"10 11 14 15 \n"+"18 19 22 23 \n"+"26 27 30 31";
    String veri_3 ="\n4 5 6 7 \n"+"12 13 14 15 \n"+"20 21 22 23 \n"+"28 29 30 31";
    String veri_4 ="\n8 9 10 11 \n"+"12 13 14 15 \n"+"24 25 26 27 \n"+"28 29 30 31";
    String veri_5 ="\n16 17 18 19 \n"+"20 21 22 23 \n"+"24 25 26 27 \n"+"28 29 30 31";
    
    System.out.print("Doğduğunuz gün bu setin içinde mi?");
    System.out.print(veri_1);
    System.out.print("\nEvet 1 Hayır 0 :");
    int cevap = input.nextInt();
    
    if(cevap ==1){
        gun+=1;
    }
    
    System.out.print("Doğduğunuz gün bu setin içinde mi?");
    System.out.print(veri_2);
    System.out.print("\nEvet 1 Hayır 0 :");
    cevap = input.nextInt();
    
    if(cevap ==1){
        gun+=2;
    }
    
    System.out.print("Doğduğunuz gün bu setin içinde mi?");
    System.out.print(veri_3);
    System.out.print("\nEvet 1 Hayır 0 :");
    cevap = input.nextInt();
    
    if(cevap ==1){
        gun+=4;
    }
    System.out.print("Doğduğunuz gün bu setin içinde mi?");
    System.out.print(veri_4);
    System.out.print("\nEvet 1 Hayır 0 :");
    cevap = input.nextInt();
    
    if(cevap ==1){
        gun+=8;
    }
    System.out.print("Doğduğunuz gün bu setin içinde mi?");
    System.out.print(veri_5);
    System.out.print("\nEvet 1 Hayır 0 :");
    cevap = input.nextInt();
    
    if(cevap ==1){
        gun+=16;
    }
    
    System.out.println("\nDoğduğunuz Gün : "+gun+"!");
    }
}
