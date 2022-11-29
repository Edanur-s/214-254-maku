/*
 FİBONACCİ SAYILARI
SAYFA 244 ÖRNEK 6.111
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Fibonacciserisi_6_111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =  new Scanner(System.in);
        int N ; //terim sayısı
        System.out.println("Terim sayısı girin");
        N = input.nextInt();
        System.out.println("Fibonacci Serisi:");
        int T1=1 , T2=1 ;  //işlemler için
        System.out.print(T1+ " " +T2);  //sayılar atanır
        for (int i = 1; i <= N-2; i++) {
            int T3 = T1+T2 ;  //fibonacci t3
            System.out.print(" " +T3);
               T1=T2 ;
               T2=T3 ;
        }
    }
    
}
