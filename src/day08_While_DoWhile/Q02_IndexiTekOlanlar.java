package day08_While_DoWhile;

import java.util.Scanner;

public class Q02_IndexiTekOlanlar {

    public static void main(String[] args) {
        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz

        Scanner scan= new Scanner(System.in);
        System.out.println("Kelime giriniz: ");
        String kelime=scan.nextLine();

        indexiTekOlanElemanlar(kelime);

    }

    public static void indexiTekOlanElemanlar(String kelime) {
        int uzunluk=kelime.length();
        int i=0;
        while (i<uzunluk){
            if(kelime.indexOf(kelime.charAt(i))%2!=0){
                System.out.print(kelime.charAt(i)+" ");
            }
            i++;
        }
    }

}
