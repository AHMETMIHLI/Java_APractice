package day10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05_TekElemanLiListe_Lambda {
   static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */

        listOlustur();

    }

    public static void listOlustur() {

        List<Integer>sayilar =new ArrayList<>();;

        for (int i = 0; i <6 ; i++) {
            System.out.println("Sayi giriniz: ");
            int sayi=scan.nextInt();
            sayilar.add(sayi);
        }
        System.out.println("Sayiların listesi :"+ sayilar);
        tekElemanliListe(sayilar);

    }

    // lambda ile çözümün devamı :
    public static void tekElemanliListe(List<Integer> sayilar) {

        sayilar.stream().filter(t->t%2!=0).forEach(t-> System.out.print(t+" "));
    }


}

