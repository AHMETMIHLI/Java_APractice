package day08_While_DoWhile;

import java.util.Scanner;

public class Q09_PinSorgulama {

    public static void main(String[] args) {
        // TASK :  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Pin Kodunuzu giriniz: ");
        int pingiris = scan.nextInt();
        int pin = 123;


        while (pingiris != pin) {
            System.out.println("Hatalı giriş yaptınız, yeniden giriş yapınız ");
            pingiris = scan.nextInt();
        }
        System.out.println("Başarılı giriş yaptınız ");
    }
}




