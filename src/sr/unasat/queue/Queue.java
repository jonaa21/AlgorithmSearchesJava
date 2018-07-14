package sr.unasat.queue;

import sr.unasat.entities.Patient;

public interface Queue {

    void insert(Patient patient);

    Patient remove();

    Patient peekFront();

    boolean isEmpty();

    boolean isFull();
}
