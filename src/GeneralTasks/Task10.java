package GeneralTasks;

import java.util.Scanner;

// Написать метод, используя switch, который принимает в себя номер пальца -
//переменную типа int и в зависимости от номер выводит название пальца (1-”большой”
//и т д)
public class Task10 {
    public String NameofFinger(int num){
        String resFingName;
        switch (num){
            case 1:
                resFingName = "Thumb";
                break;
            case 2:
                resFingName = "Forefinger";
                break;
            case 3:
                resFingName = "Middle finger";
                break;
            case 4:
                resFingName = "Ring finger";
            case 5:
                resFingName = "Little finger";
            default:
                resFingName = "There isn't exist such finger. Invalid input";
        }
        return resFingName;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Finger number 1 - 5:");
        int finNum = scanner.nextInt();
        Task10 t10 = new Task10();

        System.out.println("The inputted finger name is: " t10.NameofFinger(finNum));
        scanner.close();

    }
}
