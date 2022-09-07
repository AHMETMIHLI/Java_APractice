package day08_While_DoWhile;

import java.util.Scanner;

public class Q16_PinKoduKalanHak {
    public static void main(String[] args) {

        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.

        Scanner scan=new Scanner(System.in);
        int pin=123;
        int kalanHak=3;
        boolean dogruMu=false;


        while(!dogruMu){
            System.out.println("Pin Kodunuzu giriniz: ");
            int pingiris=scan.nextInt();
            if(pin==pingiris){
                dogruMu=true;
                System.out.println("Pin kodunuzu doğru girdiniz");
            }else {
                System.out.println("Pin için yeniden  giriş yapınız: ");
                kalanHak--;
                System.out.println("Kalan giriş hakkınız: "+ kalanHak);
            }

        }

    }
}
