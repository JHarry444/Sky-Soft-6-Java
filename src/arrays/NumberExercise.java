package arrays;

public class NumberExercise {


    public static void main(String[] args) {
        System.out.println(addDigits(76));
        System.out.println(addDigits(54));
        System.out.println(addDigits(32));
    }

    public static int addDigits(int num) {
        if (num < 10 || num > 99)
            return -1;
        else {
            return num / 10 + num % 10;
        }
    }

}
