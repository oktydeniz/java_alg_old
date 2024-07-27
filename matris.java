package java_temel;

import java.util.Scanner;

/**
 *
 * @author oktay
 */
public class Matris {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Satır Sayısı : ");
        int satir = input.nextInt();
        System.out.println("Sutun Sayısı : ");
        int sutun = input.nextInt();
        
        int matris[][] = new int[satir][sutun];
        for (int i =0;i<satir;i++){
            for (int j=0;j<sutun;j++){
               System.out.print("Sayıyı Giriniz : ");
               int deger =input.nextInt();
               matris[i][j]=deger;
            }
        }
        System.out.print("Oluşan Matris ::::");
        for(int i=0;i<satir;i++){
            System.out.print("\n");
            System.out.print("[");
            for(int j =0;j<sutun;j++){
                System.out.print("  "+matris[i][j]+"  ");
            }
            System.out.print("]");
        }
    }
}
