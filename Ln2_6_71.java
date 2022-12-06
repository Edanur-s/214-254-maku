/*
  SAYFA 218 ÖRNEK 6.71
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
public class Ln2_6_71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in) ;
      int n ;
        System.out.println("Terim sayısı");
        n = input.nextInt();
        double t = 0 ;
        for (int i = 0; i < n ; i++) 
        {
             t+=1/(double)((2*i+1)*(2*i+2));
        }
        System.out.println(t);
    }
    
}
