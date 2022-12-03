/*
 SAYFA 228 ÖRNEK 6.84
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
public class Altin_ucgen_6_84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in) ;
        double n ;
        System.out.println("Üçgen için kısa kenar değeri girin");
        n = input.nextDouble();
        double b = (n*(1+Math.sqrt(5))/2) ;
        System.out.print(n);
        System.out.print(" , ");
        System.out.print(b);
        System.out.print(" , ");
        System.out.print(b);
    }
    
}
