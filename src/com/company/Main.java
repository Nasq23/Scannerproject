package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//
        String firstInitial;
        String lastName;
        Integer houseNumber;
        String streetName;
        String streetType;
        String city;

        String a = ""; //declare and initialize
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your first Initial");
        firstInitial= key.nextLine();
        System.out.println("Enter your last Name");
        lastName= key.nextLine();
        System.out.println("Enter your house Number");
        houseNumber= key.nextInt();
        System.out.println("Enter your street Name");
        streetName= key.nextLine();
        System.out.println("Enter your streetType");
        streetType= key.nextLine();
        System.out.println("Enter your city");
        city= key.nextLine();


        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
