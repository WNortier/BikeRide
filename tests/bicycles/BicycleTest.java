package bicycles;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BicycleTest {

    @Test
    public void shouldAccelerate() {
        Bicycle b = new Bicycle();
        b.accelerate();
        assertEquals(5, b.currentSpeed());
    }

    @Test
    public void shouldBrake() {
        Bicycle b = new Bicycle();
        b.accelerate();
        b.brake();
        assertEquals(2, b.currentSpeed());
    }

    @Test
    public void shouldStop() {
        Bicycle b = new Bicycle();
        b.accelerate();
        b.stop();
        assertEquals(0, b.currentSpeed());
    }
}
