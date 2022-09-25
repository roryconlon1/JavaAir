public enum PlaneType {
    BOEING747(3, 100),
    AIRBUSA380(4, 110),
    BOEING737(2, 120),
    BOEING787(5, 130),
    AIRBUSA320(1, 140);

    private Integer capacity;
    private Integer totalWeight;

    PlaneType(Integer capacity, Integer totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Integer totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int bagWeight(){
        return (this.totalWeight/2)/this.getCapacity();
    }


}
