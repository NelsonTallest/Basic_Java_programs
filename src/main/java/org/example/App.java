package org.example;

import java.util.Scanner;

public class App{

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the First Number: " );
        double first_num = sn.nextDouble();

        System.out.println("Enter the Second Number: ");
        double second_num = sn.nextDouble();

        double result = first_num / second_num;

        System.out.println("\n The result is " + result);






    }
}