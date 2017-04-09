package artcode.hometask1;

import java.util.Scanner;

/**
 * Created by Zaga on 08.04.17.
 */
public class HomeWork3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводим число с запятой от 0 до 1");
        float a = scanner.nextFloat();

        if (a >= 0 && a <= 1){
            System.out.println("Число от 0 до 1");
            } else {
            System.out.println(" Число не входит в диапазон от 0 до 1");
        }
    }
}
