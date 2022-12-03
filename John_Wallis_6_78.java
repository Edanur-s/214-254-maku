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
public class John_Wallis_6_78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in) ;
        int n ;
        System.out.println("Terim sayısı girin");
        n = input.nextInt();
        double c = 1 ;
        for (int i = 1; i <= n; i++) {
          double  c1 = 4*i*i ;
            c = (c*(c1/(c1-1))) ;
        }
        System.out.println(2*c);
    }
    
}
