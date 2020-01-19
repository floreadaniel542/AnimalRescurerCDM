package org.fasttrackit;

public class Shop {

   private String name;
   private double weight;
   private double price;
   private int stock;
   private int maxStock;
   private double lenght;
   private double width;
    java.util.Date expirationDate;

    public void foods (Animal animal, double stocks ) {
        if ( stocks <= 0) {
            System.out.println(" The stocks is done.");
        }

        if (stocks > maxStock ) {

            System.out.println(" The stock is full " + maxStock );
        }

    }

   public Shop(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(int maxStock) {
        this.maxStock = maxStock;
    }
}
