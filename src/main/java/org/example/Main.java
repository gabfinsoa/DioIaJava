package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        var currentYear = 2025;

        System.out.printf("What's your name? ");
        var name = scanner.next();
        System.out.printf("When did you born (YYYY)? ");
        var year = scanner.nextInt();

        var ageResult = currentYear - year;

        System.out.printf("Hi %s, you are %s years old.", name, ageResult);
    }
}