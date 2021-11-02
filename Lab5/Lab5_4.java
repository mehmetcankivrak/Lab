package Lab5;

import java.util.Scanner;

public class Lab5_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your score between 0 to 100: ");
        int not = scan.nextInt();

        if (not < 0 || not >100)
        {
            System.out.print("Score should be between 0 to 100!");
        }
        else switch (not/10)
        {
            case 0:
            case 1:
            case 2:
            case 3: System.out.print("Grade F"); break;
            case 4:
            case 5: System.out.print("Grade D"); break;
            case 6: System.out.print("Grade C"); break;
            case 7:
            case 8: System.out.print("Grade B"); break;
            case 9:
            case 10: System.out.print("Grade A"); break;
        }
    }
}
