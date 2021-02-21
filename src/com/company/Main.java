package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //task1
        System.out.println("Task №1");
        Methods example = new Methods();
        String [] arrayString = {"Я", "Лошадь"};
        Integer[] arrayInt = {1,4,6,7};
       	example.changeElement(arrayString, 0,1);
       	example.changeElement(arrayInt, 0,arrayInt.length-1);
        System.out.println(Arrays.toString(arrayString));
        System.out.println(Arrays.toString(arrayInt));
        //task №2
        System.out.println("Task №2");
        arrayString = new String[]{"Сам", "ты","Лошадь"};
        Double[] arrayDouble = new Double[]{3.0, 6.0, 3.14,2.25};
        ArrayList list = example.arrayToList(arrayDouble);
        System.out.println(list);
        System.out.println(example.arrayToList(arrayString));
        //task №3
        System.out.println("Task №3");
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box <Apple> box1 = new Box<>();
        Box <Orange> box2 = new Box<>();
        box1.addFruit(apple);
        box2.addFruit(orange);
        System.out.println(box1.getWightBox());
        System.out.println(box2.getWightBox());
        box1.addFruit(apple);
        System.out.println(box1.getWightBox());
        System.out.println(box1.compare(box2)? "Массивы равны":"Массивы не равны");
        Box <Orange> box3 = new Box<>();
        box3.addFruit(orange);
        box2.pourIntoBox(box3);
        System.out.println(box2.getWightBox());
        System.out.println(box3.getWightBox());
    }
}
