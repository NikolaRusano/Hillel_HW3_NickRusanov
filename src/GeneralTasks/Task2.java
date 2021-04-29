package GeneralTasks;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

//Написать программу с названием “CheckOddEven”, которая печатает “Odd Number”
//если переменная “number” типа int нечетная. Или “Even Number” если переменная
//четная. Программа всегда должна перед выходом печатать “BYE”
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for Odd evev check:");
        int checkOddEven = scanner.nextInt();
        if(checkOddEven%2 != 0){
            System.out.println("Odd number");
        }else if(checkOddEven%2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Inncorect input");
        }
        System.out.println("\n BYE");
        scanner.close();
    }

}
