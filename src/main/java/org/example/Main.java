package org.example;

import java.util.Scanner;

public class Main {

    private final static String WELCOME_MSG = "Welcome to Scanner App";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MSG);
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Age:  ");
        int age = scanner.nextInt();
        System.out.println("Custumer details:  " + name + ", " + age);
        System.out.printf("Custumer details:  %s, %s", name, age);
    }
}