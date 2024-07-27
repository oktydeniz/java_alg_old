package java_temel;

import java.util.Random;


/**
 *
 * @author oktay
 */
public class RandomMatris {
    public static void main(String[] args) {
        int matris[][] =new int[5][5];
        Random rnd =new Random(50);
        for (int[] matri : matris) {
            for (int j = 0; j<matris.length; j++) {
                int sayi = rnd.nextInt();
                if(sayi<0){
                    sayi*=-1;   
                }
                matri[j] = sayi;
            }
        }
        for (int[] matri : matris) {
            System.out.print("\n");
            System.out.print("[");
            for (int j = 0; j<matris.length; j++) {
                System.out.print(" " + matri[j] + " ");
            }
            System.out.print("]");
        }
        

   }
}
