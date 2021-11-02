package Lab5;

   import java.util.Scanner;

     public class Lab5_3 {
      public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.print("Please write a number between 0-99999 :");
        sayi = scan.nextInt();
        if ( sayi >= 0 && sayi < 10)
        {
            System.out.print("The number is one digit.");
        }
        else if ( sayi >= 10 && sayi < 100)
        {
            System.out.print("The number is two digit.");
        }
        else if ( sayi >= 100 && sayi < 1000)
        {
            System.out.print("The number  is three digit.");
        }
        else if ( sayi >= 1000 && sayi < 10000)
        {
            System.out.print("The number is four digit.");
        }
        else if ( sayi >= 10000 && sayi < 100000)
        {
            System.out.print("The number is five digit.");
        }
        else if ( sayi > 99999)
        {
            System.out.print("The number is not between 0-99999");
        }
      }
}
