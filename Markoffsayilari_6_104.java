/*
 x,y,z 1-50 aralığındadır. Bu aralıktaki Markoff sayılarını listeleyen program
 */

/**
 *
 * @author edaza
 */
public class Markoffsayilari_6_104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1-50 arası Markoff sayıları: ");
        for (int i = 1; i <= 50; i++) { //ilk sayı için
            for (int j = 1; j <= 50; j++) { //ikinci sayı
                for (int k = 1; k <= 50; k++) {  //üçüncü sayı
                    if (i*i+j*j+k*k==3*i*j*k) {  //markoff sayı kuralı
                        System.out.println(i+ "," +j+ "," +k);  //sayı kombinasyonları yazdırılır
                    }
                }
            }
        }
    }
    
}
