/*
SAYFA 225 ÖRNEK 6.79
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
import java.util.Random  ;
public class Monte_Carlo_6_79 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in) ;
        Random random = new Random() ;
        int n ;
        System.out.println("Pozitif tam sayı giriniz");
        n = input.nextInt();
        int m = 0 ;
        for (int i = 1; i <= n; i++) {
              double x=random.nextDouble();
              double y=random.nextDouble();
        if (Math.pow(x, 2)+Math.pow(y, 2)<1)  {
            m++ ;
        }
        }
        System.out.println((double)4*m/n);
    }
    
}
