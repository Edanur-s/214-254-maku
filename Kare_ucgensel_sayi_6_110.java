/*
 SAYFA 244 ÖRNEK 6.110
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Kare_ucgensel_sayi_6_110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in) ;
        int n ;
        System.out.println("Terim sayısı girin");
        n = input.nextInt();
        double k0=0 , k1=1 ;
        System.out.println(k1);
        for (int i = 1; i <= n-1; i++) {
            double k2 = (34*k1-k0+2) ;
            System.out.println(k2);
            k0=k1 ;
            k1=k2 ;
        }
    }
    
}
