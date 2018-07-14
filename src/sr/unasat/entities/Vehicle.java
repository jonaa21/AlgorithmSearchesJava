package sr.unasat.entities;

public class Vehicle {

    private String vehicleType;
    private int priorityLevel;

    public Vehicle(String vehicleType, int priorityLevel) {
        this.vehicleType = vehicleType;
        this.priorityLevel = priorityLevel;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}
