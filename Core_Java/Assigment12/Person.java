package Assigment12;

package com.bridgelabz.oops.levelone;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Rohan", 20);
        Person p2 = new Person(p1); // cloning

        p1.display();
        p2.display();
    }
}

