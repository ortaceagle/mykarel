/**
 * Created by robertmilcu on 26/05/15.
 */
public class Scope {

    //Global Variable
    String globalVariable = "i am a global variable";

    protected String electricity() {
        String scientist = "Tesla";
        return scientist;
    }

    protected String physics() {
        String scientist = "Fenyman";
        return scientist;
    }

    public static void main (String[] args) {

        Scope scopeObject = new Scope();
        String scientistOne = scopeObject.electricity();
        String scientistTwo = scopeObject.physics();
        System.out.println( scientistOne + " is an electrician.");
        System.out.println( scientistTwo + " is a physicist.");
    }


}
