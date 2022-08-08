package day02_Scanner;

import java.util.Scanner;

public class C06_Hız {
    public static void main(String[] args) {
          /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

        Scanner scan= new Scanner(System.in);
        System.out.println("Mesafeyi giriniz: ");
        double mesafe=scan.nextDouble();
        System.out.println("Hızınızı giriniz:");
        double hız=scan.nextDouble();
        double sure =mesafe/hız;

        System.out.println("Hedefiniz : "+ sure + "  saatlik uzaklıktadır");
    }
}
