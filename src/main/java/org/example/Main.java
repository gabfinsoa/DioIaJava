package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Add the Square side: ");
        var squareSide = scanner.nextInt();
        squareSide *= squareSide;
        System.out.println("Square area = " + squareSide);

    }

}