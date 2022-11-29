/*
 ORE SAYISI 
SAYFA 241 ÖRNEK 6.103
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
public class Oresayisi_6_103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =  new Scanner(System.in);
        int n ;
        double s = 0 , t = 0 ;  //tam bölenlerinin sayısını bulmak için s, paydadaki işlem için t
        System.out.println("Bir tam sayı girin");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n%i==0)  {  //bu döngüde tam bölenler bulunur
                s++ ; //tam bölenler sayılır
                t = t + (double)1/i ;  //payda kısmı işlemler birbiri üzerine eklenerek devam eder böylece t ile son sonuç yani paydadaki toplam bulunur
            }
        }
         double ho = s/t ;  //harmonik ortalama için yapılması gereken işlem 
               if (ho - (int)ho == 0 ) {  //harmonik ortalamanın tam sayı olup olmadığı kontrol edilir
                    System.out.println( n+ " Ore sayısıdır");
                }
                  else {
                       System.out.println(n+ " Ore sayısı değil");
                  }
    
    }
       
    }
    

