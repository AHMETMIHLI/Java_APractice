package day07_ForLoop;

import java.util.Scanner;

public class Q14_Yıldızlar {

    /*  TASK :
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
   1-     Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

     /*
           2-       *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */

    public static void main(String[] args) {
        // 1.soru  cevabı

        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir sayi giriniz : ");
        int sayi = scan.nextInt();

        for (int satir = 1; satir <= sayi; satir++) {  // satır kontrolü yapıldı
            for (int bosluk = sayi - satir; bosluk >= 0; bosluk--) {   // boşlukların kontrolü yapıldı
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= satir; yildiz++) { // yıldızlar kontrol edildi
                System.out.print("*");

            }
            System.out.println();

            // 2 soru cevabı :

        }

        System.out.println();

        for (int satir = 1; satir <= sayi; satir++) {  // satır kontrolü yapıldı
            for (int yildiz = 1; yildiz <= satir; yildiz++) {
                System.out.print("*");

            }
            System.out.println();


        }
    }
}