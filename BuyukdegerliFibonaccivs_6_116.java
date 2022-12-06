/*
 SAYFA 250 ÖRNEK 6.116
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
public class BuyukdegerliFibonaccivs_6_116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner (System.in) ;
       int f2 ;
        System.out.println("sayı girin");
        f2 = input.nextInt();
        double ao = ((1+Math.sqrt(5))/2) ;
        int f1 = (int)(f2/ao) ;
        int f3 = (int)(f2*ao) ;
        System.out.print(f1);
        System.out.print(",");
        System.out.print(f2);
        System.out.print(",");
        System.out.print(f3);
    }
    
}
