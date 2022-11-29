/*
SAYFA 234 ÖRNEK 6.91
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
public class Mukemmelsayi_6_91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in) ;
        int n ;
        System.out.println("Bir tamsayı giriniz");
        n = input.nextInt();
        int toplam = 0 ;
        for (int i = 1; i < n-1; i++) { //tam bölenlerini aramak için döngü
           if (n%i==0) {  //tam bölenler bulunur
               toplam = toplam+i ;  // tam bölenler toplanır
           }
        }
           if (n==toplam) {  //mükemmel sayı olma kuralı
               System.out.println("Mükemmel sayı");
           }
           else {
               System.out.println("Mükemmel sayı değil");
           }
        }
    }
    

