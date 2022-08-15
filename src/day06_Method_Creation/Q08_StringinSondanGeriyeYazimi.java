package day06_Method_Creation;

public class Q08_StringinSondanGeriyeYazimi {
    /*
      TASK :
      Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
      String parametreli return type li reverseWord isminde bir method create ediniz

       Test Data :
      İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
      Output : versin açıklığı zihin arkadaşlara Javacı Allah
       */
    public static void main(String[] args) {
        String input = "Allah Javacı arkadaşlara  zihin açıklığı versin";
        String tersInput = "";
        String index = " ";

        String[] arr = input.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            tersInput += arr[i] + " ";
        }
        System.out.println("Stringin sondan geriye yazımı: " + tersInput);
    }


}
