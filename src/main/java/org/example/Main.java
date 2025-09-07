package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Select a number between 1 and 7: ");
        var option = scanner.nextInt();
        var message = switch (option) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> {
                var day = option == 1 ? "Sunday" : "Saturday";
                yield String.format("Today is a holiday!", day);
            }
            default -> "Invalid option";
        };
        System.out.println(message);

            /*
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6, 7 -> System.out.println("Weekend!!!");
            default -> System.out.println("Invalid option");
             */

            /*
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend!!!");
                break;
            default:
                System.out.println("Invalid option");

             */

    }
}