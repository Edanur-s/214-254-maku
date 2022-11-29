/*
SAYFA 218 ÖRNEK 6.72
 */

/**
 *
 * @author edaza
 */
import java.util.Random;
import java.util.Scanner;
public class Sayitahminoyunu_6_72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scan = new Scanner(System.in);
        Random rastgele = new Random();
        int rastgele_sayi = 1 + rastgele.nextInt(98);  //1-99 arası rastgele bir sayı tutulur
        //System.out.println("Rastgele atanan sayi = " +rastgele_sayi);
        System.out.println("Sayı 1-99 arasındadır");  
        int number,s = 0;  //klavyeden girilen sayı ve deneme sayısı tanımlanır
        
        do {
            System.out.print("Bir tamsayı girin: ");
            number = scan.nextInt();
            if(number > rastgele_sayi) {
                System.out.println("Daha düşük bir tahmin");  //girilen sayı, tutualn sayıdan yüksek ise daha düşük bir tahmin yapılması istenir
            }
            else if(number < rastgele_sayi) {
                System.out.println("Daha yüksek bir tahmin");  //girilen sayı, tutulan sayıdan küçük ise daha yüksek bir tahmin yapılması istenir
            }
            s++;  //tutulan sayı bulunana kadar deneme sayısı arttırılır
            System.out.println(" ");  //tahmin satırları arası boşluk bırakır
        }
        while(number != rastgele_sayi);
        
        System.out.println("TEBRİKLER!! " +s+ ". denemenizde sayıyı buldunuz." ); 
         
        
    }
    
}
