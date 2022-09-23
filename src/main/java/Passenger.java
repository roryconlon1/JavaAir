public class Passenger {

    private String name;
    private Integer numberOfBags;

    public Passenger(String name, Integer numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
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
