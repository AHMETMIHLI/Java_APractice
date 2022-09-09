package day10_List;

import java.util.ArrayList;
import java.util.List;

public class Q02_ArrayiListeAt {

    public static void main(String[] args) {
        /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
        String [] [] input = {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};

        arraydanListe(input);

   }
    public static void arraydanListe(String[][] input) {
        List<String>isimler=new ArrayList<>();

        for (int i = 0; i <input.length ; i++) {
            for (int j = 0; j <input[i].length ; j++) {
                isimler.add(input[i][j]);

            }

        }
        System.out.println("isimler = " + isimler);  //isimler = [Ali, Veli, Ayse, Hasan, Can, Suzan]

    }

    //2.çözüm yolu lambda

}


