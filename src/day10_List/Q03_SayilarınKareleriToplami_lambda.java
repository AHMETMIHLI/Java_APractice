package day10_List;

import java.util.ArrayList;
import java.util.List;

public class Q03_SayilarınKareleriToplami_lambda {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(1);
        sayilar.add(5);
        System.out.println("sayilar = " + sayilar);

        sayilarinKareleriToplami(sayilar);
       

    }

    private static void sayilarinKareleriToplami(List<Integer> sayilar) {
        int toplam=0;
        
        for (Integer w:sayilar
        ) {
        toplam+=w*w;

        }
        System.out.println("toplam = " + toplam);



        //2.çözüm lambda

        System.out.println(sayilar.stream().map(t -> t * t).reduce(0, (t, u) -> t + u));  //39
    }



}

