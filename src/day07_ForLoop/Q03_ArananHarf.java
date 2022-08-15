package day07_ForLoop;

public class Q03_ArananHarf {
    public static void main(String[] args) {

        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)
         */

      String str="Bugün hava oldukca güzel";
      char arananHarf='a';
      int sayac=0;

        for (int i = 0; i <str.length() ; i++) {
            if(arananHarf==str.charAt(i)){
                sayac++;
            }else if(str.charAt(i)=='c'){
                break;
            }

        }
        System.out.println("a'nın sayısı : "+sayac);


    }
}
