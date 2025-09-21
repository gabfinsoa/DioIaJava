package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        do {
            System.out.printf("Add your name: ");
            name = scanner.next();
            System.out.println("Wrote name  ->  " + name);

            if (name.equalsIgnoreCase("exit")) break;
        } while (name.equalsIgnoreCase("exit"));

        /*
         while (!name.equalsIgnoreCase("exit")){
            System.out.printf("Add your name: ");
            name = scanner.next();
            System.out.println("Wrote name  ->  " + name);
        }

        while (true){
            System.out.printf("Add your name: ");
            name = scanner.next();
            System.out.println("Wrote name  ->  " + name);

            if (name.equalsIgnoreCase("exit")) break;
        }

        */
    }

}