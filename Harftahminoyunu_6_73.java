/*
 SAYFA 220 ÖRNEK 6.73
 */

/**
 *
 * @author edaza
 */
import java.util.Random;
import java.util.Scanner;
public class Harftahminoyunu_6_73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        char z ;
        int x = rnd.nextInt(25) + 65;
        for(int i = 1 ; i <=10  ; i++)
            {
                z = input.next().charAt(0);
                if(z == (Character.valueOf((char)x)))
            {
                System.out.println("Harika "+i+". adimda bildiniz");
               System.exit(0);
            }
        }
        System.out.println("Üzgünüm bilemediniz...");
       
    }
    
}
