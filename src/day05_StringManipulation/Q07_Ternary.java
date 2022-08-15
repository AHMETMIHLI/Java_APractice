package day05_StringManipulation;

import java.util.Scanner;

public class Q07_Ternary {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

       Scanner scan=new Scanner(System.in);
        System.out.println("3 harfli bir isim giriniz: ");
        String isim =scan.next();

        char harf1=isim.charAt(0);
        char harf2=isim.charAt(1);
        char harf3=isim.charAt(2);

        String sonuc=isim.length()==3 ? harf1==harf2 ? "harf1 ve harf2 eşit " :  harf1==harf3 ?
                     "harf1 ve harf3 eşit " : harf2==harf3 ?
                     "harf 2 ve harf 3 eşit ": "Girilen isim unıgue karakterlere sahip" :
                      "3 karakter isim girmeliydiniz";

        System.out.println(sonuc);



    }
}
/*
      2.cozum yolu :

        char c1=isminiz.charAt(0);
        char c2=isminiz.charAt(1);
        char c3=isminiz.charAt(2);

    String sonuc=    isminiz.length()==3?(c1!=c2 && c1!=c3 && c2!=c3 ?("girdiginiz isim  3 harfli ve uniq karektere sahip"):
                " lutfen uniq karekterli giriniz") :
              " Girdiginiz 3 harfi degilldir";
        System.out.println(sonuc);

 */