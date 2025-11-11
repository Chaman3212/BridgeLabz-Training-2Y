package Assignment8;

public class Storage {
    class Fruit { public String name; Fruit(String n){name=n;} }
    class Apple extends Fruit { Apple(String n){super(n);} }
    class Mango extends Fruit { Mango(String n){super(n);} }

    class FruitBox<T extends Fruit> {
        private List<T> fruits = new ArrayList<>();

        public void addFruit(T fruit) { fruits.add(fruit); }
        public void displayFruits() {
            for (T f : fruits) System.out.println(f.name);
        }
    }

}
