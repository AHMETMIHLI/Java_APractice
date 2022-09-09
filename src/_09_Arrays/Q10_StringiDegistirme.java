package _09_Arrays;

import java.util.Arrays;

public class Q10_StringiDegistirme {

    public static void main(String[] args) {
        /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )

         */

        String str="GayetBasarılı";
        String [] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));

        String [] yeniarr=new String[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].contains("Gayet")){
                yeniarr[i]=arr[i].replace("Gayet","Cook");
            }

        }
        System.out.println(Arrays.toString(yeniarr));






    }

}


/*
    String str="GayetBasarılı";

    String str1="Coook";

        str1+=str.substring(5);

                System.out.println(str1);

*/
