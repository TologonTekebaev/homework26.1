package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<Car, Car1> hashMap = new HashMap<>();
        hashMap.put(new Car(85769544, 759), new Car1(2019, "Toyota", 500000, "black"));
        hashMap.put(new Car(55567868, 856), new Car1(2021, "BMW", 1000000, "white"));
        for (Map.Entry<Car, Car1> elem: hashMap.entrySet()) {
            System.out.println(elem);
        }
    }
}
   /* Car деген класс тузунуз (Id, номер авто)
    Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
    HashMap тузунуз ключ - машина, маани - машинанын данныйлары
    HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин
    консольго чыгарыныз*/