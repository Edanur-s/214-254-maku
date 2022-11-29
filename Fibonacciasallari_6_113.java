/*
 SAYFA 249 ÖRNEK 6.113
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Fibonacciasallari_6_113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n ;
        System.out.println("Terim  sayısı girin");
        n = input.nextInt();
        int f1=1 , f2=1 , s2=0 ;
        int f3=f1+f2 ;
        f1=f2 ;
        f2=f3 ;
        int s1=0 ;
        for (int i = 2; i < f3-1; i++) {
            if (f3%i==0)  {
                s1++ ;
            }
        }
        if (s1==0)  {
            s2++ ;
            System.out.println(f3);
        }
        while (s2<n)  {
         return ;
        }
    }
    
}
