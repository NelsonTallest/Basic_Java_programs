package org.example;

public class Volvo extends Toyota{
    @Override

    public String show(String name, String brand, String model, int year) {
        name = "Volvo";
        brand = "XC90";
        model = "T8";
        year = 2023;
        //String team = "American Volvo Team";
        return super.show(name, brand, model, year);






    }

    public String info(){
        String team = "American Volvo Team";
        return display();
    }
}
