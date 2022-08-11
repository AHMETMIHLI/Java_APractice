package day02_Scanner;

import java.util.Scanner;

public class C08_VizeFinalGecmeNotu {
       /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("Vize1 notunuzu girin: ");
        double vize1=scan.nextDouble();
        System.out.print("Vize2 notunuzu girin: ");
        double vize2=scan.nextDouble();
        System.out.print("Final notunuzu girin: ");
        double finall=scan.nextDouble();

        double gecmeNotu=((vize1+vize2)/2*0.30)+(finall*0.7);

        System.out.println("Gecme notunuz : "+ gecmeNotu);

    }
}
