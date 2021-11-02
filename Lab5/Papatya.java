package Lab5;

  import java.util.Scanner;

    public class Papatya {
    public static void main(String[] args){
        int sayi,papatya;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen papatyanın yaprak sayısını giriniz: ");
        sayi = scan.nextInt();
        papatya = sayi % 2;

      if (papatya == 1)
      {
          System.out.print("Üzgünüm dostum ama sevmiyor :(");
      }
      else if (papatya == 0)
      {
          System.out.print("O da seni seviyor <3");
      }
    }
}
