/*
SAYFA 247 ÖRNEK 6.112
 */

/**
 *
 * @author edaza
 */
public class Fibonacciikibastoplam_6_112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Basamakları toplamı Fibonacci sayısı olan 0-99 arası sayılar:");
        System.out.println(" ");
        for (int i = 0; i <= 9; i++) {  //i iki basamaklılar için onlar basamağı
            for (int j = 0; j <= 9; j++) {  //j birler basamağı
                int s = i + j ;  //basamaklar toplamı
                if (s==1 || s==2 || s==3 || s==5 || s==8 || s==13)  {  //iki basamaklı en büyük sayı 99. Basamakları toplamı 9+9 = 18 olduğu için 13'ten sonraki fibonacci sayılarını sağlayabilecek bir toplam elde edemeyiz. bakılacak sayılar 1, 2, 3, 5, 8, 13
                    System.out.println(10*i+j);
                }
            }
        }
    }
    
}
