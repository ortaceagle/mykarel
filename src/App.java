
class Robot {

    public void speak(String text) {
        System.out.println(text);
    }

    public void jump(int height) {
        System.out.println("Jumping: " + height);
    }

    public void move(String direction, double distance){
        System.out.println("Moving " + distance + " meters in direction " + direction);
    }
}

public class App {

    public static void main(String[] args) {
        Robot robert = new Robot();

        robert.speak("Hi I'm Robert");
        robert.jump(7);
        robert.move("West", 12.2);


        String greeting = "hello there";
        robert.speak(greeting);


        int value = 14;
        robert.jump(value);

    }
}
