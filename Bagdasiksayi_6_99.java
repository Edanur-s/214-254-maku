/*
 BAĞDAŞIK SAYILAR
SAYFA 239 ÖRNEK 6.99
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Bagdasiksayi_6_99 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int x, y ;
        System.out.println("İlk sayıyı girin");
        x = input.nextInt();
        System.out.println("İkinci sayıyı girin");
        y = input.nextInt();
        int a = x%10 ;  //x sayısının birler basamağı
        int b = y%10 ;  //y sayısının birler basamağı
        int c = x/10 ;  //x sayısının onlar basamağı
        int d = y/10 ;  //y sayısının onlar basamağı
        if (a+b==10 && c==d) {  //bağdaşık sayı olma kuralı
            System.out.println(x+ " ve " +y+ " Bağdaşık sayılardır.");
        }
        else {
            System.out.println(x+ " ve " +y+ "Bağdaşık sayılar değildir.");
        }
            
    }
    
}
