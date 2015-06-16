/**
 * Created by robertmilcu on 29/05/15.
 */
public class Camion extends Car implements Drive, Weight {

    private float tonnage;

    public Camion() {
        finalBrand = "Volvo";
        finalYear = 2012;

    }

    public void tonnage(){
        this.tonnage = 50000;
        System.out.printf("Tonnage: %.2f" ,tonnage);

    }

    public void speed(){
        finalSpeed = 110;
    }

    public void color(){
        finalColor = "Yellow";
    }

    public void model(){
        finalModel = "Titan";
    }

    public static void main (String[] args) {
        Car carExtension = new Camion();
        Camion camion = new Camion();

        carExtension.color();
        carExtension.model();
        carExtension.speed();
        carExtension.print(finalBrand, finalModel, finalYear, finalColor, finalSpeed);
        camion.tonnage();

    }
}
