/*
 Klavyeden girilen pozitif tamsayının Hilbert sayısı olup olmadığını kontrol eden program
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Hilbertsayisi_6_96 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner ( System.in) ;
        int n ;
        System.out.println("Bir tamsayı giriniz");
        n = input.nextInt();
        if ((n-1)%4==0) {  //Hilbert sayısı olma kuralı-> n=4*k+1 şeklindedir. Bu denklemde k yalnız bırakılır ve bu yoldan ilerlenir
            System.out.println("Hilbert sayısıdır.");
        }
        else {
            System.out.println("Hilbert sayısı değildir.");
        }
        }
    }
    

