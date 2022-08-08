package day03_IfStatements;

import java.util.Scanner;

public class C06_KoordinatNoktasi {
    public static void main(String[] args) {
        /*
        TASK : Kullanicidan aldıgınız koordinat noktasinin hangi
        bolgede oldugunu yazdiran kod yazınız.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("x ve y koordinatını giriniz");
        int x=scan.nextInt();
        int y=scan.nextInt();

        if(x>0 && y>0){
            System.out.println("Girdiginiz degerler 1.Bolgeye ait");
        }else if(x<0 && y>0){
            System.out.println("Girdiginiz degerler 2.Bolgeye ait");
        }else if(x<0 && y<0){
            System.out.println("Girdiginiz degerler 3.Bolgeye ait");
        }else if(x>0 && y<0){
            System.out.println("Girdiginiz degerler 4.Bolgeye ait");
        }else if(x!=0 && y==0) {
            System.out.println("Girdiginiz degerler x eksei uzerindedir");
        }else if(x==0 && y!=0) {
            System.out.println("Girdiginiz degerler y eksei uzerindedir");
        }else System.out.println("Orjindesiniz");
    }
}
