package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Add a number: ");
        var number = scanner.nextInt();
        var result = 0;
        var i = 1;

        for (i = 1; i < 11; i++) {
            result = i * number;
            System.out.println(i + " X " + number + " = " + result);
        }

        i = 1;
        System.out.println("*********************************************");

        while (i < 11) {
            result = i * number;
            System.out.println(i + " X " + number + " = " + result);
            i++;
        }

        i = 1;
        System.out.println("*********************************************");

        do {
            result = i * number;
            System.out.println(i + " X " + number + " = " + result);
            i++;
        } while (i < 11);
    }

}