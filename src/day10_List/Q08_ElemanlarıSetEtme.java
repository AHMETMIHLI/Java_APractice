package day10_List;

import java.util.ArrayList;
import java.util.List;

public class Q08_ElemanlarıSetEtme {

    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        ArrayList<String> list = new ArrayList<String>(List.of("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        System.out.println("degişiklik yapmadan önceki list = "+list);
        String elman3=list.get(2);
        String elman8=list.get(7);

        list.set(2,elman8);
        list.set(7,elman3);
        System.out.println(list);



    }

}
