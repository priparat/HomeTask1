package artcode.hometask1;

/**
 * Created by Zaga on 08.04.17.
 */

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число делимое на 7");
        int a = scanner.nextInt();

        if (a % 7 == 0) {
            System.out.println("twice value is " + a * 2);
        } else {
            System.out.println("Это число не делится на 7");
        }
    }

}
