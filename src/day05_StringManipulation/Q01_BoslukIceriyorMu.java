package day05_StringManipulation;

import java.util.Scanner;

public class Q01_BoslukIceriyorMu {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        // Boşluk içeriyorsa boşluğu siliniz.

       Scanner scan= new Scanner(System.in);
        System.out.println("Bir String giriniz :");
        String str=scan.nextLine();

        if(str.contains(" ")){
            str=str.replaceAll(" ","");
            System.out.println("String bosluk iceriyor");
            System.out.println("Bosluksuz String: "+ str);
        }else System.out.println("String bosluk içermiyor ");


    }
}

