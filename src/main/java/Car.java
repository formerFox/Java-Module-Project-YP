public class Car {
    private String name = "";
    private int speed = 0;

    Car(String name, int speed){
            this.name = name;
            this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
