package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var isEmancipated = false;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Insert your name: ");
        var name = scanner.next();
        System.out.printf("Insert your age:  ");
        var age = scanner.nextInt();
        if (age < 18) {
            System.out.printf("Are you emancipated? (s/n): ");
            isEmancipated = scanner.next().equalsIgnoreCase("s");
        }

        if (age >= 18) {
            System.out.printf("%s, you are %s years old so you can drive!\n", name, age);
        } else if (age >= 16 && isEmancipated) {
            System.out.printf("%s, you are %s years old and Emancipated, so you can drive!\n", name, age);
        } else {
            System.out.printf("Sorry %s, you can't drive yet.\n", name);
        }
        System.out.println("-* Program finished *-");
    }

}