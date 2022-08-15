package day07_ForLoop;

import java.util.Scanner;

public class Q01_TamBolunenSayilarınToplami {
    /*

       sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.
       DEĞİLSE While kullanılır, Eğer döngüye bir kez mutlaka girilecekse DO_WHILE kullanılır.

       TASK :
        100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).

         Ekran Çıktısı
        91
        78
        65
        52
        39
        26
        13       */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("0'dan 100'e kadar bir tamsayi Giriniz: ");
        int sayi=scan.nextInt();
        int toplam=0;

        if(sayi<0 || sayi>100){
            System.out.println("İstenen aralıkta bir sayi giriniz : ");
        }else {
            for (int i = 0; i <sayi ; i++) {
                if(i%13==0){
                    System.out.println(i+" ");
                 toplam+=i;
                }

            }
            System.out.println("Sayiların toplami: "+ toplam);
        }

        
    }
}
