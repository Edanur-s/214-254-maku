/*
NEGAFİBONACCİ SAYILARI 
SAYFA 249 ÖRNEK 6.114
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class NegaFibonacci_6_114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n ;
        System.out.println("Terim sayısı girin");
        n = input.nextInt();
        System.out.println("Negafibonacci Sayıları:");
        System.out.println(" ");
        int f1=1 , f2=1 ;  
        System.out.print(f1+ " " +f2); //önce fibonacci sayısı kuralı uygulanır
        for (int i = 1; i <= n-2; i++) {  //asallık kontrolü yapılır
           int  f3 = f1-f2 ;
             System.out.print(" " +f3);
             f1=f2 ;
             f2=f3 ;
        }  //sayılar listelenir
    }
}
