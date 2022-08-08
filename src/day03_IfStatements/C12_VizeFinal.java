package day03_IfStatements;

import java.util.Scanner;

public class C12_VizeFinal {
       /*
        TASK :
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */
       public static void main(String[] args) {
           Scanner scan= new Scanner(System.in);
           System.out.print("Vize notunuzu giriniz: ");
           double vize =scan.nextDouble();
           System.out.print("Final notunuzu giriniz: ");
           double finall= scan.nextDouble();

           System.out.print("Vize sinavınızın yuzdesini giriniz: ");
           double vizeYuzde=scan.nextDouble()/100;
           System.out.print("Final sinavınızın yuzdesini giriniz: ");
           double finalYuzde=scan.nextDouble()/100;

           double ortalama= (vize*vizeYuzde)+(finall*finalYuzde);

           if(ortalama>=50){
               System.out.println("Tebrikler dersi başarı ile geçtiniz...Ortalamanız: "+ortalama);
           }else System.out.println("Malesef dersten kaldınız...Ortalamanız: "+ ortalama );
       }


}
