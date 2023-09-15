package exceptions;

import oop.further.Vet;

import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {
//        main(null); StackOverflow


        // try-with-resources - always closes the resource at the end of the try
        try (Scanner scan = new Scanner(System.in);) {
            // Problems:
            // number too big
            // invalid number - NumberFormat
            // divide by zero - ArithmeticException
            try {
                System.out.println("Enter a number:");
                int num1 = Integer.parseInt(scan.nextLine());

                System.out.println("Enter a number:");
                int num2 = Integer.parseInt(scan.nextLine());

                System.out.println("Division: " + (num1 / num2));

            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            } catch (ArithmeticException ae) {
                System.out.println("Don't divide by 0 ya muppet");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("YO!");

        Vet v = new Vet();

        v.findByName("Rex");
    }
}
