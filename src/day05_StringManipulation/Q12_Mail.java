package day05_StringManipulation;

import java.util.Scanner;

public class Q12_Mail {
    public static void main(String[] args) {
		/* TASK :
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen mail adresinizi giriniz : ");
        String email=scan.nextLine();
        int ilkKullanım=email.toLowerCase().indexOf("gmail.com");
        int sonKullanım=email.toLowerCase().lastIndexOf("gmail.com");

        if(!email.contains("@gmail.com")){
            System.out.print("lutfen gmail adresini giriniz");
            // bu kısımda gmail.com dışındaki mail adresi girildi ise devamında yapılması gerekenler asağıda yapıldı
            email=scan.nextLine();
            if(email.endsWith("@gmail.com")){
                System.out.println("Email adresiniz kaydedildi");
            }else {
                System.out.print("2.kez yanlış giriş yaptın, giriş için son hakkını kullan ");
                email= scan.nextLine();
                if(email.endsWith("@gmail.com")){
                    System.out.println("Sonunda adresi yazabildiniz :) ");
                }else {
                    System.out.println("Adresiniz bloke oldu , uzgunum:(");
                }
            }
        }else if(email.endsWith("@gmail.com")) {
            System.out.println("Adresiniz dogru sisteme giriş yaptınız.");
        }else {
            System.out.println("Lutfen yazimi kontrol edin, Yanlış adres girdiniz.");
            // Bu kısımda @gmail.com adresini hatalı girdiği durumda yapılması gereken yapıldı
        }



    }

}
