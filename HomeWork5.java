package artcode.hometask1;

/**
 * Created by Zaga on 08.04.17.
 */
public class HomeWork5 {
    public static void main(String[] args) {

        int a = 4;
        int b = 8;
        int sum = a + b;

        if (sum > 11 && sum < 19){
            System.out.println(" Сумма двух чисел ровна " + sum);
        } else {
            System.out.println("Сумма двух чисел вне диапазона от 11 до 19");
        }
    }
}
