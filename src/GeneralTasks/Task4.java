package GeneralTasks;

import java.util.Scanner;

//Проверить, принадлежит ли число введенное с клавиатуры, интервалу (-5;3)
public class Task4 {
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

                System.out.println("Input number: ");
                int num = scanner.nextInt();
                String msg = (num > -5) & (num < 3) ? "The inputted number is in the range (-5;3)" :
                        "The inputted number is not in the range (-5;3)";
                System.out.println(msg);
            }
            System.out.println("Input number: ");
            int num = scanner.nextInt();
            if (choise == 2) {
                if ((num > -5) & (num < 3)) {
                    System.out.println("The inputted number is in the range (-5;3");
                } else if ((num < -5)) {
                    System.out.println("The inputted number is too low");
                } else if (num > 3) {
                    System.out.println("The inputted number is too big");
                } else {
                    System.out.println("Incorrect input");
                }
            }
        } while (choise != 0);
    }


}

