package conditionals;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a num:");
        int num1 = scan.nextInt();
        System.out.println("Enter a num:");
        int num2 = scan.nextInt();

        System.out.print("Biggest:");
        if (num1 > num2) System.out.println(num1);
        else System.out.println(num2);


        System.out.println("Enter a num:");
        int num3 = scan.nextInt();

        if (num3 % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
        scan.nextLine();

        System.out.println("Enter a traffic light colour:");
        String colour = scan.nextLine();

        if (colour.equals("green")) System.out.println("GO!");
        else if (colour.equals("amber")) System.out.println("Prep");
        else if (colour.equals("red")) System.out.println("Wait");

        System.out.println("Enter a number from 1 - 12:");
        String month = scan.nextLine();

        switch (month) {
            case "12":
            case "1":
            case "2":
                System.out.println("It's winter");
                break;
            case "3":
            case "4":
            case "5":
                System.out.println("It's spring");
                break;
            case "6":
            case "7":
            case "8":
                System.out.println("It's summer");
                break;
            case "9":
            case "10":
            case "11":
                System.out.println("It's autumn");
                break;
            default:
                System.out.println("That ain't a month, bruh.");
        }
    }
}
