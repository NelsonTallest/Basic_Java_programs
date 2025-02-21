package org.example;

public class ModulusClass {

    public static void main (String args[]){

        double first_num = 55;
        double second_num = 9;
        double result = first_num +second_num;

        System.out.println("The sum of first_num and second_num is: " + result);
        double modulus = result % second_num;
        System.out.println("The modulus of the sum and second_num is: " + modulus);
    }
}
