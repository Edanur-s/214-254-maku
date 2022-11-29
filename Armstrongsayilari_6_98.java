/*
ARMSTRONG SAYILAR 100-999
SAYFA 239 ÖRNEK 6.98
 */

/**
 *
 * @author edaza
 */
public class Armstrongsayilari_6_98 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Armstrong Sayılar 100-999");
        for (int i = 1; i <= 9; i++) { //Yüzler basamağı
            for (int j = 0; j <= 9; j++) { //Onlar basamağı
                for (int k = 0; k <= 9; k++) {  //Birler basamağı
                   int sayi = 100*i+10*j+k ;  //sayı oluşturulur
                       if (sayi==Math.pow(i, 3)+Math.pow(j, 3)+Math.pow(k, 3)) {  //Armstrong sayı kuralı
                           System.out.println(sayi);  //sayılar listelenir
                        }
                }
            }   
        }
    
}
}
/*100-999 aralığındaki sayılar kontrol edileceği için 
for döngülerinde basamakların birer birer artarak her sayı değerinin kontrol edilmesi sağlanır */