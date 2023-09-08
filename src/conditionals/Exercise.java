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
    }
}
