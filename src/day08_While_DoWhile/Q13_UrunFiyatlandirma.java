package day08_While_DoWhile;

import java.util.Scanner;

public class Q13_UrunFiyatlandirma {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Ürün adedinizi giriniz : ");
        int urunAdedi=scan.nextInt();
        System.out.println("Ürünün fiyatını giriniz : ");
        double fiyat=scan.nextDouble();
        System.out.println("Müşteri kartınız var mıdır? ");
        boolean varMi=scan.nextBoolean();

        double toplamFiyat=0;

       while (varMi){   // Müşteri kartı olanlar için
           if(urunAdedi>=10){
               toplamFiyat=fiyat*0.80 * urunAdedi;
               System.out.println("Ürünün toplam indirimli fiyatı : "+ toplamFiyat);
               break;
           }else {
               toplamFiyat=fiyat*0.85 * urunAdedi;
               System.out.println("Ürünün toplam indirimli fiyatı : "+ toplamFiyat);
               break;
           }

       }

       while(!varMi){   // müşteri kartı olmayanlar için
           if(urunAdedi>=10){
               toplamFiyat=fiyat*0.85 * urunAdedi;
               System.out.println("Ürünün toplam indirimli fiyatı : "+ toplamFiyat);
               break;
           }else {
               toplamFiyat=fiyat*0.90* urunAdedi;
               System.out.println("Ürünün toplam indirimli fiyatı : "+ toplamFiyat);
               break;
           }
       }


    }
}
