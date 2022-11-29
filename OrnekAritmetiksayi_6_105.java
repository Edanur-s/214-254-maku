/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class OrnekAritmetiksayi_6_105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n ;
        System.out.println("Bir tamsayı girin");
        n = input.nextInt();
         double t = 0 , s = 0 ;
        for (double i = 1; i <= n; i++) {
            if (n%i==0) {
                t = (double)t+i ;
                s++ ;
            }
          
        }
        if (t/s==(int)t/s)  {
            System.out.println("Aritmetik sayı");
        }
        else  {
            System.out.println("Aritmetik sayı değil");
        }
    }
    
}
