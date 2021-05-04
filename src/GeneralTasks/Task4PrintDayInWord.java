package GeneralTasks;

import java.util.Scanner;
//Написать программу с названием “PrintDayInWord”, которая печатает “Sunday”,
//“Monday”, …. “Saturday”, если переменная “day” типа int будет 1, 2, 3, 4 … 7. В
//противном случае программа должна вывести “Not a valid day”. Решить задачу двумя
//способами: 1) с использованием if..else if 2) с использованием switch-case
public class Task4PrintDayInWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise;
        do {

            System.out.println("Check option of task:\n" +
                    "1 - by using ternary operation\n" +
                    "2 - by using switch case conditions\n" +
                    "3 - by using if else conditions\n" +
                    "0 - exit menu");
            choise = scanner.nextInt();
            if (choise == 1) {
                System.out.println("Input number please:");
                int num = scanner.nextInt();
                String msg = num == 1 ? "Sunday" : (num == 2 ? "Monday" : (num == 3 ?
                        "Tuesday" : (num == 4 ? "Wednesday" : (num == 5 ? "Thursday" : (num == 6 ?
                        "Friday" : (num == 7 ? "Saturday" :  "Not a valid day"))))));
                System.out.println(msg);


            } else if (choise == 2) {
                System.out.println("Input number please:");
                int num = scanner.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednesday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    case 7:
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("Not a valid day");
                        break;
                }
            }

            if (choise == 3) {
                System.out.println("Input number please:");
                int num = scanner.nextInt();
                if (num == 1) {
                    System.out.println("Sunday");
                } else if (num == 2) {
                    System.out.println("Monday");
                } else if (num == 3) {
                    System.out.println("Tuesday");
                } else if (num == 4) {
                    System.out.println("Wednesday");
                } else if (num == 5) {
                    System.out.println("Thursday");
                } else if (num == 6) {
                    System.out.println("Friday");
                } else if (num == 7) {
                    System.out.println("Saturday");
                }else {
                    System.out.println("“Not a valid day");
                }
            }

        }while (choise != 0);


        scanner.close();
    }
}
