package artcode.hometask1;

/**
 * Created by Zaga on 08.04.17.
 */
public class HomeWork7 {
    public static void main(String[] args) {

        int a = 4;
        int b = 5;
        int c = 7;

        int a1 = a * a;
        int b1 = b * b;
        int c1 = c * c;

        if (c1 == (a1 + b1)){
            System.out.println("Треугольник прямоугольный");
        } else {
            System.out.println("Треугольник не прямоугольный");
        }
    }
}
