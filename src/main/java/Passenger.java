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



    public int setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
        return 0;
    }

    public String getName() {
        return name;
    }


}
