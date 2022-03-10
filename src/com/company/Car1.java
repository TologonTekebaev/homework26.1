package com.company;

public class Car1 {
    private int yearOfIssue;
    private String model;
    private int price;
    private String color;

    public Car1(){}

    public Car1(int yearOfIssue, String model, int price, String color) {
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "yearOfIssue=" + yearOfIssue +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

   /* Car деген класс тузунуз (Id, номер авто)
    Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
    HashMap тузунуз ключ - машина, маани - машинанын данныйлары
    HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.*/

