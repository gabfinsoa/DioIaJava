package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.printf("Your name: ");
            var name = scanner.next();

            if (name.equalsIgnoreCase("exit")) break;
            System.out.println("Name: " + name);
        }
    }

}