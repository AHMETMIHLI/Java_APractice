package day08_While_DoWhile;

import java.util.Scanner;

public class Q05_BasamaklarınToplami {
    public static void main(String[] args) {

        // TASK : GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.

        Scanner scan= new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int sayi=scan.nextInt();
        int temp=sayi;
        int basamak=0;
        int toplam=0;

        while(temp>0){
            basamak=temp%10;
            toplam+=basamak;
            temp/=10;

        }
        System.out.println("Basamakların toplamı: "+ toplam);

    }

}
