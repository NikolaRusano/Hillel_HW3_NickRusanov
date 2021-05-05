package GeneralTasks;

import java.util.Scanner;

//Даны три различных числа. Определить, какое из них (первое, второе или третье) -
//самое большое - самое маленькое - является средним
public class Task5Adv {
    public static void main(String[] args) {
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

                    System.out.println("Input 3 numbers for comparison: ");
                    int num = scanner.nextInt();
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();
                    if (a > b & a > c){

                    }

                }
            }while (choise != 0);
    }
}
