// Define an Animal interface with a method called bodylanguage
interface Animal {
    void bodylanguage();
}

// Define the Cow class that extends Horse and implements the Animal interface
class Cow extends Horse {
    // Implement the bodylanguage method for Cow
    public void bodylanguage() {
        System.out.println("Cows give head butts and squeezes when attacked");
    }
}

// Define the Horse class that extends Cat
class Horse extends Cat {
    // Implement the bodylanguage method for Horse
    public void bodylanguage() {
        System.out.println("Horses kick with their hind legs when attacked");
    }
}

// Define the Cat class that extends Dog
class Cat extends Dog {
    // Implement the bodylanguage method for Cat
    public void bodylanguage() {
        System.out.println("Cats scratch when they feel attacked");
    }
}

// Define the Dog class
class Dog implements Animal {
    // Implement the bodylanguage method for Dog
    public void bodylanguage() {
        System.out.println("Dogs bark and bite");
    }
}

public class CLASS4 {
    public static void main(String[] args) {
        // Create objects of each class
        Cow cow = new Cow();
        Horse horse = new Horse();
        Cat cat = new Cat();
        Dog dog = new Dog();

        // Call the bodylanguage method on each object
        System.out.println("Cow:");
        cow.bodylanguage();

        System.out.println("Horse:");
        horse.bodylanguage();

        System.out.println("Cat:");
        cat.bodylanguage();

        System.out.println("Dog:");
        dog.bodylanguage();
    }
}
