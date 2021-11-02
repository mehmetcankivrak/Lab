package Lab5;

import java.util.Scanner;

public class Lab5_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int gun;
        System.out.print("Enter the number of day: ");
        gun = scan.nextInt();
        if ( gun > 7 && gun < 100)
        {
            System.out.print("Invalid day!");
        }
        else switch (gun)
        {
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday"); break;
            case 7: System.out.print("Sunday"); break;
        }
    }
}
