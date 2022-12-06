/*
 SAYFA 250 MRNEK 6.117
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
public class PellSayilari_6_117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in) ;
        int n ;
        System.out.println("Terim sayısı girin");
        n = input.nextInt();
        int p1 = 0 ;
        int p2 = 1 ;
        System.out.print(p1);
        System.out.println("");
        System.out.println(p2);
        for (int i = 1; i <= n-2; i++) {
            int p3 = (int)((2*p2) + p1) ;
            System.out.println(p3);
            p1 = p2 ;
            p2 = p3 ;
        }
    }
    
}
