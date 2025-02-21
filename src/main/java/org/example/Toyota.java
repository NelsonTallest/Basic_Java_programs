package org.example;

public class Toyota extends Cars{
    //super(name, brand, model, year);
    @Override



    public String show(String name, String brand, String model, int year) {
        name = "Toyota";
        brand = "CLE";
        model = "&8JK";
        year = 2021;
        return super.show(name, brand, model, year);
    }


}
