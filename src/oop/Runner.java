package oop;

public class Runner {

    public static void main(String[] args) {
        Person me = new Person(); // creates an object of type Person
        // dot syntax -> access the members of an objects
        System.out.println(me.toString());
        me.setName("Jordan");
        me.setAge(29);
        me.setJob("Trainer");
        me.setHairColour("Black");

        System.out.println(me.toString());


        Person cameron =  new Person("Cameron", 30, "Trainer", "Brown");
        System.out.println(cameron.toString());

        // bad mojo
        System.out.println(me.getLatinName());
        System.out.println(cameron.getLatinName());

        // correct way to access a static variable
        Person.setLatinName("Homo Superior");

        // bad mojo
        System.out.println(me.getLatinName());
        System.out.println(cameron.getLatinName());

        System.out.println(me);

    }
}
