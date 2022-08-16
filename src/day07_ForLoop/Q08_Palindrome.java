package day07_ForLoop;

import java.util.Scanner;

public class Q08_Palindrome {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.
        Not: Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("String girin:");
        String str=scan.nextLine();

        String tersStr="";

        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.substring(i,i+1);
        }
        if(tersStr.equals(str)){
            System.out.println("Girilen strgin palindrom'dur");
        }else System.out.println("Girilen str palindrome değildir");


    }

}

