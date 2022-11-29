/*
 SAYFA 221 ÖRNEK 6.74
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Ornek_6_74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in) ;
        double N, x ;
        double T=1, F=1 ;  //T sonuç, F faktöriyel
        System.out.println("e^x için x değeri giriniz");
        x = input.nextDouble();
        System.out.println("Terim sayısı giriniz");
        N = input.nextDouble();
        for (double i = 1; i <= N-1; i++) { 
            F=F*i ;  //F ile faktöriyel hesaplanır
            T=T+ (Math.pow(x, i)/F) ;  //e^x değeri hesaplanır
        }
        System.out.println(T);
    }
    
}
