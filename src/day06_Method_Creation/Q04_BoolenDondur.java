package day06_Method_Creation;

import java.util.Scanner;

public class Q04_BoolenDondur {
    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false

         */

       Scanner scan= new Scanner(System.in);
        System.out.println("Bir String siriniz: ");
        String str=scan.next();

       boolean varMı=xyz(str);
        System.out.println(varMı);
    }

    private static boolean xyz(String str) {
        boolean varMi=false;
        if(str.contains("xyz")){
            varMi=true;
        }else {
            varMi=false;
        }
        return varMi;
    }

}
