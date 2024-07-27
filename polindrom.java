package java_uygulama;
import java.util.Scanner;
/**
 *
 * @author oktay
 */
public class Palindrom {
    public static void main(String[] args){
    Scanner input =new Scanner(System.in);
    boolean polindron =true;
    System.out.println("Cümleyi Giriniz : ");
    String cumle =input.nextLine();
    for (int i=0,j=cumle.length()-1;i<j;i++,j--){
        char ch1=cumle.charAt(i);
        char ch2=cumle.charAt(j);
            if(ch1!=ch2){
                polindron =false;
                break;
            }
    }
    if(polindron){
        System.out.println("Polindromdur.");
    }
    else{
        System.out.println("Polindrom Değildir.");
    }
    }
}
