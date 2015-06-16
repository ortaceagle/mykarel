import java.util.Scanner;

/**
 * Created by robertmilcu on 03/06/15.
 */
public class Calculate {

    private String[] getString(){
        String[] output = new String[3];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type in your quadratic equation");
        System.out.println("Enter a");
        output[0] = keyboard.nextLine();
        System.out.println("Enter b");
        output[1] = keyboard.nextLine();
        System.out.println("Enter c");
        output[2] = keyboard.nextLine();

        return output;
    }

    private double evaluatePositive(double a, double b, double c) {
        double top, bottom = 0;
        top = -b + Math.sqrt(Math.pow(b, 2) - 4 * (a * c));
        bottom = 2 * a;
        return top / bottom;
    }

    private double evaluateNegative(double a, double b, double c) {
        double top, bottom = 0;
        top = -b - Math.sqrt(Math.pow(b , 2) - 4 * (a * c));
        bottom = 2 * a;
        return top / bottom;
    }



    private static void printAnswer(double positiveAnswer, double negativeAnswer) {
        // NaN = when math argument is invalud
        // Testing for NaN
        if (!Double.isNaN(positiveAnswer) || !Double.isNaN(negativeAnswer)) {
            System.out.println("Positive Answer: " + positiveAnswer);
            System.out.println("Negative Answer: " + negativeAnswer);
        }else {
            System.out.println("Is not factoriable.");
        }
    }


    public static void main (String[] args) {
        String[] numbers = new String[3];
        Calculate calcObj = new Calculate();
        numbers = calcObj.getString();

        double a, b, c = 0;
        a = Double.parseDouble(numbers[0]);
        b = Double.parseDouble(numbers[1]);
        c = Double.parseDouble(numbers[2]);

        double positiveAnswer, negativeAnswer = 0;
        positiveAnswer = calcObj.evaluatePositive(a, b, c);
        negativeAnswer = calcObj.evaluateNegative(a, b, c);

        calcObj.printAnswer(positiveAnswer, negativeAnswer);
    }
}
