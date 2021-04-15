package com.samuelvazquez.arraylist;

import java.util.ArrayList;

/*
Most common methods for ArrayList in Java
 */
public class Main {
    public static void main(String[] args) {
        //How to declare an ArrayList in Java
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Chevrolet");
        cars.add("Kia");

        ArrayList<String> cars2 = new ArrayList<>();
        cars2.add("Lamborghini");
        cars2.add("Bugatti");

        //1. Adding methods to the list
        //1.1 Add specified element to the end of the list
        cars.add("Nissan");
        //1.2 Add specified element at the specified position
        //could be any position should be inside the length of the list, avoid out of bounds positions
        cars.add(1,"Smart");
        //1.3 Add all the elements a list to the another list
        cars.addAll(cars2);

        //2. Getting the size of the list
        int size = cars.size();
        System.out.println("Size of the list: " + size);

        //3. Removing elements from the list
        //3.1 Remove the specified object from the list, by object or index
        cars.remove("Chevrolet");
        cars.remove(7);
        //3.2 Remove all the elements from the list
        ArrayList<String> cars3 = new ArrayList<String>(cars);
        cars3.clear();
        //3.3 Remove elements from an specific range
        ArrayList<String> cars4 = new ArrayList<String>(cars);
        cars4.subList(4,6).clear();

        //4. Searching elements in the List
        //4.1 Search the specified element, return false if the specified element is not found
        cars.contains("Fiat");
        //4.2 Returns the index of the first occurrence of the specified element
        cars.indexOf("BMW");

        //5. Replaces the element at the specified position with the new element
        cars.set(3,"Nissan");
    }
}
