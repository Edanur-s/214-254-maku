/*
Klavyeden girilen 1'den büyük tamsauyının asal çarpanlarını bulan program
SAYFA 232 ÖRNEK 6.88
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
public class Asalcarpanbulma_6_88 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner (System.in) ;
        int a ;
        int b = 2 ; //en kücük asal sayi ve klavyeden girilecek sayıyı tanımladık
        System.out.println("Bir x sayısı giriniz");
          a = input.nextInt();  //Klavyeden aldığımız sayıyı atadık
        System.out.println("Girdiğiniz sayı " +a);
        System.out.println("Sayının asal bölenleri");
          while (a>1)  // Soruda istenen tamsayının 1'den büyük olma koşulunu sağladık
          if  (a%b==0)  //Alınan sayı ile b sayısına mod işlemi uyguladığımızda sonuç sıfır ise asal çarpanlar bulunur
        {
        System.out.println(b); //Asal çarpanlar ekrana yazdırılır
          a=a/b ; //a sayısını b'ye bölerek işlemin devamı sağlanır
        }   
        else 
        {
          b = b+1 ;  // b sayısı ile mod 0 sonucunu vermiyorsa b artırılarak döngüye devam edilir
        }
    }
    
}
