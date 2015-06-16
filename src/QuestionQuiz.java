/**
 * Created by robertmilcu on 26/05/15.
 */
import java.util.Scanner;

public class QuestionQuiz {

    public static void main (String[] args) {


        Scanner keyboard = new Scanner(System.in);

        int counter = 0; //This will be the counter
        int first_question, second_question, third_question;
        String answer;


        System.out.print("Are you ready for a quiz? ");
        answer = keyboard.next();
        System.out.println("Okay, here it comes");


        System.out.println("\nQ1) What is the capital of Alaska?");
        System.out.println("\t1) Melbourne");
        System.out.println("\t2) Anchorage");
        System.out.println("\t3) Juneau");
        System.out.print("\n> ");
        first_question = keyboard.nextInt();

        if (first_question == 3) {
            System.out.println("\nThat's right");
            counter++;
        } else {
            System.out.println("\nSorry, that's not the correct answer!");
        }


        System.out.println("\nQ2) Can you store the value \"cat\" in a variable of type int?");
        System.out.println("\t 1) Yes");
        System.out.println("\t 2) No");
        System.out.print("\n> ");
        second_question = keyboard.nextInt();

        if (second_question == 2) {
            System.out.println("\nYou are correct");
            counter++;
        } else {
            System.out.println("\nSorry, \"cat\" is a string. ints can only store numbers.");
        }


        System.out.println("\nQ3) What is the result of 9+6/3?");
        System.out.println("\t1) 5");
        System.out.println("\t2) 11");
        System.out.println("\t3) 15/3");
        System.out.print("\n> ");
        third_question = keyboard.nextInt();

        if (third_question == 2) {
            System.out.println("\n That's correct");
            counter++;
        } else {
            System.out.println("\n That's NOT correct");
        }

        System.out.println("\nOverall you got " + counter + " out of 3 correct.");
        System.out.println("That's for playing!");

    }
}
