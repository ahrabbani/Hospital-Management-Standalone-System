import java.util.*;

public class Hospital {
    List<Patient> patients = new ArrayList<>();
    List<Doctor> doctors = new ArrayList<>();
    List<Appointment> appointments = new ArrayList<>();

    public void addPatient(Patient p) { patients.add(p); }
    public void removePatient(int id) { patients.removeIf(p -> p.getId() == id); }
    public void listPatients() { for (Patient p : patients) System.out.println(p); }
    public Patient findPatient(int id) {
        for (Patient p : patients) if (p.getId() == id) return p;
        return null;
    }

    public void addDoctor(Doctor d) { doctors.add(d); }
    public void removeDoctor(int id) { doctors.removeIf(d -> d.getId() == id); }
    public void listDoctors() { for (Doctor d : doctors) System.out.println(d); }
    public Doctor findDoctor(int id) {
        for (Doctor d : doctors) if (d.getId() == id) return d;
        return null;
    }

    public void addAppointment(Appointment a) { appointments.add(a); }
    public void removeAppointment(int id) { appointments.removeIf(a -> a.getId() == id); }
    public void listAppointments() { for (Appointment a : appointments) System.out.println(a); }
}

