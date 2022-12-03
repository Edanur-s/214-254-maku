/*
 SAYFA 229 ÖRNEK 6.85
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
public class Gumus_oran_6_85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in) ;
        int u ;
        System.out.println("Doğru parçası için uzunluk girin");
        u = input.nextInt();
        double b = (u/(2+Math.sqrt(2))) ;
        double a = u-b ;
        System.out.print("a=" +a);
        System.out.print(" , ");
        System.out.print("b= " +b);
    }
    
}
