package day02_Scanner;

import java.util.Scanner;

public class C04_İlkİkiveSonİkiSayınınToplami {
    /*
     *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("5 basamaklı bir sayi giriniz:");
        int sayi=scan.nextInt();

        int birlerBasamagi=sayi%10;
        sayi/=10;
        int onlarlarBasamagi=sayi%10;
        sayi/=10;
        int yuzlerBasamagi=sayi%10;
        sayi/=10;
        int binlerBasamagi=sayi%10;
        sayi/=10;
        int onbinlerBasamagi=sayi%10;
        System.out.println("Sayının ilk iki ve son iki rakamlarının toplamı: "+
                (birlerBasamagi+onlarlarBasamagi+binlerBasamagi+onbinlerBasamagi));


    }

}
