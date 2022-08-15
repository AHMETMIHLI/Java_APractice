package day05_StringManipulation;

import java.util.Arrays;

public class Q11_HarfBulma {
    public static void main(String[] args) {
	/*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

        String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char a = pickName.charAt(pickName.indexOf("A"));
        char l = pickName.charAt(pickName.indexOf("L"));
        char ı = pickName.charAt(pickName.indexOf("I"));

        System.out.println(a + " " + l + " " + ı);


        // 2.cozum yolu :

        String[] arr = pickName.split("");
        //System.out.println(Arrays.toString(arr));
        String isim = "";

        for (int i= 0; i < arr.length; i++) {
            if (arr[i].equals("A")) {
                isim += arr[i];
            } else if (arr[i].equals("L")) {
                isim += arr[i];
            } else if (arr[i].equals("I")) {
                isim += arr[i];
            }
        }
        // System.out.println(isim);
        isim = isim.substring(0, 1) + " " + isim.substring(1, 2).replace("I", "L") + " " +
                isim.substring(2).replace("L", "I");
        System.out.println(isim);


    }

}
