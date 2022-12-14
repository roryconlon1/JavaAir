import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FlightTest {
    Flight flight;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    CabinCrew cabinCrew3;
    Pilot pilot;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    PlaneType plane;

    @Before
    public void before(){
        flight = new Flight(new Pilot("John", "Chief Officer", "BL420"), PlaneType.BOEING737, "BA157", "GLA", "MAN", LocalTime.parse("16:00") );
        cabinCrew1 = new CabinCrew("Jane", CabinCrewType.PURSER);
        cabinCrew2 = new CabinCrew("Paul", CabinCrewType.FLIGHT_ATTENDANT);
        cabinCrew3 = new CabinCrew("Alan", CabinCrewType.FIRST_OFFICER);
        passenger1 = new Passenger("Stephen", 1);
        passenger2 = new Passenger("Alice", 2);
        passenger3 = new Passenger("Ahmed", 3);
        flight.addCabinCrew(cabinCrew1);
        flight.addCabinCrew(cabinCrew2);
        flight.addCabinCrew(cabinCrew3);
    }

    @Test
    public void canAddPassengerIfSpace(){
        flight.addPassengers(passenger2);
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger3);
        assertEquals(2, flight.passengerCount());
    }

    @Test
    public void canGetTOTime(){
        assertEquals(LocalTime.parse("16:00"), flight.getDepartureTime());
    }

    @Test
    public void canReturnAmountOfAvailableSeats(){
        flight.addPassengers(passenger1);
        assertEquals(1, flight.availableSeats());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("I am Chief Officer John your captain today.", flight.pilotMessage());
    }

    @Test
    public void canFindCabinCrew(){
        assertEquals(cabinCrew2, flight.findCabinCrew("Paul"));
    }

    @Test
    public void cabinCrewMessage(){
        assertEquals("This is Paul we're about to hit the North Tower.", flight.relayMessage(cabinCrew2));
    }

    @Test
    public void canUpdateFlightForPassenger(){
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        assertEquals("BA157", flight.getFlightForPassenger(passenger1));
        assertEquals("BA157", flight.getFlightForPassenger(passenger2));
    }

    @Test
    public void cannotUpdatePassengerNotOnFlight(){
        flight.addPassengers(passenger1);
        assertNull(flight.updatePassengerLocation(passenger2));
    }

    @Test
    public void canAddSeatNumber(){
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        assertEquals(1, flight.getSeatNumber(passenger1));
        assertEquals(2, flight.getSeatNumber(passenger2));
    }

    @Test
    public void cantAddSeatNumberIfDoesNotExist(){
        flight.addPassengers(passenger1);
        assertEquals(1, flight.getSeatNumber(passenger1));
        assertEquals(0, flight.getSeatNumber(passenger2));
    }
}
