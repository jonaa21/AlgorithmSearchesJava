package sr.unasat.queue;

import sr.unasat.entities.Patient;

public class QueueImpl implements Queue{

    private int front, rear, maxSize, nItems;
    private Patient[] patientArray;

    public QueueImpl(int s) {
        maxSize = s;
        front = 0;
        rear = -1;
        patientArray = new Patient[maxSize];
        nItems = 0;
    }

    @Override
    public void insert(Patient patient) {

        if(rear == maxSize-1){
            rear = -1;
        }
        patientArray[++rear] = patient;
        nItems++;
    }

    @Override
    public Patient remove() {

        Patient temp = patientArray[front++];
        if (front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }

    @Override
    public Patient peekFront() {
        return patientArray[front++];
    }

    @Override
    public boolean isEmpty() {
        return (nItems == 0);
    }

    @Override
    public boolean isFull() {
        return (nItems == maxSize);
    }

}

