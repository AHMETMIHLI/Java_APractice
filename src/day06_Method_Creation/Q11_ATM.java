package day06_Method_Creation;

import java.util.Scanner;

public class Q11_ATM {

    static Scanner scan = new Scanner(System.in);
    static int bakiye = 100;
    static int cekilecekMiktar = 0;
    static int yatirilacakMiktar = 0;
    public static void main(String[] args) {
         /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
  ve cekme, çıkış işlemlerinin yapıldıgı bir
   ATM app. method create ediniz
   */

     anaMenu();


    }

    private static void anaMenu() {
        System.out.println("Bakiye Sorgulama icin -->1 \nPara Cemkek icin -->2" +
                "\nPara Yatirmak icin -->3"+"\nCıkmak icin -->4 seciniz.");
        String islem = scan.next();

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
            case "4":
                cıkıs();
                break;
            default:
                System.out.println("Gecerli bir rakam giriniz");

        }
    }

    private static void cıkıs() {

        System.out.println("İşlemlerini gerçekleştirdiniz teşekkür ederiz, yine bekleriz");
    }

    public static int BakiyeSorgulamaAtm(int bakiye) {
        System.out.println("Bakiyeniz :" + bakiye);
        System.out.println("Devam etmek istiyorsanız --1\nİstemi sonladırmak istiyorsanız -->2 yi secin");
        int secim=scan.nextInt();
        if(secim==1){
            anaMenu();
        }else if(secim==2){
            cıkıs();
        }

        return bakiye;
    }

    public static int ParaCekmeAtm(int bakiye, int cekilecekMiktar) {
        int kalan = 0;
        System.out.println("Cekmek istediginiz miktarı giriniz : ");
        cekilecekMiktar = scan.nextInt();
        if(cekilecekMiktar<bakiye){
            kalan = bakiye - cekilecekMiktar;
            System.out.println("Atm'de kalan tutar : " + kalan);
        }else System.out.println("Bakiyeniz para cekmeye yeterli degildir");

        System.out.println("Devam etmek istiyorsanız --1\nİstemi sonladırmak istiyorsanız -->2 yi secin");
        int secim=scan.nextInt();
        if(secim==1){
            anaMenu();
        }else if(secim==2){
            cıkıs();
        }
       return kalan;
    }


    public static int paraYatirmaAtm(int bakiye, int yatirilacakMiktar) {
        int toplam = 0;
        System.out.println("Yatirmak istediginiz tutari giriniz:");
        yatirilacakMiktar = scan.nextInt();
        toplam = bakiye + yatirilacakMiktar;
        System.out.println("Atm'de toplam para : " + toplam);
        System.out.println("Devam etmek istiyorsanız --1\nİstemi sonladırmak istiyorsanız -->2 yi secin");
        int secim=scan.nextInt();
        if(secim==1){
            anaMenu();
        }else if(secim==2){
            cıkıs();
        }

        return toplam;

    }


}
