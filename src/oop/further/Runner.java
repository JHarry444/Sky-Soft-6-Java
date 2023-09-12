package oop.further;

public class Runner {

    public static void main(String[] args) {
        Dog d = new Dog();

        d.setName("Rex");
        d.setAge(8);
        d.setNoOfLegs(4);

        System.out.println(d);
        d.speak();
//        d.speak(false); // can't use the dog method as it isn't available in Animal
        d.wag();
        // limited to just animal members as java only sees your 'label'
        // and your 'label' says it's an animal
        Animal a = d;

//        a.wag();


        Animal c = new Cat("Tiddles", 6 , 6, 16, 4);

        System.out.println(c);
        c.speak();

        Vet v = new Vet();

        v.addAnimal(d);
        v.addAnimal(c);
        v.addAnimal(new Pelican());

        System.out.println(v);

        v.poke();
    }
}
