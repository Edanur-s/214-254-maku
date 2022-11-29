/*
DOST SAYILAR
SAYFA 238 ÖRNEK 6.97
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Dostsayi_6_97 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int m , n ;  //karşılaştırılacak ve klavyeden alınacak olan sayılar
        int toplam1 = 0 ;  //tam bölenlerin toplamını bulmak için değişken
        int toplam2 = 0 ;
        System.out.println("İlk sayıyı girin");
        m = input.nextInt();
        System.out.println("İkinci sayıyı girin");
        n = input.nextInt();
        for (int i = 1; i < m; i++) {  //birinci sayı için tam bölenleri bulunur
            if (m%i==0)  {
                toplam1 = toplam1+i ;  //birinci sayının tam bölenleri toplanır
            }
        }
        for (int i = 1; i < n; i++) {  // ikinci sayı için tam bölenleri bbulunur
            if (n%i==0) {
                toplam2 = toplam2+i ;  //ikinci sayının tam bölenleri toplanır
            }
        }
        if (toplam1==n && toplam2==m) {  //dost sayı kuralı kontrol edilir
            System.out.println(m+ " ve " +n+ " Dost sayılardır.");  //sağlıyorsa dost sayıdır 
        }
        else {
            System.out.println(m+ " ve " +n+ " Dost sayı değildir.");  // sağlamıyorsa değildir
        }
    }
    
}
