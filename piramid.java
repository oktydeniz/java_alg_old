package java_uygulama;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oktay
 */
public class Pramid {
    public static void main(String[] args){
        
        Scanner input =new Scanner(System.in);
        System.out.println("Sayı Ver : ");
        int satir = input.nextInt();
        for(int i=0;i<satir;i++){
            for(int j=satir-1 -i;j>0;j--){
                System.out.print("   ");            
            }
            for(int j=i+1;j>0;j--){
                System.out.printf("%3d",j); 
            }
            for(int j=2;j<i+2;j++){
                System.out.printf("%3d",j);
            }
            System.out.println();
        }
    }
}
