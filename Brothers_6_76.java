/*
SAAYFA 224 ÖRNEK 6.76 
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Brothers_6_76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
       int n ;
       double T = 2 ;  //formülde k en küçük 0 olduğundan k=0 yerleştirdiğimizde sonuç 2 gelir. Bu yüzden t=2'den başlatılır
        System.out.println("Terim sayısı girin");
        n = input.nextInt();
        for (int i =1 ; i <= n; i++) {  
          double payda = 2*i+1 ;
          double f = 1 ; //f ile paydadaki faktöriyel hesaplanır
            for (int j = 1; j <= payda; j++) {
                f = f*j ;
            }
          T += (double)(payda+1)/f ;  //brothers formülü kullanılarak e değeri hesaplanacağından burada sonuç yani t  e değerini verir
          
        }
        System.out.println(T);
    }
    
}
