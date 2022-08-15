package day07_ForLoop;

public class Q02_HarflerinSayiDegeri {
    public static void main(String[] args) {


// 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.

        char harf;

        for (int i = 0; i < 255; i++) {
            harf= (char) i;
            System.out.print(i+":"+ harf+" ");

        }

    }
}


