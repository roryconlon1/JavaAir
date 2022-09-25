import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    FlightManager flightManager;
    PlaneType plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        flightManager = new FlightManager(PlaneType.BOEING737);
        passenger1 = new Passenger("John", 1);
        passenger2 = new Passenger("Ian", 2);
        passenger3 = new Passenger("Jane", 0);
    }

    @Test
    public void baggageWeightForEachCustomer(){
        assertEquals(30, flightManager.weightOfBags());
    }

    @Test
    public void howMuchBaggageWeightPerCustomer(){
        flightManager.addPassengers(passenger1);
        flightManager.addPassengers(passenger2);
        flightManager.addPassengers(passenger3);
        assertEquals(2, flightManager.getPassengers().size());
        assertEquals(60, flightManager.weightPerPassenger());
    }

    @Test
    public void howMuchBaggageWeightRemainsStartsAt0(){
        assertEquals(60, flightManager.remainingWeight());
    }

    @Test
    public void howMuchBaggageWeightRemainsWhenFull(){
        flightManager.addPassengers(passenger1);
        flightManager.addPassengers(passenger2);
        flightManager.addPassengers(passenger3);
        assertEquals(0, flightManager.remainingWeight());
    }
}
