package day02_Scanner;

import java.util.Scanner;

public class C12_İscilerinIsBitirmeSuresi {
    /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?

        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("İsi yapacak isci sayısını giriniz: ");
        int isciSayisi=scan.nextInt();
        System.out.print("Bir iscinin isi bitirme suresini giriniz: ");
        int sure=scan.nextInt();

        int isiBitirmeSuresi=sure/isciSayisi;
        System.out.println("İscilerin isi bitirme suresi : "+ isiBitirmeSuresi);
    }
}
