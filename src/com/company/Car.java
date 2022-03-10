package com.company;

public class Car {
    private int ID;
    private int numberOfCar;

    public Car(){}

    public Car(int ID, int numberOfCar) {
        this.ID = ID;
        this.numberOfCar = numberOfCar;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(int numberOfCar) {
        this.numberOfCar = numberOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + ID +
                ", numberOfCar=" + numberOfCar +
                '}';
    }
}
/* Car деген класс тузунуз (Id, номер авто)
    Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
    HashMap тузунуз ключ - машина, маани - машинанын данныйлары
        HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин
        консольго чыгарыныз.*/
