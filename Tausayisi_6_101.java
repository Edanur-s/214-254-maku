/*
 Tam bölenlerinin sayısına tam bölünebilen sayılar tau sayısıdır
SAYFA 240 ÖRNEK 6.101
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
public class Tausayisi_6_101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =  new Scanner (System.in);
        int n ;
        System.out.println("Bir üst sınır giriniz");
        n = input.nextInt();
        System.out.println(" ");
        System.out.println("Tau sayıları:");
        for (int i = 1; i <= n; i++) { //klavyeden alınan sayının tam bölenleri bulunur
               int s = 0 ;  //s ile tam bölenlerinin kaç tane olduğu birer artarak sayılır
            for (int j = 1; j <= i; j++) {   
               if (i%j==0) {
                   s++ ;
                }
            }  
                    if (i%s==0) {  //sayılar listelenir
                     System.out.println(i);
                    }
            }
        }
        
    }


