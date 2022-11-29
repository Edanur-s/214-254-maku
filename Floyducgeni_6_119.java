/*
 Floyd üçgeni
SAYFA 252 ÖRNEK 6.119
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Floyducgeni_6_119 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir satır değeri alınız");
        int a = input.nextInt();
        int s = 1 ;  //sayılar başlanır
        for (int i = 1; i <=a; i++) {  //satır sayısı kadar döngü
            for (int j = 1; j <=i ; j++) {  //satırdaki eleman sayısı
                 System.out.print(s);  //sayılar yazdırılır
                     s++  ;  //sayılar birer birer arttırılır
                 System.out.print(" ");   //satır arası boşluk bırakılır
            }
            System.out.println(" "); //sütun arası boşluk bırakılır
          
          System.out.println();  //sonraki satıra geçilir
        }
        
    }
    
}
