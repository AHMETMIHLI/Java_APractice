package day18_map;

import java.util.HashMap;
import java.util.Map;

public class C02_HashMap {
    public static void main(String[] args) {
        Map<Integer,String> liste=new HashMap<>();
        liste.put(100,"Ayse");
        liste.put(101,"Emsal");
        liste.put(102,"Yasemin");
        liste.put(103,"Huseyin");
        liste.put(104,"Selim");
        System.out.println(liste); //{100=Ayse, 101=Emsal, 102=Yasemin, 103=Huseyin, 104=Selim}

        liste.put(103,"Hatice");    // 103 deki kisi degisti
        liste.put(104,"Esra");    // 104 deki kisi degisti
        System.out.println(liste); //{100=Ayse, 101=Emsal, 102=Yasemin, 103=Hatice, 104=Esra}

        // istersek valuelere null da ekleyebiliriz
        liste.put(105,null);
        liste.put(106,null);
        System.out.println(liste); //{100=Ayse, 101=Emsal, 102=Yasemin, 103=Hatice, 104=Esra, 105=null, 106=null}

        // key degeride null olabilir
        liste.put(null,"Azra");
        System.out.println(liste);  // {null=Azra, 100=Ayse, 101=Emsal, 102=Yasemin, 103=Hatice, 104=Esra, 105=null, 106=null}

        liste.putIfAbsent(103,"Hatice");  //
        System.out.println( liste.putIfAbsent(103,"Hatice"));  // Hatice listede ekli oldugu icin onu  getirdi
        liste.putIfAbsent(108,"Betul");
        System.out.println( liste.putIfAbsent(108,"Betul")); // Betul
        liste.putIfAbsent(108,"Alı"); // 108 de betul oldugu icin onu dondurdu  ve yerine Ali yi eklemedi
        System.out.println(liste.putIfAbsent(108,"Alı"));

        System.out.println(liste);  //{null=Azra, 100=Ayse, 101=Emsal, 102=Yasemin, 103=Hatice, 104=Esra, 105=null, 106=null, 108=Betul}






    }
}
