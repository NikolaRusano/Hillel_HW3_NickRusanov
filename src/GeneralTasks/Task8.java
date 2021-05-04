package GeneralTasks;

import java.util.Scanner;

// Написать программу, которая выведет в консоль если количество продаж больше 10
//сообщение что менеджер заработал бонус, если меньше, то выполнит расчёт сколько
//осталось продаж до получения бонуса

public class Task8 {
    public static void main(String[] args) {

        float basicSalary = 1000.0f, bonusSalary = 250.0f;
        Scanner scanner = new Scanner(System.in);
        int choise;
        do {

            System.out.println("Check option of task:\n" +
                    "1 - by using ternary operation\n" +
                    "2 - by using if else conditions\n" +
                    "0 - exit menu");
            choise = scanner.nextInt();
            if (choise == 1) {

                System.out.println("Input number sales of the sales manages please");
                int numSales = scanner.nextInt();
                String msg = numSales > 10 ? "The sales manager will get salary bonus" : (numSales <= 10 ?
                        "The sales manager last - " + (11 - numSales) + " sales before salary bonus" : "Invalid input");
                System.out.println(msg);
            } else if (choise == 2) {
                System.out.println("Input number sales of the sales manages please");
                int numSales = scanner.nextInt();
                if (numSales > 10){
                    System.out.println("The sales manager will get - " + basicSalary + bonusSalary + " $");
                }else if(numSales <= 10){
                    System.out.println("The sales manager will get - " + basicSalary + " $");
                }else{
                    System.out.println("Invalid input");
                }
            }
        } while (choise != 0);
    }
}

