package artcode.hometask1;

/**
 * Created by Zaga on 08.04.17.
 */
public class HomeWork9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers and you will know the biggest and smallest");

        System.out.println("your first number");
        int a = scanner.nextInt();
        System.out.println("your second number");
        int b = scanner.nextInt();
        System.out.println("your third number");
        int c = scanner.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " is the biggest number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the biggest number.");
        } else {
            System.out.println(c + " is the biggest number.");
        }

        if (a <= b && a <= c) {
            System.out.println(a + " is the smallest number.");
        } else if (b <= a && b <= c) {
            System.out.println(b + " is the smallest number.");
        } else {
            System.out.println(c + " is the smallest number.");
        }
    }
}
