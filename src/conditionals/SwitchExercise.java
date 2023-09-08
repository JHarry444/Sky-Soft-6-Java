package conditionals;

import java.util.Scanner;

public class SwitchExercise {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
