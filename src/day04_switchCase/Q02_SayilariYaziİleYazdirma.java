package day04_switchCase;

import java.util.Scanner;

public class Q02_SayilariYaziİleYazdirma {
    public static void main(String[] args) {
        // 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamaklı sayi giriniz:");
        int sayi = scan.nextInt();

        int birlerBasamagi = sayi % 10;
        sayi /= 10;
        int onlarBasamagi = sayi % 10;
        sayi /= 10;
        int yuzlerBasamagi = sayi % 10;

        if (sayi<100 || sayi>999) {
            System.out.println("Gecerli bir 3 basamaklı sayı giriniz");
        }else
        switch (yuzlerBasamagi) {
            case 1:
                System.out.print("Yuz ");
                break;
            case 2:
                System.out.print("İkiyuz ");
                break;
            case 3:
                System.out.print("Uzyuz ");
                break;
            case 4:
                System.out.print("DortYuz ");
                break;
            case 5:
                System.out.print("BesYuz ");
                break;
            case 6:
                System.out.print("Altıyuz ");
                break;
            case 7:
                System.out.print("Yedıyuz ");
                break;
            case 8:
                System.out.print("SekızYuz ");
                break;
            case 9:
                System.out.print("Dokuzyuz ");
                break;
            default:
                System.out.print("");
        }

        switch (onlarBasamagi) {
            case 1:
                System.out.print("On ");
                break;
            case 2:
                System.out.print("Yirmi ");
                break;
            case 3:
                System.out.print("Otuz");
                break;
            case 4:
                System.out.print("Kırk ");
                break;
            case 5:
                System.out.print("Elli ");
                break;
            case 6:
                System.out.print("Altmıs");
                break;
            case 7:
                System.out.print("Yetmis ");
                break;
            case 8:
                System.out.print("Seksen ");
                break;
            case 9:
                System.out.print("Doksan ");
                break;
            default:
                System.out.print(" ");

        }

        switch (birlerBasamagi) {
            case 0:
                System.out.println("");
                break;
            case 1:
                System.out.print(" Bir");
                break;
            case 2:
                System.out.print(" İki");
                break;
            case 3:
                System.out.print("Uc");
                break;
            case 4:
                System.out.print(" Dort");
                break;
            case 5:
                System.out.print(" Bes");
                break;
            case 6:
                System.out.print(" Altı");
                break;
            case 7:
                System.out.print(" Yedi");
                break;
            case 8:
                System.out.print(" Sekiz");
                break;
            case 9:
                System.out.print(" Dokuz");
                break;
            default:
                System.out.print("");

        }


    }


}

