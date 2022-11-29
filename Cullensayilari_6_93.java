/*
SAYFA 237 ÖRNEK 6.93
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Cullensayilari_6_93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int n ;
        System.out.println("Terim sayısı giriniz"); //terim sayısı
        n = input.nextInt();
        System.out.println("Cullen Sayıları:");
        for (double i = 0; i <=n; i++) {  //işlemde kullanmak için alınan herhangi bir sayı,i . Döngü aralığı 1-n
            System.out.println(i*Math.pow(2, i)+1);  //Cullen sayısı kuralı
        }
    }
    
}
