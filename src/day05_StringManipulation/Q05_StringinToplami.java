package day05_StringManipulation;

public class Q05_StringinToplami {
    public static void main(String[] args) {
    /*
        TASK :
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */
        String  str1= "%13.99";
        String str2= "%10.55";

        str1=str1.replace("%",""); // 13.99
        str2=str2.replace("%","");// 10.55

        double toplam= Double.parseDouble(str1)+Double.parseDouble(str2);
        System.out.println("String'lerin rakamsal olarak toplamı: "+ toplam);



    }
}
