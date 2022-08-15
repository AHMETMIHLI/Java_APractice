package day06_Method_Creation;

import java.util.Arrays;

public class Q06_UnıqeElemanlar {
    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {
        String input = "aabbcccccddddaaa";
        String unige="";

        String [] arr=input.split("");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <arr.length ; i++) {
            if(!unige.contains(arr[i]))  {
                unige+=arr[i];
            }
        }
        System.out.println(unige);

    }


}
