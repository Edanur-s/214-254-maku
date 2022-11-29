/*
 SAYFA 227 ÖRNEK 6.82
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Kok5bulma__82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner (System.in) ;
        double n, i ;
        double t = 1 ;
        System.out.println("Bölüm sayısını giriniz");
          n = input.nextDouble();
          System.out.println("(5^(1/2)) değeri : ");
        for ( i = 1; i <=n; i++) {  // sonsuz kesirin devam etmesi için döngü kullandık
            t = (4+(1/t)) ; //kural
        }
        System.out.println((2+(1/t)));  //bulunan yaklaşık değer
    }
    
}
