package tests;
import vehicles.*;
import org.junit.*;
import static org.junit.Assert.*;
public class CarTest {
    @Test
    public void test_applyBrake() {
        System.out.println("Test applyBrake method ...");
        Car car = new Car(10, 20, 1);
        assertEquals(1, car.getGear());
        assertEquals(20, car.getSpeed());
        assertEquals(10, car.getCadence());

        car.setGear(2);
        car.setSpeed(30);
        car.setCadence(5);
        assertEquals(2, car.getGear());
        assertEquals(30, car.getSpeed());
        assertEquals(5, car.getCadence());
        car.applyBrake(10);
        assertEquals(20, car.getSpeed());
    }

    @Test
    public void test_speedUp() {
        System.out.println("Test speedUp method ...");
        Car car = new Car(10, 20, 1);
        car.setSpeed(30);
        car.speedUp(5);
        assertEquals(35, car.getSpeed());
    }

    @Test
    public void test_park() {
        System.out.println("Test park method ...");
        Car car = new Car(10, 20, 1);
        car.park();
        assertEquals(0, car.getSpeed());
        assertEquals(0, car.getCadence());
        assertEquals(0, car.getGear());
    }
}