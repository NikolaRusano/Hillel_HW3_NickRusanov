package GeneralTasks;

import java.util.Scanner;

//Определить, является ли число а делителем числа b
public class Task3Adv {
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

                System.out.println("Input numbers: dividend - ");
                int dividend = scanner.nextInt();
                System.out.println("and divisor");
                int divisor = scanner.nextInt();
                String msg = (dividend % divisor) > 0 ? "The divisor " + divisor + " is not divisor of number " + dividend :
                        "The divisor " + divisor + " divisor of number " + dividend;
                System.out.println(msg);
                if (choise == 2) {
                    if (dividend % divisor != 0) {
                        System.out.println("The divisor - " + divisor + " is not divisor of number - " + dividend);
                    } else if (dividend % divisor == 0) {
                        System.out.println("The divisor - " + divisor + "  divisor of number - " + dividend);
                    }
                }
            }
        }while (choise != 0);
    }
}
