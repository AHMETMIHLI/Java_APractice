package _09_Arrays;

public class Q10_StringiDegistirme {

    public static void main(String[] args) {
        /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )

         */

        String str="GayetBasarılı";
        str=str.replace("Gayet","Coook");
        System.out.println(str);



    }

}


/*
    String str="GayetBasarılı";

    String str1="Coook";

        str1+=str.substring(5);

                System.out.println(str1);

*/