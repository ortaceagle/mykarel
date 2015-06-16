import java.util.Scanner;

/**
 * Created by robertmilcu on 26/05/15.
 */
public class Countdown {

    public static void switchNumber(int number) {
        switch (number) {
            case 1:
                System.out.println("One is no fun");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                while (number > 0) {
                    System.out.println(number);
                    number--;
                }
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Get Ready For This!");
                while (number > 0) {
                    System.out.println(number);
                    number--;
                }
                break;
            default:
                break;
        }
    }

    public static void main (String[] args) {
        int number = 1;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number between 1 & 10");
        while (keyboard.hasNextInt()) {
            number = keyboard.nextInt();
            if (number < 1 || number > 10) {
                System.out.printf("Invalid Number %d, type another one\n" , number);
            } else {
                break;
            }
        }

        switchNumber(number);
    }
}
