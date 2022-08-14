package day03_IfStatements;

import java.util.Scanner;

public class C14_İkiBilinmeyenliDenklem {
      /* Günün sorusu: if statement
      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.

        ax^2 + bx + c;

        Çözüm adımları
        kullanıcıdan a,b,c yi okutun.
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */
      public static void main(String[] args) {

          Scanner scan=new Scanner(System.in);
          System.out.print("a degerini girin: ");
          int a=scan.nextInt();
          System.out.print("b degerini girin: ");
          int b=scan.nextInt();
          System.out.print("c degerini girin: ");
          int c=scan.nextInt();

          int x;
          int x1;
          int x2;
          int d=(b*b)-(4*a*c);
          System.out.println("Delta : "+ d);

          if(d>0){
              x1= (int)(-b+Math.sqrt(d)/(2*a)); //x1=(-b + kök(d)) / (2a)  ,
              x2= (int)(-b - Math.sqrt(d)/(2*a));  // x2= (-b - kök(d)) / (2*a)
              System.out.println("2 tane kok vardir= "+"kok 1: "+x1+ ", kok 2: "+ x2);
              System.out.println();
          }else if(d==0){
              x=-b/(2*a); //x = -b/2a
              System.out.println("Bir tane kok vardır: "+ x);
          }else if(d<0){
              System.out.println("Kok yoktur");
          }
      }
}
