package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var flag = false;

        do {
            System.out.println("Por favor, preencha os dados corretamente:");
            System.out.printf("Nome   : ");
            var name = scanner.next();
            System.out.printf("Peso   : ");
            var peso = scanner.nextDouble();
            System.out.printf("Altura : ");
            var altura = scanner.nextDouble();
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-");

            if (name.length() > 2 && peso > 0.5 && altura > 0.5) {
                flag = true;
            }

            if (flag = true) {
                var IMC = peso / (altura * altura);
                if (IMC <= 18.5) {
                    System.out.println("Abaixo do peso!");
                } else if (IMC > 18.5 && IMC <= 24.9 ) {
                    System.out.println("Peso ideal!");
                } else if (IMC > 24.9 && IMC <= 29.9 ) {
                    System.out.println("Um pouco acima do peso!");
                } else {
                    System.out.println("Muito acima do peso   =(");
                }
            }
        } while (flag == false);
    }
}