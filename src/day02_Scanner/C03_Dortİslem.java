package day02_Scanner;

import java.util.Scanner;

public class C03_Dortİslem {
    // kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz :");
        double sayi1=scan.nextInt();
        System.out.print("İkinci sayiyi giriniz :");
        double sayi2=scan.nextInt();

        double toplam=sayi1+sayi2;
        double fark=sayi1-sayi2;
        double carpim=sayi1*sayi2;
        double bolum=sayi1/sayi2;

        System.out.println("Sayiların toplamı: "+ toplam);
        System.out.println("Sayiların farki : "+ fark);
        System.out.println("Sayiların carpımı : "+ carpim);
        System.out.println("Sayiların bolumu: "+  bolum);

    }
}
