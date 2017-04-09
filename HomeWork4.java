package artcode.hometask1;

import java.util.Scanner;

/**
 * Created by Zaga on 08.04.17.
 */
public class HomeWork4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Первая цифра");
        int a = scanner.nextInt();
        System.out.println("Вторая цифра");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(" Разница цифр ровна " + (a - b));
        } else {
            System.out.println(" Сумма чисел ровна " - (a + b));
        }


    }
}
