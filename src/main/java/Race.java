import java.util.Scanner;

public class Race {
    private String racer = "";
    private int distance = 0;
    Scanner scanner = new Scanner(System.in);

    public void checkRacer(String name, int speed){
        Car car = new Car(name, speed);
        int newDistance = 24 * car.getSpeed();
        if (this.distance < newDistance) {
            this.distance = newDistance;
            this.racer = car.getName();
        }
    }

    public void setRace(String racer) {
        this.racer = racer;
    }

    public String getRace() {
        return racer;
    }
}
