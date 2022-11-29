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
public class Asal_6_86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in) ;
        int n ;
        System.out.println("Üst sınır girin");
        n = input.nextInt();
        int sayi;
            for(int i=2; i<=n; i++){
                sayi=0;
                for(int j=2; j<=i/2; j++){
                    if(i%j==0) sayi++;
                }
                if(sayi==0) System.out.println(+i);
            } 
    
}
}