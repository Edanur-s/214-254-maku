/*
Sayfa 228 ÖRNEK 6.83
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
public class Altin_oran_6_83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in) ;
        double ab ;
        System.out.println("AB uzunluğu için değer girin");
        ab = input.nextDouble();
        double cb = 2*ab/(1+Math.sqrt(5)) ;
        double ac = ab-cb ;
        System.out.println(ac);
        System.out.println(cb);
        System.out.println(ab);
               
    }
    
    
}
