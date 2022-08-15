package day05_StringManipulation;

import java.util.Scanner;

public class Q04_KelimeninTerstenYazilisi {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("4 harfli bir kelime girin");
        String kelime= scan.next();

        if(kelime.length()==4){
            String tersKelime=kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);
            System.out.println("Kelimenin tersten yazilisi : "+ tersKelime);
        }else System.out.println("4 Karakterlik kelime giriniz ");


        // 2.czum yolu for ile  :
        String tersStr="";
        for (int i = kelime.length()-1; i >=0 ; i--) {
            tersStr+=kelime.substring(i,i+1);
        }
        System.out.println("String'in for'la tersten yazilisi : "+ tersStr);

        //3 .çözum yolu.

        StringBuilder obj=new StringBuilder(kelime);
        System.out.println("Reverse methodu ile ters str: "+ obj.reverse().toString());


    }
}
