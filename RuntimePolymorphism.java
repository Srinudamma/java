// Superclass
class Animal {
    // Method to make sound
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class RuntimePolymorphism {
    public static void main(String[] args) {
        // Create objects of Animal, Dog, and Cat
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call makeSound method on each object
        animal.makeSound(); // Output: Animal makes a sound
        dog.makeSound();    // Output: Dog barks
        cat.makeSound();    // Output: Cat meows
    }
}
