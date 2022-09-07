package day08_While_DoWhile;

import java.util.Scanner;

public class Q07_XGirileneKadar {

    public static void main(String[] args) {
      /* TASK :
       Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        ve x girildiğinde ise "Program bitti" yazan programı yazınız.
       */

      Scanner scan= new Scanner(System.in);
      String deger="";

      do {
          System.out.println("Deger giriniz:");
          deger=scan.next();
          if(deger.equalsIgnoreCase("x")) break;
           System.out.println("Program çalışıyor");

      } while(!deger.equalsIgnoreCase("x"));
          System.out.println("Program bitti");

    }
}
