package org.example;

public class Cars {
    String name;
    String brand;
    protected String model;
    private String color;
    int year;
    String show(String name, String brand, String model, int year){

        this.year = year;
        this.name = name;
        this.brand = brand;
        this.model = model;
        return show(name, brand, model, year);

    }

    public String display(){
       return show(name, brand, model, year);
    }

}
