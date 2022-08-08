package day03_IfStatements;

import java.util.Scanner;

public class C08_IndirimliUrun {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac adet urun alacaksınız");
        int adet = scan.nextInt();
        System.out.println("Urunun liste fiyatını giriniz ");
        double fiyat = scan.nextDouble();
        System.out.println("Musteri kartınız var mı?\nVarsa Evet yoksa Hayır giriniz.");
        String kart = scan.next();
        double toplamFiyat = 0;

        if (kart.equalsIgnoreCase("evet")) {
            if (adet > 10) {
                toplamFiyat = fiyat * 0.80;
                System.out.println("Toplam odemeniz gereken tutar : " + toplamFiyat);
            } else {
                toplamFiyat = fiyat * 0.85;
                System.out.println("\"Toplam odemeniz gereken tutar : " + toplamFiyat);
            }
        } else if (kart.equalsIgnoreCase("hayır")) {
            if (adet > 10) {
                toplamFiyat = fiyat * 0.85;
                System.out.println("Toplam odemeniz gereken tutar : " + toplamFiyat);
            } else if (adet < 10) {
                toplamFiyat = fiyat * 0.90;
                System.out.println("Toplam odemeniz gereken tutar : " + toplamFiyat);
            }

        }else System.out.println("Gecerli bir veri giriniz ");
    }
}