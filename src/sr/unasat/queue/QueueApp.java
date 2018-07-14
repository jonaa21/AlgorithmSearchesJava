package sr.unasat.queue;

import sr.unasat.entities.Patient;

public class QueueApp {

    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl(3);

        queue.insert(new Patient("Oldenstam", "Jonathan"));
        queue.insert(new Patient("Pawiro", "Mitchel"));
        queue.insert(new Patient("Dipo", "Romario"));

        while(!queue.isEmpty()){
            Patient patient = queue.remove();
            System.out.println(patient.getFullname());
        }
    }
}
