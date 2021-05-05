package GeneralTasks;
//Сумма покупки составляет а рублей. Если а больше 1000 рублей, то предоставляется
//скидка 15%. Вывести на экран сумму покупки с учетом скидки либо сообщение о том,
//что скидка не предоставляется.

import java.util.Scanner;

public class Task1Adv {
    public static void main(String[] args) {
        System.out.println("Input sum of the purchase");
        Scanner scanner = new Scanner(System.in);
        double sumPurchase = scanner.nextDouble();
        if (sumPurchase > 1000.0) {
            double sunDiscount =
                    sumPurchase = sumPurchase * 0.15;
            System.out.println("The sum purchase with discount will be - " + (sumPurchase - sunDiscount));

        } else if (sumPurchase < 1000.0) {
            System.out.println("The sum purchase will be without discount" + sumPurchase);

        } else {
            System.out.println("Incorrect input");
        }
        scanner.close();
    }
}
