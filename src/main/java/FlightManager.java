import java.util.ArrayList;

public class FlightManager {
    private PlaneType plane;
    private ArrayList<Passenger> passengers;

    public FlightManager(PlaneType plane) {
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
    }

    public PlaneType getPlane() {
        return plane;
    }

    public void setPlane(PlaneType plane) {
        this.plane = plane;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int weightOfBags(){
        return plane.bagWeight();
    }

    public void addPassengers(Passenger passenger){
        if(this.plane.getCapacity() > passengers.size()){
            this.passengers.add(passenger);}
    }

    public int weightPerPassenger(){
        return this.weightOfBags() * passengers.size();
    }

    public int remainingWeight(){
        return (plane.getTotalWeight()/2) - (passengers.size() * this.weightOfBags());
    }
}
