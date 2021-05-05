package GeneralTasks;
// Написать программу, которая бы решала уравнение вида a*x + b = 0 Переменные a
//и b можно задать вручную. Далее нужно будет посчитать и вывести значение “х”.
//Программа должна также учитывать варианты, когда или а = 0 или b = 0

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.println("Input a please");
        Scanner scanner = new Scanner(System.in);
        double a,b;
        a = scanner.nextDouble();
        System.out.println("Input b please");
        b = scanner.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("The linear equation doesn't have any solution");
            }else if (b != 0){
                System.out.println("The x = " + -1.0*b);
            }
        }else if (a != 0){
            if(b == 0){
                System.out.println("The x equal " + 1.0/a);
            }else if(b != 0){
                System.out.println("The x equal " + ((1.0/a)-b));
            }

        }else{
            System.out.println("Incorrect input");
        }
        scanner.close();
    }
}
