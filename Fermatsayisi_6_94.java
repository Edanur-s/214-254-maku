/*
2^2^n+1 şeklinde yazılabilen pozitif tamsayılara "Fermat Sayıları" denir.
Klavyeden girilen terim sayısı kadar Fermat sayılarını listeleyen program.
SAYFA 237 ÖRNEK 6.94
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Fermatsayisi_6_94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner (System.in) ;
      int x, i ;
        System.out.println("x");
         x = input.nextInt();
         System.out.println("Sarxyılar:");
        for (i = 1; i < x-1; i++) {
        System.out.println(Math.pow(2, Math.pow(2, i)) + 1 );
            
    }
    }
    
}
