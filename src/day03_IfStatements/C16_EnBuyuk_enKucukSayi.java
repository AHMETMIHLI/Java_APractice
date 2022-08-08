package day03_IfStatements;

import java.util.Scanner;

public class C16_EnBuyuk_enKucukSayi {
    public static void main(String[] args) {

        /*
        TASK :
        Kullanicidan 3 numara isteyin ve bu numaralarin en buyuk ve en kucuk
        olanlarını konsola yazdirin
        int num1
        int num2
        int num3
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayi giriniz : ");
        int num1 = scan.nextInt();
        System.out.print("2. sayi giriniz : ");
        int num2 = scan.nextInt();
        System.out.print("2. sayi giriniz : ");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("En buyuk sayi : " + num1);
            if (num2 > num3) {
                System.out.println("En kucuk sayi : " + num3);
            } else {
                System.out.println("En kucuk sayi : " + num2);
            }

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("En buyuk sayi : " + num2);
            if (num1 > num3) {
                System.out.println("En kucuk sayi : " + num3);
            } else {
                System.out.println("En kucuk sayi : " + num1);
            }

        } else if (num3 > num1 && num3 > num2) {
            System.out.println("En buyuk sayi : " + num3);
            if (num1 > num2) {
                System.out.println("En kucuk sayi : " + num2);
            } else {
                System.out.println("En kucuk sayi : " + num1);
            }
        }
    }
}