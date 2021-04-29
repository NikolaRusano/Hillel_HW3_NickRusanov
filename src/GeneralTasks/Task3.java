package GeneralTasks;

import java.util.Scanner;

//Написать программу с названием “PrintNumberInWord”, которая напечатает “ONE”,
//“TWO”, …, “NINE”, “OTHER” если переменная “number” типа int будет 1, 2, 3, 4, … 9, или
//любой другой
//. Решить задачу двумя способами: 1) с использованием if..else if 2) с использованием
//switch-case
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise;
        do {

            System.out.println("Check option of task:\n" +
                    "1 - by using if else conditions\n" +
                    "2 - by using switch case conditions\n" +
                    "0 - exit menu");
            choise = scanner.nextInt();
            if(choise ==1){
                System.out.println("Input number please:");
                int num = scanner.nextInt();
                String msg = num == 1 ? "ONE" : (num == 2 ? "TWO" : (num == 3 ?
                        "THREE" : (num == 4 ? "FOUR" : (num == 5 ? "FIVE" : (num == 6 ?
                        "SIX" : (num == 7 ? "SEVEN" : (num == 8 ? "EIGHT" : (num == 9 ?
                        "NINE" : "OTHER"))))))));
                System.out.println(msg);


            }else if(choise == 2){
                System.out.println("Input number please:");
                int num = scanner.nextInt();
                switch (num){
                    case 1:
                        System.out.println("ONE");
                        break;
                    case 2:
                        System.out.println("TWO");
                        break;
                    case 3:
                        System.out.println("THREE");
                        break;
                    case 4:
                        System.out.println("FOUR");
                        break;
                    case 5:
                        System.out.println("FIVE");
                        break;
                    case 6:
                        System.out.println("SIX");
                        break;
                    case 7:
                        System.out.println("SEVEN");
                        break;
                    case 8:
                        System.out.println("EIGHT");
                        break;
                    case 9:
                        System.out.println("NINE");
                        break;
                    default:
                        System.out.println("OTHER");
                        break;
                }


            }
            }while (choise != 0);


        scanner.close();
        }

}
