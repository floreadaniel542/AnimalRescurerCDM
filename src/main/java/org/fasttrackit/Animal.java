package org.fasttrackit;

public class Animal {

    private String name;
    private double age;
    private double height;
    private int hands;
    private int legs;
    private String skinColor;
    private String colorHair;
    private String eyesColor;
    private boolean happiness;
    private boolean sad;
    private double weight;

    private void happiness() {
        System.out.println(name + " is very happy ");
    }

    private void sad() {
        System.out.println(name + " is very sad ");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getHands() {
        return hands;
    }

    public void setHands(int hands) {
        this.hands = hands;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getColorHair() {
        return colorHair;
    }

    public void setColorHair(String colorHair) {
        this.colorHair = colorHair;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public boolean isHappiness() {
        return happiness;
    }

    public void setHappiness(boolean happiness) {
        this.happiness = happiness;
    }

    public boolean isSad() {
        return sad;
    }

    public void setSad(boolean sad) {
        this.sad = sad;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", hands=" + hands +
                ", legs=" + legs +
                ", skinColor='" + skinColor + '\'' +
                ", colorHair='" + colorHair + '\'' +
                ", eyesColor='" + eyesColor + '\'' +
                ", happiness=" + happiness +
                ", sad=" + sad +
                ", weight=" + weight +
                '}';
    }
}


