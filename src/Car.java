/**
 * Created by robertmilcu on 29/05/15.
 */
public class Car implements Drive {

    protected static String finalColor = "";
    protected static String finalBrand = "";
    protected static String finalModel = "";
    protected static int finalYear;
    protected static int finalSpeed;

    public Car (){
        finalBrand = "Mercedes";
        finalYear = 2015;
    }

    public static void main (String[] args) {
        Car mercedes = new Car();
        mercedes.speed();
        mercedes.color();
        mercedes.model();
        mercedes.print(finalBrand, finalModel, finalYear, finalColor, finalSpeed);
    }



    @Override
    public void speed() {
        finalSpeed = 220;

    }

    @Override
    public void color() {
        finalColor = "Black";

    }

    @Override
    public void model() {
        finalModel = "C-Class";

    }

    @Override
    public void print(String brand, String model, int year, String color, int topSpeed) {
        System.out.printf("Brand: %s\n"
                + "Model: %s\n"
                + "Year: %d\n"
                + "Color: %s\n"
                + "Top Speed: %d km/h\n",
                brand, model, year, color, topSpeed);


    }
}
