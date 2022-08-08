package day03_IfStatements;

import java.util.Scanner;

public class C03_VucutKitleendex {
    public static void main(String[] args) {

        /*
        Kullanicidan boyunu M ve kilosunu kg olarak alın BMI (VKE)hesaplayiniz.

        INFO:
        BMI= kilo(kg) // (boy*boy)(m)
        BMI<=20 Oldukca zayifsiniz
        20<BMI<=25 Normal sınırlardanınız
        25<BMI<=30 Sisman katagorisindesiniz
        30<BMI  Obez grubundasınız
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Boyunuzu cm olarak giriniz ");
        double boy=scan.nextDouble();
        boy=boy/100; // cm girilen deger m ye cevrildi

        System.out.println("Kilonuzu kg olarak giriniz ");
        double kilo=scan.nextDouble();

        double bmi=kilo/((boy*boy));
        System.out.println("bmi = " + bmi);

        if(bmi<=20){
            System.out.println("Oldukca zayifsiniz");
        }else if(bmi<=25){
            System.out.println("Normal sınırlardanınız");
        }else if(bmi<=30){
            System.out.println("Sisman katagorisindesiniz");
        }else if(bmi>30){
            System.out.println("Obez katagorisindesiniz");
        }else System.out.println("Veriniz saglıklı degil");
    }
}
