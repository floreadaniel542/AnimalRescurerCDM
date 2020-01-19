package org.fasttrackit;

public class App {
    public static void main(String[] args) {

        Playground playground = new Playground();
        playground.setLenght(100);
        playground.setWidth(100);

        Shop food1 = new Shop("Wiskas", 4.5);
        food1.setStock(21);
        food1.setWeight(30);
        food1.setMaxStock(1000);
        System.out.println(food1.expirationDate + "21.09.2020");

        Shop food2 = new Shop("Pedigree", 3.9);
        food2.setStock(30);
        food2.setWeight(20);
        food2.setMaxStock(1000);

        Cat cat = new Cat(food1);
        cat.setName("Fifi");
        cat.setSkinColor("Black with  white");
        cat.setEyesColor("Brown");
        cat.setHeight(30);
        cat.setColorHair("Black with white");
        cat.setLegs(4);
        cat.setAge(2);
        cat.setWeight(4);

        System.out.println(cat.mewos);

        Dog dog = new Dog(food2);
        dog.setName("Max");
        dog.setSkinColor("cream");
        dog.setEyesColor("Brown");
        dog.setHeight(40);
        dog.setColorHair("cream");
        dog.setLegs(4);
        dog.setAge(3);
        dog.setWeight(8);

        System.out.println(dog.cute);

        Rescurer rescurer1 = new Rescurer(cat);
        rescurer1.setName("Emma");
        rescurer1.setSkinColor("White");
        rescurer1.setEyesColor("Blue");
        rescurer1.setHands(2);
        rescurer1.setLegs(2);
        rescurer1.setAge(21);
        rescurer1.setColorHair("Reddish");
        rescurer1.setHeight(1.65);
        rescurer1.setWeight(55);
        rescurer1.setMaxHappy(100);
        rescurer1.setMaxFedUp(100);
        rescurer1.setLevelFood(200);
        rescurer1.setMoney(2000);
        System.out.println(rescurer1.isHappy());
        rescurer1.play(cat, 3, 30);

        Rescurer rescurer2 = new Rescurer(dog);
        rescurer2.setName("Mike");
        rescurer2.setSkinColor("Black");
        rescurer2.setEyesColor("Brown");
        rescurer2.setHands(2);
        rescurer2.setLegs(2);
        rescurer2.setAge(19);
        rescurer2.setColorHair("Black");
        rescurer2.setHeight(1.87);
        rescurer2.setWeight(79);
        rescurer2.setMaxFedUp(100);
        rescurer2.setMaxHappy(100);
        rescurer2.setLevelFood(200);
        rescurer2.setMoney(2000);

        rescurer2.play(dog,3,23);

        System.out.println(rescurer2.isSad());

        VeterinaryDoctor veterinaryDoctor = new VeterinaryDoctor();
        System.out.println(veterinaryDoctor.isSmile());


    }

}
