package org.example;

public class Lorry {

    public static void main (String[] args) {
        System.out.println("This is a Lorry class");

        // Creating an object of the class

        Volvo vn = new Volvo();
        Toyota tn = new  Toyota();

        tn.display();
        tn.show("Toyota", "CLE", "&8JK", 2021);

    }
}
