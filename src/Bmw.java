/**
 * Created by robertmilcu on 29/05/15.
 */
public class Bmw extends Car {

    public Bmw(){
        finalBrand = "BMW";
        finalYear = 2015;
    }

    public void speed() {
        finalSpeed = 235;
    }

    public void color() {
        finalColor = "red";
    }

    public void model() {
        finalModel = "3-Series";
    }

    public static void main (String[] args) {
        Car bmw = new Bmw();
        bmw.speed();
        bmw.color();
        bmw.model();
        bmw.print(finalBrand, finalModel, finalYear, finalColor, finalSpeed);

    }
}
