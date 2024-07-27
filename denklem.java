package java_uygulama;

/**
 *
 * @author oktay
 */
public class denklem {
    
    public static void denklem(double a,double b,double e,double c,double d,double f){
        double x;
        double y;
        if((a*d)-(b*c)!=0){
           x = ((e*d)-(b*f)) / ((a*d)-(b*c));
           y = ((a*f)-(e*c)) / ((a*d)-(b*c));
           System.out.println("X değeri : "+x+"\nY değeri : "+y);
        }
        else{
            System.out.println("İşlem yapılamaz !");
        }
    }
    public static void main(String[] args){
        denklem(3.4,50.2,44.5,2.1,0.55,5.9);
        
        //Us Alma 
        double ust = Math.pow(2, 8);
        System.out.println("2 ustu 8 = " + ust);
    }
    
    
}
