package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Imprimir pares   ou    i+=2
        for (var i = 1; i <= 100; i++) {
            if (i % 2 == 1) continue;
            System.out.println("Number: " + i);
        }

        // Print name till the name be equal to "Exit"
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.printf("Your name: ");
            var name = scanner.next();

            if (name.equalsIgnoreCase("exit")) break;
            System.out.println("Name: " + name);
        }
    }

}