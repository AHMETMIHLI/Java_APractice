package day03_IfStatements;

import java.util.Scanner;

public class C11_GunAyYil {
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.



        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */

        Scanner scan= new Scanner(System.in);
        System.out.print("Gun giriniz: ");
        String gun=scan.next();
        System.out.print("Ay giriniz ");
        int ay=scan.nextInt();
        System.out.println("Yıl giriniz");
        int yil=scan.nextInt();

        System.out.println(ay+ ".ay "+gun+ " gunu "+ yil+ " yili ");
        System.out.println(yil+ " yili "+ ay+ ".ay "+gun+ " gunu ");
    }
}
