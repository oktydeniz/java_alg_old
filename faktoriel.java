package javauygulamaları;

import java.util.Scanner;

/**
 *
 * @author oktay
 */
public class JavaUygulamaları {
    public static void fakto( int number){
int faktoriel =1;
if(number ==1 || number ==0){
System.out.println("Faktoriel : " + faktoriel);
}
else if(number<0 ){
System.out.println("The number can not be negative !");
}
else if(number ==0){
System.out.println("Faktoriel Epuals '0' !");}
else{
while(number>0){
faktoriel *= number;
number--;
}
System.out.println("Faktoriel Equals : "+faktoriel);
}
}
    public static void main(String[] args) {
        System.out.println("Number : ");
Scanner input = new Scanner(System.in);
int x = input.nextInt();
fakto(x);

    }}
    

