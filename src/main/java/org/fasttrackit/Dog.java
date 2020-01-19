package org.fasttrackit;

public class Dog extends Animal {

    Shop shop;
    boolean cute;

    public Dog(Shop shop) {
        this.shop =  shop;
    }

    @Override
    public String toString() {
        return "Dog{" + " is very cute when you play with it=" + cute + '}';
    }
}
