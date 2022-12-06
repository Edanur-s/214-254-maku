/*
 SAYFA 253 ÖRNEK 6.120
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
public class Pisagor_uclemesi_6_120 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        int n  ;
        System.out.println("Pozitif tam sayı değeri girin");
        n = input.nextInt();
        for (int i = 1; i <= n-1; i++) {
            for (int j = i+1; j <= n-i; j++) {
                int c = (n - (i+j)) ;
                if (Math.pow(i, 2)+Math.pow(j, 2)==Math.pow(c, 2)) ;
                System.out.println(i);
                System.out.println("");
                System.out.println(j);
                System.out.println("");
                System.out.println(c);
                System.out.println("");
                System.out.println(i*j*c);
            }
        }
    }
    
}
