package day05_StringManipulation;

import java.util.Scanner;

public class Q08_SonİkiKelime {
    public static void main(String[] args) {
        /* TASK :
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = liliil
         *
         * input = el
         * output = el
         */


        Scanner scan= new Scanner(System.in);
        System.out.println("Kelime giriniz");
        String kelime=scan.next();
        String sonIkıKelime="";

        if(kelime.length()>=3){
          sonIkıKelime=(kelime.substring(kelime.length()-2)+kelime.substring(kelime.length()-2)+
                    kelime.substring(kelime.length()-2));
            System.out.println(sonIkıKelime);

        }else System.out.println(kelime);


    }
}
