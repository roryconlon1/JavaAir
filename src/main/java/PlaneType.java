public enum PlaneType {
    BOEING747(3, 5000),
    AIRBUSA380(4, 6000),
    BOEING737(2, 7000),
    BOEING787(5, 8000),
    AIRBUSA320(1, 9000);

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
}
