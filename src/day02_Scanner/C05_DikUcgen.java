package day02_Scanner;

import java.util.Scanner;

public class C05_DikUcgen {
     /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
        h*h=(a*a)+(b*b);

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz: ");
        int a=scan.nextInt();
        System.out.println("İkinci kenarı giriniz: ");
        int b=scan.nextInt();
        double h=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenus uzunlugu: " + h);


    }
}
