
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n*** Hospital Management System ***");
            System.out.println("1. Add Patient\n2. Remove Patient\n3. List Patients");
            System.out.println("4. Add Doctor\n5. Remove Doctor\n6. List Doctors");
            System.out.println("7. Add Appointment\n8. Remove Appointment\n9. List Appointments");
            System.out.println("0. Exit");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Patient Name: "); String pn = sc.nextLine();
                    System.out.print("Patient Age: "); int pa = sc.nextInt(); sc.nextLine();
                    System.out.print("Ailment: "); String ail = sc.nextLine();
                    int pid = hospital.patients.size() + 1;
                    hospital.addPatient(new Patient(pid, pn, pa, ail));
                    System.out.println("Patient added.");
                    break;
                case 2:
                    System.out.print("Patient ID to remove: "); int rpid = sc.nextInt(); sc.nextLine();
                    hospital.removePatient(rpid); System.out.println("Patient removed.");
                    break;
                case 3:
                    hospital.listPatients(); break;
                case 4:
                    System.out.print("Doctor Name: "); String dn = sc.nextLine();
                    System.out.print("Specialization: "); String ds = sc.nextLine();
                    int did = hospital.doctors.size() + 1;
                    hospital.addDoctor(new Doctor(did, dn, ds));
                    System.out.println("Doctor added.");
                    break;
                case 5:
                    System.out.print("Doctor ID to remove: "); int rdid = sc.nextInt(); sc.nextLine();
                    hospital.removeDoctor(rdid); System.out.println("Doctor removed.");
                    break;
                case 6:
                    hospital.listDoctors(); break;
                case 7:
                    System.out.print("Patient ID: "); int apid = sc.nextInt(); sc.nextLine();
                    System.out.print("Doctor ID: "); int adid = sc.nextInt(); sc.nextLine();
                    System.out.print("Date (YYYY-MM-DD): "); String dt = sc.nextLine();
                    Patient p = hospital.findPatient(apid);
                    Doctor d = hospital.findDoctor(adid);
                    if (p != null && d != null) {
                        int aid = hospital.appointments.size() + 1;
                        hospital.addAppointment(new Appointment(aid, p, d, dt));
                        System.out.println("Appointment scheduled.");
                    } else {
                        System.out.println("Invalid Patient or Doctor ID.");
                    }
                    break;
                case 8:
                    System.out.print("Appointment ID to remove: "); int raid = sc.nextInt(); sc.nextLine();
                    hospital.removeAppointment(raid); System.out.println("Appointment removed.");
                    break;
                case 9:
                    hospital.listAppointments(); break;
                case 0:
                    System.out.println("Goodbye!"); return;
            }
        }
    }
}
