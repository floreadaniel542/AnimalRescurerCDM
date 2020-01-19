package org.fasttrackit;

public class Cat extends Animal {

    Shop shop;
    boolean mewos;

    public Cat(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "Cat{" + " is happy when mewos=" + mewos + '}';
    }


}
