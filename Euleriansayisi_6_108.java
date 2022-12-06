/*
 SAYFA 243 ÖRNEK 6.108
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Euleriansayisi_6_108 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =  new Scanner (System.in) ;
        double m, n  ;
        int i ;
        System.out.println("n değeri");
        n = input.nextInt();
        System.out.println("m değeri");
        m = input.nextInt();
        double t = Math.pow(n+1, m);
        for ( i = 1; i <= n; i++) {
            int f1 = 1 ;
            int f2 = 1 ;
            int f3 = 1 ;
            for (int j = 1; j < m+1; j++) {
                f1 = f1*j ;
            }
            for (int j = 1; j <= i; j++) {
                f2 = f2*j ;
            }
            for (int j = 1; j <= m+1-i; j++) {
                f3 = f3*j ;
            }
            double c = f1/(f2*f3) ;
            t += Math.pow(-1, i)*c* Math.pow((n+1-i), m) ;
        }
        System.out.println(t);
    }
    
}
