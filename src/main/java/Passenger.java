public class Passenger {

    private String name;
    private Integer numberOfBags;
    private String flightBooking;
    private Integer seatNumber;

    public Passenger(String name, Integer numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.seatNumber = seatNumber;
        this.flightBooking = flightBooking;

    }

    public String getFlightBooking() {
        return flightBooking;
    }

    public String setFlightBooking(String flightBooking) {
        this.flightBooking = flightBooking;
        return flightBooking;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(Integer numberOfBags) {
        this.numberOfBags = numberOfBags;
    }
}
