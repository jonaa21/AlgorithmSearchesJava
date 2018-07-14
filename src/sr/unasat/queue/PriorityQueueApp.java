package sr.unasat.queue;

import sr.unasat.entities.Vehicle;

public class PriorityQueueApp {

    public static void main(String[] args) {

        PriorityQueueImpl priorityQueue = new PriorityQueueImpl(4);

        priorityQueue.insert(new Vehicle("Teana", 1));
        priorityQueue.insert(new Vehicle("Ambulance", 2));
        priorityQueue.insert(new Vehicle("Politie", 4));
        priorityQueue.insert(new Vehicle("Brandweer", 3));

        while (!priorityQueue.isEmpty()){
            Vehicle vehicle = priorityQueue.remove();
            System.out.println(vehicle.getVehicleType());
        }
    }
}
