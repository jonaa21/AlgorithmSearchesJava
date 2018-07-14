package sr.unasat.queue;

import sr.unasat.entities.Vehicle;

public interface PriorityQueue {

    void insert(Vehicle vehicle);

    Vehicle remove();

    boolean isEmpty();

    boolean isFull();
}
