package conditionals;

import java.util.Scanner;

public class CalcExercise {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scan.nextInt();
        System.out.println("Enter a number:");
        int num2 = scan.nextInt();
        System.out.println("Gimme an operator:");
        String op = scan.next();

        switch (op) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid operator: " + op);
        }
    }
}
