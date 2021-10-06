import java.util.ArrayList;

public class QueueDetails {

    private Patient patient_selected;
    private ArrayList<Patient> patientArrayList;
    private Doctor doctor;

    public QueueDetails(Patient patient_selected, ArrayList<Patient> patientArrayList, Doctor doctor) {
        this.patient_selected = patient_selected;
        this.patientArrayList = patientArrayList;
        this.doctor = doctor;
    }

    public Patient getPatient_selected() {
        return patient_selected;
    }

    public void setPatient_selected(Patient patient_selected) {
        this.patient_selected = patient_selected;
    }

    public ArrayList<Patient> getPatientArrayList() {
        return patientArrayList;
    }

    public void setPatientArrayList(ArrayList<Patient> patientArrayList) {
        this.patientArrayList = patientArrayList;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
