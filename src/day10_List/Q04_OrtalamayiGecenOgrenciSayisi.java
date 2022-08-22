package day10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_OrtalamayiGecenOgrenciSayisi {
    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Girmek istediğiniz notların adedini giriniz:");
        int adet = scan.nextInt();
        List<Integer> notlar = new ArrayList<>();
        int sayac = 0;
        int ortalamaUstu = 0;
        int ortalama = 0;

        for (int i = 0; i < adet; i++) {
            System.out.println("Notu giriniz:");
            int not = scan.nextInt();
            notlar.add(not);
            ortalama += notlar.get(i);
        }
        System.out.println("notlar : " + notlar);
        ortalama /= adet;
        System.out.println("Ortalama: " + ortalama);


        for (int i = 0; i < notlar.size(); i++) {
            if (ortalama < notlar.get(i)) {
                ortalamaUstu++;
            }

        }
        System.out.println("Ortalamayı gecen öğrenci sayisi : " + ortalamaUstu);


    }
}
