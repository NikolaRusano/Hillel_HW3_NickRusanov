package GeneralTasks;

import java.util.Scanner;

//Написать программу, которая сравнивает два числа типа int и определяет, какое из
//чисел большее, а какое меньшее. Программа должна вывести что-то типа “The number
//x has the greatest value”. Где “x” одно из чисел

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise;
        do {

            System.out.println("Check option of task:\n" +
                    "1 - by using ternary operation\n" +
                    "2 - by using if else conditions\n" +
                    "0 - exit menu");
            choise = scanner.nextInt();
            if (choise == 1) {
                System.out.println("Input numbers x please");
                int x = scanner.nextInt();
                System.out.println("and y please:");
                int y = scanner.nextInt();
                String msg = x > y ? "The number x - " + x + " has the greatest value" : (x < y ? "The number y - " + y
                        + "has the greatest value" : (x == y ? "The number x - " + x + " and number y - " + y +
                        " are equal" : "Incorrect input"));
                System.out.println(msg);
            } else if (choise == 2) {
                System.out.println("Input numbers x please");
                int x = scanner.nextInt();
                System.out.println("and y please:");
                int y = scanner.nextInt();
                if (x > y) {
                    System.out.println("The number x - " + x + "has the greatest value");
                } else if (x < y) {
                    System.out.println("The number y -" + y + "has the greatest value");
                } else if (x == y) {
                    System.out.println("The number x -" + x + "and number y - " + y + "are equal");
                } else {
                    System.out.println("Incorrect input");
                }

            }
        } while (choise != 0);
        scanner.close();
    }
}

