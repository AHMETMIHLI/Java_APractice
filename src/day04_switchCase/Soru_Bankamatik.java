package day04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {
    /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */
    static  Scanner scan= new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Bakiye Sorgulama icin 1'i \nPara Cemkek icin 2'yi" +
                "\nPara Yatirmak icin 3'u seciniz.");
        String islem = scan.next();
        int bakiye = 100;
        int cekilecekMiktar = 0;
        int yatirilacakMiktar = 0;


        switch (islem) {
            case "1":
                int bakiyeSorgulama = BakiyeSorgulamaAtm(bakiye);
                break;
            case "2":
                int paracekme = ParaCekmeAtm(bakiye, cekilecekMiktar);
                break;
            case "3":
                int paraYatirma = paraYatirmaAtm(bakiye, yatirilacakMiktar);
                break;
            default:
                System.out.println("Gecerli bir rakam giriniz");

        }


    }

    public static int BakiyeSorgulamaAtm(int bakiye) {
        if (bakiye == 100) {
            System.out.println("Bakiyeniz :" + bakiye);
        }
        return bakiye;
    }

    public static int ParaCekmeAtm(int bakiye, int cekilecekMiktar) {
        int kalan = 0;
        System.out.println("Cekmek istediginiz miktarı giriniz : ");
        cekilecekMiktar = scan.nextInt();
        kalan = bakiye - cekilecekMiktar;
        System.out.println("Atm'de kalan tutar : " + kalan);


        return kalan;
    }

    public static int paraYatirmaAtm(int bakiye, int yatirilacakMiktar) {
        int toplam = 0;
        System.out.println("Yatirmak istediginiz tutari giriniz:");
        yatirilacakMiktar = scan.nextInt();
        toplam = bakiye + yatirilacakMiktar;
        System.out.println("Atm'de toplam para : " + toplam);

        return toplam;

    }


}

