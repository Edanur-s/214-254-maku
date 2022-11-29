/*
 Binom açılımı kullanılarak e^x değeri hesaplama
SAYFA 223 ÖRNEK 6.75
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Ornek6_75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in) ;
        double n, x, sonuc ;
        System.out.println("X değeri giriniz:"); //üs değeri alınır
        x = input.nextDouble();
        System.out.println("N değeri giriniz:"); //işlemi devam ettireceğimiz, limitte belirtilen sayı değeri alınır
        n = input.nextDouble();
        System.out.println("Binom açılımı kullanılarak e^x değeri hesaplanacaktır. Bunun için e^x=Lim (n->∞) [1+x/n]^n formülü kullanılır.");
        sonuc = Math.pow((1+x/n), n) ;  // e^x'i hesaplamak için formül uygulanır
        System.out.println("Sonuç -> e^x = " +sonuc);  // bulunan sonuç yani e^x değeri yazdırılır
   
}
}