package day02_Scanner;

import java.util.Scanner;

public class C01_AdSoyad {
      /*
    	 * kullanicinin ad soyad yas boy kilosunu  yazdiriniz
    	 */
      public static void main(String[] args) {

          Scanner scan= new Scanner(System.in);
          System.out.print("Adınızı giriniz : ");
          String ad=scan.nextLine();

          System.out.print("Soyadınızı giriniz : ");
          String soyad=scan.nextLine();

          System.out.print("Yasinizi giriniz: ");
          int yas=scan.nextInt();

          System.out.print("Boyunuzu cm olarak giriniz: ");
          double boy=scan.nextInt();
          boy=boy/100;

          System.out.print("Kilounuzu giriniz: ");
          double kilo=scan.nextDouble();

          System.out.println("Adınız : "+ ad+ "\nSoyadınız: "+soyad+"\nYasiniz: "+ yas+
                             "\nBoyunuz: "+boy+"\nKilonuz: "+kilo);

      }
}
