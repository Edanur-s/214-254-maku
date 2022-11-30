/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
public class Brothersdogru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in) ;
        int n ;
        System.out.println("n");
        n = input.nextInt();
        double toplam = 0 ;
        for (int k = 0; k <= n; k++) {
            int temp = 2*k+1 ;
            int f = 1 ;
            for (int i = 1; i <= temp; i++) {
                f *= i ;
            }
            toplam += (double)(temp+1)/f ;
        }
        System.out.println(toplam);
        
    }
    
}
