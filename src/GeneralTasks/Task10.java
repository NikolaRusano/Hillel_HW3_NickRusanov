package GeneralTasks;

import java.util.Scanner;

// Написать метод, используя switch, который принимает в себя номер пальца -
//переменную типа int и в зависимости от номер выводит название пальца (1-”большой”
//и т д)
public class Task10 {
    public int finNum;

    public String NameofFinger(int finNum) {
        String resFingName;
        switch (finNum) {
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
                break;
            case 5:
                resFingName = "Little finger";
                break;
            default:
                resFingName = "There isn't exist such finger. Invalid input";
                break;
        }
        return resFingName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Finger number 1 - 5:");
        Task10 t10 = new Task10();
        t10.finNum = scanner.nextInt();


        System.out.println("The inputted finger name is: " + t10.NameofFinger(t10.finNum));
        scanner.close();

    }
}
