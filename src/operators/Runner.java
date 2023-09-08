package operators;

public class Runner {



    public static void main(String[] args) {
        int i = 12;

        System.out.println(i + 2); // 14
        System.out.println(i); // 12

        System.out.println(i = i + 2);
        System.out.println(i);
        // overwriting i with a new value
        i = i + 2;

        String s = "\"Java is the best language ever\" - jordan h";

        System.out.println(12 + 12);
        System.out.println(12 * 12);
        // truncates to 1 as it's an int
        System.out.println(12 / 7);
        // doesn't truncate as 7 is now a float
        System.out.println(12 / 7F);

        System.out.println(12 - 12);

        System.out.println(12 % 5);

        System.out.print("I:");
        System.out.println(i);

        i += 2; // i = i + 2

        System.out.print("I:");
        System.out.println(i);

        i++; // i += 1, i = i + 1


        System.out.print("I:");
        System.out.println(i);

        i--;


        System.out.print("I:");
        System.out.println(i);

        System.out.print("I++:");
        System.out.println(i++); // print THEN increment

        System.out.print("I:");
        System.out.println(i);


        System.out.print("++I:"); // increment THEN print
        System.out.println(++i);

        System.out.print("I:");
        System.out.println(i);
        // concatenates the strings (adds them together)
        System.out.println("Hello, " + "World!");


        boolean b;
//        cannot access a local variable that hasn't been given a value
//        System.out.println(b);
    }
}
