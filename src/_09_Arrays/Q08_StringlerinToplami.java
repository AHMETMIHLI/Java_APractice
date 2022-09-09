package _09_Arrays;

import java.util.Arrays;

public class Q08_StringlerinToplami {

    public static void main(String[] args) {
		
		/*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        String [] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        int toplam$=0;
        int toplam£=0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i].contains("$")){
                toplam$+=Integer.parseInt(arr[i].replace("$",""));
            }else if(arr[i].contains("£")){
                toplam£+=Integer.parseInt(arr[i].replace("£",""));
            }

        }
        System.out.println("$ ların toplamı : "+ toplam$);
        System.out.println("£ ların toplamı : "+ toplam£);




    }
}



