import java.util.Scanner;

/**
 * Created by robertmilcu on 26/05/15.
 */
public class Cannon {

    String soldier;

    public Cannon(String soldier) {
       this.soldier = soldier;
        System.out.println("Soldier " + soldier);
    }


    private void fire() {
        String fire ="fire!";
        System.out.println(fire);
    }

    private String reload() {
        String reloadOutput = "reloading...";
        return reloadOutput;
    }


    private String missfire() {
        return "missfire!";
    }

   /*
    * Modifiers
    * 1.) Public: accessible in other Java classes and everywhere
    * 2.) Protected: accessible only in current class and sub-classes
    * 3.) No Modifier: having access only in current class with special permissions
    * 4.) Private: having access only in the current class
    *
    * Return
    * (Can be any single type)
    * 1.) Void: Nothing is returned
    *
    * Parameters
    * (Can be any single type)
    */

    public static void main (String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String soldier = keyboard.nextLine();
        Cannon objCannon = new Cannon(soldier);
        System.out.println(objCannon.reload());
        System.out.println(objCannon.reload());
        System.out.println(objCannon.reload());
        objCannon.fire();

    }
}
