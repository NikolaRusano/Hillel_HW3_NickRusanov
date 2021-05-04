package GeneralTasks;


import java.util.Scanner;

//Получение ипотеки
//Имеем 2 переменные - возраст мужа и жены
//Написать программу, которая выводит в консоль результат.
//Задачу решить используя вложенный if (сначала проверить возраст жены, потом мужа)
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int husAge, wifeAge;
        System.out.println("Input the husnand age");
        husAge = scanner.nextInt();
        if (husAge < 35){
            wifeAge = scanner.nextInt();
            if(wifeAge < 35){
                System.out.println("The family can be gotten mortgage");
            }else if(wifeAge >= 35) {
                System.out.println("The family can't be gotten mortgage");
            }else{
                System.out.println("Incorrect input");
            }
        }else if (husAge >= 35){
            System.out.println("The family can't be gotten mortgage");
        }else {
            System.out.println("Incorrect input");
        }
       scanner.close();
    }
}
