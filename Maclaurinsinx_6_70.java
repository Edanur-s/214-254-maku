/*
 SAYFA 217 ÖRNEK 6.70
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Maclaurinsinx_6_70 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n, is ;
        double aci, x, f, t=0 ;
        System.out.println("Açı değeri giriniz"); //klavyeden açı alınır
        aci = input.nextDouble();
        System.out.println("Terim sayısı giriniz");  //klavyeden terim sayısı alınır
        n = input.nextInt();
        x = Math.toRadians(aci) ;  //trigonometrik seri açılımlarında derece değil açı kullanılır bu yüzden klavyeden derece olarak girilen açı değeri radyana çevrilir
        is=1 ; 
        for (int i = 1; i <= n; i++) {
            f = 1 ;
            for (int j = 1; j <= 2*i-1; j++) {
                f = f*j ;
                is = is*(-1)-1 ;
                t = t+is*Math.pow(x, 2*i-1)/f ;
            }
        }    //maclaurin cosx açılıma göre işlemler yapılır ve sonuç bulunur
        System.out.println("Seri açılımı ile hesaplanan değer = " +t);
    }
    
}
