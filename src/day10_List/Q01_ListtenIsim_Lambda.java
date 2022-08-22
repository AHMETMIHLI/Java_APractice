package day10_List;

import java.util.ArrayList;
import java.util.List;

public class Q01_ListtenIsim_Lambda {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String> isimler = new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Ayse");
        isimler.add("Fatma");
        isimler.add("Omer");


        for (int i = 0; i < isimler.size(); i++) {
            if (isimler.get(i).contains("A")) {
                isimler.remove(i);
                if (isimler.get(i).contains("a")) {
                    isimler.remove(i);
                }

            }


        }  System.out.println(isimler);    //[Veli, Omer]


        // 2.Çözüm yolu lambda

       aicermeyenleriGetir(isimler);

    }

    public static void aicermeyenleriGetir(List<String> isimler) {
        isimler.removeIf(t->t.contains("A") || t.contains("a"));
        System.out.println(isimler);
    }


}
