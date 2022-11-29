/*
TRİBONACCİ SAYILARI
SAYFA 250 ÖRNEK 6.115
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Tribonacciserisi_6_115 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in) ;
        int n ;
        System.out.println("Terim sayısı girin");
        n = input.nextInt();
        int T1=1 , T2=1 , T3=2 ;
        System.out.print(T1+ " " +T2+ " " +T3);  //tribonacci serisinin kurallarına göre işlemler uygulanır ve alınan terim sayısı kadar tribonacci sayısı listelenir
        for (int i = 1; i <= n-3; i++) {
            int T4=T1+T2+T3 ;
            System.out.print(" " +T4);
            T1=T2 ;
            T2=T3 ;
            T3=T4 ;
        }
    
    }
    
}
