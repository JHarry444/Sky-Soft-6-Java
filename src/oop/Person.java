package oop;

public class Person {

    // attributes -> instance variables
    // don't need values
    // will default to either false/ /0/null
    private String name;

    private int age;

    private String job;

    private String hairColour;

    private static String latinName = "Homo Sapien";

    // No return type?
    // constructs a new instance of Person
    // default constructor
    public Person() {

    }

//    public Person(String name, String job, int age) {
//        this.name = name;
//        this.age = age;
//        this.job = job;
//    }
//  Can NOT have two methods with the same 'signature' -> same types in same order
    public Person(String job, String name, int age) {
        this.name = name;
        this.age = age;
        this.job = job;
    }


    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    // overloaded constructor -> same name but different parameters
    public Person(String name, int age, String jobTitle, String hairColour) {
        this.name = name;
        this.age = age;
        // parameter CAN have a different name but doesn't usually
        job = jobTitle;
        this.hairColour = hairColour;
    }

    public String toString() {
        return "Hello, my name is " + name + " and I am a " + age + " years old " + job + " with " + hairColour + " hair";
    }

    public static void setLatinName(String latinName) {
        Person.latinName = latinName;
    }

    // cannot access non-static variables
    public static String getLatinName() {
        return latinName;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // this -> current object
        // distinguishes instance variables from local variables
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 111) {
            System.out.println("Invalid age: " + age);
        } else {
            this.age = age;
        }
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }
}
