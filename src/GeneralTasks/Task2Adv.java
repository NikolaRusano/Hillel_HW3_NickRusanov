package GeneralTasks;

import java.util.Scanner;
import static java.lang.Math.sqrt;

//Известны площади круга и квадрата. Определить: уместится ли круг в квадрате
//уместится ли квадрат в круге
public class Task2Adv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input circle area:");
        double circleArea = scanner.nextDouble();
        System.out.println("Please input square area:");
        double squareArea = scanner.nextDouble();
        double aSide = sqrt(squareArea);
        double circleRadius = (sqrt(circleArea))/Math.PI;
        if (aSide < squareArea){
            System.out.println("The circle can be filled inside the square");

        }else if(aSide >= squareArea){
            System.out.println("The circle can't be filled inside the square");
        }


        scanner.close();
    }
}
