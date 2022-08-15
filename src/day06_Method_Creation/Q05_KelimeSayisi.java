package day06_Method_Creation;

public class Q05_KelimeSayisi {

    public static void main(String[] args) {
         /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */
        String input="The quick brown fox jumps over the lazy dog.";

         kacKelime(input);

    }

    private static void kacKelime(String input) {

        String []arr=input.split(" ");
        int kelimesayisi=0;

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr[i];
            kelimesayisi++;
        }
        System.out.println("Kelime sayisi: "+ kelimesayisi); // Kelime sayisi: 9


    }
}





/*
        2.Çozum yolu :

        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String name1=scan.nextLine();

        kacKelimeOldugunuBul(name1);

    }

    private static void kacKelimeOldugunuBul(String name1) {

        int sayac=0;

        for (int i = 0; i <name1.length() ; i++) {
            if (name1.charAt(i) == ' '){
                sayac++;

            }


        }
        System.out.println("bulunan kelime adedi ="+(sayac+1));

        }

 */