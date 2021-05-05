package GeneralTasks;

import java.util.Scanner;

//Даны три различных числа. Определить, какое из них (первое, второе или третье) -
//самое большое - самое маленькое - является средним
public class Task5Adv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 3 numbers for comparison: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a > b) & (a > c)) {
            System.out.println("The first number is biggest");
        } else if ((b > a) & (b > c)) {
            System.out.println("The second number is biggest");
        } else if ((c > a) & (c > b)) {
            System.out.println("The third number is biggest");
        } else if ((b == a) & (b == c)) {
            System.out.println("All 3 numbers are equal");
        } else if ((a == b) & (a > c)) {
            System.out.println("The first and second number are equal and bigger than third");
        } else if ((b > a) & (b == c)) {
            System.out.println("The second and third number are equal and bigger than first");
        } else {
            System.out.println("Incorrect input");
        }

    }

}


