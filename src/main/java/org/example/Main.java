package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var ageDifference = 0;

        System.out.printf("Person 1 - Name: ");
        var name1 = scanner.next();
        System.out.printf("Person 1 -  Age: ");
        var age1 = scanner.nextInt();
        System.out.printf("Person 2 - Name: ");
        var name2 = scanner.next();
        System.out.printf("Person 2 -  Age: ");
        var age2 = scanner.nextInt();

        if (age1 > age2) {
            ageDifference = age1 - age2;
        } else {
            ageDifference = age2 - age1;
        }

        System.out.printf("Age difference = " + ageDifference);


    }

}