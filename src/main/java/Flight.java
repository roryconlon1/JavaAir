import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrew> cabinCrews;
    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNumber;
    private String departureAirport;
    private String destinationAirport;
    private LocalTime departureTime;

    public Flight(Pilot pilot, PlaneType planeType, String flightNumber, String departureAirport, String destinationAirport, LocalTime departureTime) {
        this.pilot = pilot;
        this.cabinCrews = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void addCabinCrew(CabinCrew cabinCrew){
        this.cabinCrews.add(cabinCrew);
    }

//    public void addPassengers(Passenger passenger){
//        if(this.planeType.getCapacity() > passengers.size()){
//        this.passengers.add(passenger);}
//        if (this.planeType.getCapacity() > passengers.size()){
//            this.updatePassengerLocation(passenger);
//        }
//        if (this.planeType.getCapacity() > passengers.size()){
//            this.updateSeatNumber(passenger);
//        }
//    }


    public String getFlightNumber(Passenger passenger) {
        return flightNumber;
    }

    public void addPassengers(Passenger passenger){
        if(this.planeType.getCapacity() > passengers.size()){
            this.passengers.add(passenger);}
        if (passenger != null){
            this.updatePassengerLocation(passenger);
        }
        if (passenger != null){
            this.updateSeatNumber(passenger);
        }
    }

//    public void addPassengers(Passenger passenger){
//        if(this.planeType.getCapacity() > passengers.size()){
//            this.passengers.add(passenger);}
//        if (this.planeType.getCapacity() > passengers.size()){
//            this.findPassenger(passenger.getName()).setFlightBooking(this.destinationAirport);
//        }
//        if (this.planeType.getCapacity() > passengers.size()){
//            this.findPassenger(passenger.getName()).setSeatNumber(this.passengerCount());
//        }
//    }



    public int passengerCount(){
        return this.passengers.size();
    }

    public int availableSeats(){
        return this.planeType.getCapacity() - passengerCount();
    }

    public String pilotMessage(){
        return pilot.message();
    }

    public CabinCrew findCabinCrew(String name){
        CabinCrew findMember = null;
        for(CabinCrew cabinCrew : this.cabinCrews){
            if (cabinCrew.getName() == name){
                findMember = cabinCrew;}
            }
        return findMember;
    }

    public Passenger findPassenger(String name){
        Passenger findPassenger = null;
        for(Passenger passenger : this.passengers){
            if (passenger.getName() == name){
                findPassenger = passenger;}
            }
        return findPassenger;
    }

    public String relayMessage(CabinCrew cabinCrew){
//        return cabinCrew.message();
        if(cabinCrew != null){
            return cabinCrew.message();
        }
        return "Take care of yourself";
    }

    public String updatePassengerLocation(Passenger passenger){
        if(passengers.contains(passenger)){
        return passenger.setFlightBooking(this.flightNumber);}
        return null;
    }

    public String getFlightForPassenger(Passenger passenger){
        return passenger.getFlightBooking();
    }

    public int getSeatNumber(Passenger passenger){
        if(passengers.contains(passenger)){
            return passenger.getSeatNumber();
        }
        return 0;
    }

    public void updateSeatNumber(Passenger passenger){
        passenger.setSeatNumber(this.passengerCount());
    }






}
