package Assignment8;

public class AnimalHar {
    class Animal { public void sound(){ System.out.println("Animal sound"); } }
    class Dog extends Animal { public void sound(){ System.out.println("Dog barks"); } }
    class Cat extends Animal { public void sound(){ System.out.println("Cat meows"); } }

    class AnimalUtil {
        public static void printAnimals(List<? extends Animal> animals) {
            for (Animal a : animals) a.sound();
        }
    }

}
