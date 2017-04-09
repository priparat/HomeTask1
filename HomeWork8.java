package artcode.hometask1;

/**
 * Created by Zaga on 08.04.17.
 */
public class HomeWork8 {
    public static void main(String[] args) {

        int numOne = 3;
        int numTwo = 6;
        int numThree = 9;

        if (numOne >= numTwo && numOne >= numThree){
            System.out.println("Самое большое число" +  numOne);
        } else if (numTwo >= numOne && numTwo >= numThree){
            System.out.println("Самое большое число" +  numTwo);
        } else  if (numThree >= numOne && numThree >= numTwo){
            System.out.println("Самое большое число" +  numThree);
        }

        if (numOne <= numTwo && numOne <= numThree){
            System.out.println("Самое маленькое число" +  numOne);
        } else if (numTwo <= numOne && numTwo <= numThree){
            System.out.println("Самое маленькое число" +  numTwo);
        } else  if (numThree <= numOne && numThree <= numTwo){
            System.out.println("Самое маленькое число" +  numThree);

        }
    }
}
