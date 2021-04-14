package com.samuelvazquez.classes;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car tsuru = new Car();
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());
        porsche.setDoors(5);
        System.out.println(porsche.getDoors());
    }
}
