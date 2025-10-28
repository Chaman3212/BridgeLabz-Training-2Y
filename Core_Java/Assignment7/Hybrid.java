package Assignment7;

public class Hybrid {
    // Hybrid Inheritance Example
    interface Worker {
        void performDuties();
    }

    class Person {
        String name;
        int id;

        Person(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }

    class Chef extends Person implements Worker {
        Chef(String name, int id) {
            super(name, id);
        }

        @Override
        public void performDuties() {
            System.out.println(name + " (Chef) is cooking delicious meals.");
        }
    }

    class Waiter extends Person implements Worker {
        Waiter(String name, int id) {
            super(name, id);
        }

        @Override
        public void performDuties() {
            System.out.println(name + " (Waiter) is serving customers.");
        }
    }

    public class HybridInheritanceDemo {
        public static void main(String[] args) {
            Worker w1 = new Chef("Ramesh", 101);
            Worker w2 = new Waiter("Suresh", 102);

            w1.performDuties();
            w2.performDuties();
        }
    }

}
