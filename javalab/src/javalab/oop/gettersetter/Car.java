package javalab.oop.gettersetter;

public class Car {
    private final String model;
    private String color;
    private double price;
    private final int year;


    // constructor
    public Car(String model, String color, double price, int year) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    // getters
    String getModel() {
        return model;
    }
    String getColor() {
        return color;
    }
    double getPrice() {
        return price;
    }
    int getYear() {
        return year;
    }

    // setters
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }
}
