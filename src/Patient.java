public class Patient {

    private String name;
    private int timeTakenInConsultation;
    private int positingInQueue;
    private String allocated_doctor;

    public String getAllocated_doctor() {
        return allocated_doctor;
    }

    public void setAllocated_doctor(String allocated_doctor) {
        this.allocated_doctor = allocated_doctor;
    }

    public Patient(String name, int timeTakenInConsultation) {
        this.name = name;
        this.timeTakenInConsultation = timeTakenInConsultation;
    }

    public int getTimeTakenInConsultation() {
        return timeTakenInConsultation;
    }

    public void setTimeTakenInConsultation(int timeTakenInConsultation) {
        this.timeTakenInConsultation = timeTakenInConsultation;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPositingInQueue() {
        return positingInQueue;
    }

    public void setPositingInQueue(int positingInQueue) {
        this.positingInQueue = positingInQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
