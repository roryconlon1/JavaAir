import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrew> cabinCrews;
    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNumber;
    private String departureAirport;
    private String destinationAirport;
    private String departureTime;

    public Flight(Pilot pilot, PlaneType planeType, String flightNumber, String departureAirport, String destinationAirport, String departureTime) {
        this.pilot = pilot;
        this.cabinCrews = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
    }

    public void addCabinCrew(CabinCrew cabinCrew){
        this.cabinCrews.add(cabinCrew);
    }

    public void addPassengers(Passenger passenger){
        if(this.planeType.getCapacity() > passengers.size()){
        this.passengers.add(passenger);}
    }

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

    public String relayMessage(CabinCrew cabinCrew){
//        return cabinCrew.message();
        if(cabinCrew != null){
            return cabinCrew.message();
        }
        return "Take care of yourself";
    }






}
