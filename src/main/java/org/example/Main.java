package org.example;

import java.util.Scanner;

public class Main {

    private final static String WELCOME_MSG = "Welcome to Scanner App";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add the first number:  ");
        var number1 = scanner.nextFloat();
        System.out.print("Add the second number: ");
        var number2 = scanner.nextFloat();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.printf("%s + %s = %s\n", number1, number2, number1 + number2);
        System.out.printf("%s - %s = %s\n", number1, number2, number1 - number2);
        System.out.printf("%s / %s = %s\n", number1, number2, number1 / number2);
        System.out.printf("%s * %s = %s\n", number1, number2, number1 * number2);
        System.out.printf("%s %% %s = %s\n", number1, number2, number1 % number2);
        System.out.printf("Raiz quadrada de %s eh %s\n", number1, Math.sqrt(number1));
        System.out.printf("A potencia de %s ao %s eh %s\n", number1, number2, Math.pow(number1, number2));
    }
}