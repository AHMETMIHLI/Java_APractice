package day02_Scanner;

import java.util.Scanner;

public class C10_Sicaklik {
   /* Write a Java program to convert temperature from Fahrenheit to Celsius degree.
     Sorunun cevirisi : Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren
     bir Java programı yazınız.

     formula:
     c = (f-32)*5/9

       Not : 1 Fahrenheit yaklaşık -17.22 santigrat dereceye denk gelmektedir.
          100 Fahrenheit, bu formül göz önüne alındığında,
           yaklaşık 37,78 santigrat dereceye eşit olmaktadır.
 */
   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.print("Sıcaklıgı fahrenayt degerinde giriniz: ");
       double f=scan.nextDouble();

       double c=(f-32)*5/9;    //-17.22222222222222
       System.out.println(c);

   }
   }

