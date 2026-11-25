package vehicles;
public class Car {
    public int cadence;
    public int gear;
    public int speed;
    public Car(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void setSpeed(int newValue) {
        speed = newValue;
    }

    public int getGear() {
        return gear;
    }

    public int getCadence() {
        return cadence;
    }

    public int getSpeed() {
        return speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void park() {
        speed = 0;
        cadence = 0;
        gear = 0;
    }
}