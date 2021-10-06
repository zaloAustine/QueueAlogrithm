public class Doctor {
   private String name;
   private int averageConsultationTime;

    public Doctor(String name, int waitingTime) {
        this.name = name;
        this.averageConsultationTime = waitingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageConsultationTime() {
        return averageConsultationTime;
    }

    public void setAverageConsultationTime(int averageConsultationTime) {
        this.averageConsultationTime = averageConsultationTime;
    }
}
