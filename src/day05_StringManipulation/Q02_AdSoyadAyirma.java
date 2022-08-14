package day05_StringManipulation;

import java.util.Scanner;

public class Q02_AdSoyadAyirma {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner scan= new Scanner(System.in);
        System.out.println("Adınızı ve soyadınızı giriniz :");
        String adSoyad= scan.nextLine();
        int bosluk=adSoyad.indexOf(" ");

        String isim=adSoyad.substring(0, bosluk);
        String soyIsim =adSoyad.substring(bosluk + 1, adSoyad.length());
        System.out.println(isim + "\n"+soyIsim);

    }
}
