package day02_Scanner;

import java.util.Scanner;

public class C02_SayilarınBasamaklari {
    /*
     * Kullanicidan uc basamakli bir sayi alin
     * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
     *
     *
     * Ornek : Inputs : 853
     * Output : Girdiginiz sayinin birler basamagi : 3
     *          Girdiginiz sayinin onlar basamagi : 5
     *          Girdiginiz sayinin yuzler basamagi : 8
     *
     *
     */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("3 basamaklı bir sayi giriniz: ");
        int sayi=scan.nextInt();

        int birlerBasamagi=sayi%10;
        sayi/=10;
        int onlarBasamagi=  sayi%10;

        int yuzlerBasamagi=sayi/10;

        System.out.println("Sayinin birler basamagi: "+ birlerBasamagi);
        System.out.println("Sayinin onlar basamagi: "+ onlarBasamagi);
        System.out.println("Sayinin yuzler basamagi: "+ yuzlerBasamagi);
    }
}
