package artcode.hometask1;

import java.util.Scanner;

/**
 * Created by Zaga on 08.04.17.
 */
public class HomeWork2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текущее время");
        int time = scanner.nextInt();

        if (time > 18 && time < 24 || time > 0 && time < 9){
            System.out.println("Я отдыхаю");
        } else if (time >= 9 && time <= 18) {
            System.out.println("Я на работе");
        }
    }
}
