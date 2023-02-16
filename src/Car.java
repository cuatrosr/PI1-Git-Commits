public class Car {

    private final boolean wheels;
    private final int cylinders;

    public Car(boolean wheels, int cylinders) {
        this.wheels = wheels;
        this.cylinders = cylinders;
    }

    public boolean isWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }
}
