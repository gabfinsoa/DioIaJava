package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var flag = false;
        while (flag == false) {
            System.out.printf("Insira o 1º numero: ");
            var number1 = scanner.nextInt();
            System.out.printf("Insira o 2º numero: ");
            var number2 = scanner.nextInt();
            if (number1 < number2){
                System.out.printf("Par ou Impar?  ->  ");
                var decisao = scanner.next();
                var modResult = number2 % 2;
                if (decisao.equalsIgnoreCase("par")){
                    if(modResult == 0) {
                        while (number2 >= number1) {
                            System.out.println("Numero Par: " + number2);
                            number2-=2;
                        }
                    } else  {
                        number2 -= 1;
                        while (number2 >= number1) {
                            System.out.println("Numero Par: " + number2);
                            number2-=2;
                        }
                    }
                } else if (decisao.equalsIgnoreCase("impar")){
                    if(modResult == 0) {
                        number2 -= 1;
                        while (number2 >= number1) {
                            System.out.println("Numero Impar: " + number2);
                            number2-=2;

                        }
                    } else  {
                        while (number2 >= number1) {
                            System.out.println("Numero Impar: " + number2);
                            number2-=2;
                        }
                    }
                }
                flag = true;
            }else System.out.println("Segundo numero deve ser maior do que o primeiro.");
        }
    }

}