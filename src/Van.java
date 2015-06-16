/**
 * Created by robertmilcu on 02/06/15.
 */
public class Van extends VanElements{
    public static void main (String[] args ) {
        VanElements van = new Van();
        van.setMake("Volkswagen");
        van.setModel("Type 2");
        van.setColor("Yellow");
        van.setYear(1969);
        van.setSpeed(145);
        van.setPackage(true);
        van.print();
        System.out.println(van.getMake());
    }
}
