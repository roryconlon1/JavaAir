public class CabinCrew {

    private String name;
    private CabinCrewType cabinCrewType;

    public CabinCrew(String name, CabinCrewType cabinCrewType) {
        this.name = name;
        this.cabinCrewType = cabinCrewType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CabinCrewType getCabinCrewType() {
        return cabinCrewType;
    }

    public void setCabinCrewType(CabinCrewType cabinCrewType) {
        this.cabinCrewType = cabinCrewType;
    }
}
