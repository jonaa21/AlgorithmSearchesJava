package sr.unasat.queue;

import sr.unasat.entities.Vehicle;

public class PriorityQueueImpl implements PriorityQueue {

    private int maxSize, nItems;
    private Vehicle[] vehicleArray;

    public PriorityQueueImpl(int size){
        maxSize = size;
        vehicleArray = new Vehicle[maxSize];
        nItems = 0;
    }

    @Override
    public void insert(Vehicle vehicle) {

        int j;
        if (nItems == 0){
            vehicleArray[nItems++] = vehicle;
        }
        else {
            for (j = nItems-1; j > 0;j--){
                if (vehicle.getPriorityLevel() < vehicleArray[j].getPriorityLevel()){
                    vehicleArray[j+1] = vehicleArray[j];
                }
                else break;
            }
            vehicleArray[j+1] = vehicle;
            nItems++;
        }
    }

    @Override
    public Vehicle remove() {
        return vehicleArray[--nItems];
    }

    @Override
    public boolean isEmpty() {
        return (nItems == 0);
    }

    @Override
    public boolean isFull() {
        return (nItems == maxSize);
    }

    public static void main(String[] args) {

    }
}
