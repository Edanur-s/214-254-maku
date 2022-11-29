/*
 Klavyeden girilen bir tamsayının eksik sayı olup olmadığını, eksik sayı ise eksiklik miktarını ekrana yazdıran program
SAYFA 239 ÖRNEK 6.100
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Eksiksayi_6_100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int x ;
        int t = 0 ;
        System.out.println("Kontrol edilecek sayıyı giriniz");
        x = input.nextInt();
        for (int i = 1; i <=x; i++) 
        {
            if (x%i==0) 
        {
                t = t+i ;
        } 
        }
         if (t<2*x)  
        {
             System.out.println( x + " eksik sayıdır ve eksiklik miktarı " +(2*x-t)+ "'dir.");
        }
         else 
        {
             System.out.println( x+ " Eksik sayı değildir");
        }
        }
    }
    

