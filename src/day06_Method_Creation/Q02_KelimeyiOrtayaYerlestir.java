package day06_Method_Creation;

import java.util.Scanner;

public class Q02_KelimeyiOrtayaYerlestir {
    public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/

        Scanner scan= new Scanner(System.in);
        System.out.print("name1 giriniz : ");
        String name1=scan.next();
        System.out.print("name2 giriniz : ");
        String name2=scan.next();

        kelimeYerlesTir(name1,name2);

    }

    private static void kelimeYerlesTir(String name1, String name2) {

        String yeniName="";
        int karakterSayisi=name1.length();
        if(karakterSayisi%2==0){
            yeniName=name1.substring(0,karakterSayisi/2)+name2+name1.substring(karakterSayisi/2);
            System.out.println(yeniName);
        }else System.out.println("Cift sayili olmadıgı için ortasına yerleştiremedik");

    }


}
