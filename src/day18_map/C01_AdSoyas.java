package day18_map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class C01_AdSoyas {
    //  Ad ve soyad bulunduruan iki ayrı array'i ad=soyad  seklinde yazdırınız.
    // input : {"ahmet", "ahmet can", "haluk"};  {"şeref", "erdem", "bilgin"};
    // output : {ahmet=şeref, ahmet can=erdem, haluk=bilgin};
    public static void main(String[] args) {
        String[] ad = {"ahmet", "ahmet can", "haluk"};
        String[] soyad= {"şeref", "erdem", "bilgin"};

        Map<String,String> adSoyad=new HashMap<>();

        for (int i = 0; i <ad.length ; i++) {
            adSoyad.put(ad[i],soyad[i]);
        }
        System.out.println(adSoyad);

        }



    }


