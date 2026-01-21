// OVERRIDING 
class Animal{
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
    @SuppressWarnings("unused")
    void name() {
        System.out.println("jack");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
    void name() {
        System.out.println("kitty");
    }

}

public class AnimalOverriding {

    public static void main(String[] args) {
        
        Animal d = new Dog();
        Cat c = new Cat();

        d.sound();
        // d.name(); // IT WILL SHOW ERROR !
        c.sound();
        c.name();
        
    }
    
}
