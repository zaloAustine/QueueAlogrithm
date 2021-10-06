import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WaitingTime {
    private static HashMap<Doctor,ArrayList<Patient>> queueHashMap;
    private static final ArrayList<Patient> patients = new ArrayList<>();
    private static final ArrayList<Doctor> doctors = new ArrayList<>();

    public static void main(String[] args) {

        doctors.add(new Doctor("doctor 1",3));
        doctors.add(new Doctor("doctor 2",4));
        doctors.add(new Doctor("doctor 3",8));

        System.out.println("Waiting Time" + getWaitingTime(0));
    }


    private static int getWaitingTime(int positionInQueue){
        createQueues();
        loadPatients();
        allocatePatientToDoctors();
        showQueues();
        QueueDetails queueDetails = getPatientWithPosition(positionInQueue);

        if(queueDetails != null){
            int doctorsAverageTime = queueDetails.getDoctor().getAverageConsultationTime();
            ArrayList<Patient> patientsInQue = queueDetails.getPatientArrayList();
            int peopleAhead = patientsInQue.size() - positionInQueue - 1;
           return doctorsAverageTime * peopleAhead;
        }

        return 0;
    }

    private static QueueDetails getPatientWithPosition(int positionInQueue) {
        QueueDetails queueDetails = null;
        if(positionInQueue <= patients.size()-1){
            for (Map.Entry<Doctor, ArrayList<Patient>> set :
                    queueHashMap.entrySet()) {
                if(positionInQueue <= set.getValue().size()-1){
                    if(set.getValue().get(positionInQueue) ==  patients.get(positionInQueue)){
                        Patient patient =  set.getValue().get(positionInQueue);
                        queueDetails = new QueueDetails(patient,set.getValue(),set.getKey());
                    }
                }
            }
        }


        return queueDetails;
    }


    private static void loadPatients(){
        patients.add(new Patient("Patient 1",1));
        patients.add(new Patient("Patient 2",2));
        patients.add(new Patient("Patient 3",3));
        patients.add(new Patient("Patients 4",3));
        patients.add(new Patient("Patient 5",3));
        patients.add(new Patient("Patients 6",3));
        patients.add(new Patient("Patient 7",3));
        patients.add(new Patient("Patients 8",3));
    }

    private static void createQueues(){
        queueHashMap = new HashMap<>();
        for (Doctor doctor : WaitingTime.doctors) {
            queueHashMap.put(doctor, new ArrayList<>());
        }
    }

    private static void showQueues(){
        for (Doctor doc: doctors) {
            System.out.println(doc.getName()+" Queues" + queueHashMap.get(doc).toString());
        }
    }

    private static void allocatePatientToDoctors(){
        int docStart= 0;
        int docEnd = doctors.size()-1;

        for (int i = 0; i < patients.size() ; i++) {
            if(docStart < docEnd){
                addPatientToQueue(doctors.get(docStart),i);
                patients.get(i).setAllocated_doctor(doctors.get(docStart).getName());
                docStart++;
            }else{
                addPatientToQueue(doctors.get(docStart),i);
                patients.get(i).setAllocated_doctor(doctors.get(docStart).getName());
                docStart = 0;
            }
        }
    }

    private static void addPatientToQueue(Doctor doc,int position){
        ArrayList<Patient> arrayList = queueHashMap.get(doc);
        arrayList.add(patients.get(position));
    }
}
