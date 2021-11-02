package Lab5;

    import java.util.Scanner;

     public class Lab5_1 {
        public static void main(String[] args){
          Scanner scan = new Scanner(System.in);
           int f, s, t ;
        System.out.print("Please write first number: ");
        f = scan.nextInt();
        System.out.print("Please write second number: ");
        s = scan.nextInt();
        System.out.print("Please write thirds number: ");
        t = scan.nextInt();

        if ( f > s && f > t)
        {
          System.out.print( f + " is the largest number.");
        }
        else if ( s > f && s > t)
        {
          System.out.print( s + " is the largest number.");
        }
        else if ( t > f && t > s)
        {
          System.out.print( t + " is the largest number.");
        }
        else
          System.out.print("Please write numbers again.");
     }
}
