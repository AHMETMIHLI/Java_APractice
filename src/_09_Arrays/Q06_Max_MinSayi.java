package _09_Arrays;

import java.util.Arrays;

public class Q06_Max_MinSayi {
    public static void main(String[] args) {
	
	/*TASK :
	write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)
	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	*/

        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum sayi : "+ arr[0]);
        System.out.println("Maksimum sayi : "+ arr[arr.length-1]);
        System.out.println("Maksimum 2 büyük sayi : "+ arr[arr.length-2]);


        // Lambda ile çözüm
        System.out.println("Lambda ile Maximum Sayi: "+ Arrays.stream(arr).max().getAsInt());
        System.out.println("Lambda ile Minimum Sayi: "+ Arrays.stream(arr).min().getAsInt());


    }
}




/*
 int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
        Arrays.sort(arr);
        int maxDeger=arr[arr.length-1];
        int minDeger=arr[0];
        int ikinciBuyukDeger=arr[arr.length-2];

        System.out.println("en buyuk deger ="+maxDeger);
        System.out.println("en kucuk deger ="+minDeger);
        System.out.println("ikinci buyuk deger ="+ikinciBuyukDeger);


 */