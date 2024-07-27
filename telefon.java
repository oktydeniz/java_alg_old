package javaapplication1;

import java.util.Scanner;

public class Telefon {
    private  int batarya ;
    private String durum ;
    private int ses ;
    private int parlaklık ;
    public Telefon(int batarya,String durum ,int ses,int parlaklık){
    this.batarya=batarya;
    this.durum=durum;
    this.parlaklık=parlaklık;
    this.ses=ses;
    
    }

    

    public Telefon(){
    this(0,"Bilgi Yok",0,0);
    }
    
    
    public int getBatarya() {
        return this.batarya;
    }
    public void setBatarya(int batarya) {
        this.batarya = batarya;
    }
    public String getDurum() {
        return this.durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public int getSes() {
        return this.ses;
    }

    public void setSes(int ses) {
        this.ses = ses;
    }

    public int getParlaklık() {
        return this.parlaklık;
    }

    public void setParlaklık(int parlaklık) {
        this.parlaklık = parlaklık;
    }
     public void showinfos(){
        System.out.println("batarya : "+ this.batarya);
        System.out.println("durum : "+ this.durum );
        System.out.println("ses : "+ this.ses );   
    }
     public void sesayarları(){
        while(true){
            System.out.println("Yükseltmek İçin 1 Azaltmak İçin 2 Çıkmak için 3 :");
            Scanner input = new Scanner(System.in);
            int deger =input.nextInt();
            if(deger==1){
                if(this.ses<101){
                this.ses = this.ses +2;
                System.out.println("Ses Seviyesi :" + this.ses);
                }
            }
            else if(deger ==2){
                if(this.ses>0){
                this.ses = this.ses -2;
                System.out.println("Ses Seviyesi :" + this.ses);
                }
            }
            else if(deger==3){
            break;}
             
         }
     }
     public void ekran(){
         while(true){
            System.out.println("Yükseltmek İçin 1 Azaltmak İçin 2 Çıkmak için 3 :");
            Scanner input = new Scanner(System.in);
            int deger =input.nextInt();
            if(deger==1){
                if(this.parlaklık<101){
                this.parlaklık = this.parlaklık +2;
                System.out.println("Parlaklık Seviyesi :" + this.parlaklık);
                }
            }
            else if(deger ==2){
                if(this.parlaklık>24){
                this.parlaklık = this.parlaklık -2;
                System.out.println("Parlaklık Seviyesi :" + this.parlaklık);
                }
            }
            else if(deger==3){
            break;}
     }
     
     }
     public void kapama(){
     System.out.println("Kapanıyor...");
     this.durum = "Kapalı";
     System.out.println("Durum : " + this.durum);
     }
     public void acma(){
     System.out.println("Açılıyor...");
     this.durum = "Açık";
     System.out.println("Durum : " + this.durum);
     }
}
