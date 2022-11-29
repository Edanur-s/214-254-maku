/*
Klavyeden girilen terim sayısı için "üçgensel sayılar"ı veren program
SAYFA 243 ÖRNEK 6.109
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
public class Ucgenselsayi_6_109 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int n, u ;
        System.out.println("Bir tamsayı giriniz");
           n = input.nextInt();
        System.out.println("Üçgensel Sayılar:");
        for (int i = 1; i <=n; i++) {  //döngü açılarak sayılar kontrol edilir, alınan sayı kadar üçgensel sayı bulunacak
           u = ((i*(i+1))/2) ;   // üçgensel sayı olma kuralı sağlanıyor mu kontrol edilir, üçgensel sayılar bulunur
        System.out.println(u);  // üçgensel sayılar yazdırılır
        } 
    }
    
}
