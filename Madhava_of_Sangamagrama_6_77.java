/*
 SAYFA 225 ÖRNEK 6.77
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
public class Madhava_of_Sangamagrama_6_77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in) ;
        int n ;
        System.out.println("Terim sayısı girin");
        n = input.nextInt();
        double toplam = 0 ;  //formülleştirilen açılım döngüde toplanarak son sonuca ulaşılır
        for (int i = 0; i <= n-1; i++) {  
            toplam += (Math.pow((-1), i))/((double)(2*i+1)*Math.pow(3, i)) ;  //seri açılımın formülleştirilmiş çözümü
        }
        System.out.println("Sonuç:"  +Math.sqrt(12)*toplam);  //buradan sonuç pi değeri bulunur
    }
    
}
