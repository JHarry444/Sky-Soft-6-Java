package variables;

public class Runner {

    public static void main(String[] args) {
        byte b = 127;
        short s = 246;
        int i = 210_000_000;
        long l = 999_999_999_999L;

        float f = 44.94F;
        double d = 99999999.999999999;

        char c = 'j';

        boolean bool = true;

        // Can create strings the easy way using literals
        // or use the new keyword like other objects
        String stringLiteral = "YO!";
        String string = new String("I'm an object");

        System.out.println(stringLiteral);
    }
}
